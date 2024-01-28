package U5_POO.T06;

import java.util.ArrayList;

public class HundirLaFlota {
    private static int numTiros;
    private static IA ia;
    private static Tablero tableroIA;
    private static Tablero tableroJugador;
    private static ArrayList<Barco> barcosIA;
    private static ArrayList<Barco> barcosJugador;
    private static String resultadoTurnoJugador, resultadoTurnoIA;
    public static void main(String[] args) {
        int playerInput = 1;
        while(playerInput != 2) {
            System.out.println(Ansi.WHITE + "¡Bienvendo a Hundir la flota!" + Ansi.RESET);
            System.out.println("1- Empezar a jugar");
            System.out.println("2- Salir del juego");
            playerInput = InterfazUsuario.inputNumerico();

            if (playerInput == 1) {
                play();
            } else if (playerInput == 2) {
                break;
            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        }
    }

    public static void play() {
        numTiros = 0;
        inicializarTableroIA();
        inicializarTableroJugador();
        ia = new IA(tableroJugador);
        mostrarTableros();

        while(!comprobarFinPartida()) {
            turnoJugador();
            turnoIA();
            System.out.println("Resultado de tu tirada: " + resultadoTurnoJugador);
            System.out.println("Resultado tirada IA: " + resultadoTurnoIA);
        }
        mostrarEstadisticas();
        if(InterfazUsuario.volverAJugar())
            play();
    }

    public static void inicializarTableroIA() {
        barcosIA = new ArrayList<>();
        barcosIA.add(new Barco(2));
        barcosIA.add(new Barco(3));
        barcosIA.add(new Barco(3));
        barcosIA.add(new Barco(4));
        tableroIA = new Tablero(8, 8, barcosIA);
        tableroIA.rellenarBarcosIA();
    }

    public static void inicializarTableroJugador() {
        barcosJugador = new ArrayList<>();
        barcosJugador.add(new Barco(2));
        barcosJugador.add(new Barco(3));
        barcosJugador.add(new Barco(3));
        barcosJugador.add(new Barco(4));
        tableroJugador = new Tablero(8, 8, barcosJugador);
        //tableroJugador.rellenarBarcosJugador();
        tableroJugador.rellenarBarcosIA();
    }

    public static void turnoJugador() {
        boolean jugadaInvalida;
        do {
            jugadaInvalida = false;
            try {
                System.out.println("\nPreparando cañones...");
                int fila = InterfazUsuario.inputFila();
                int columna = InterfazUsuario.inputColumna();
                resultadoTurnoJugador = tableroIA.tiro(fila, columna);
                numTiros++;
            } catch (Exception e) {
                System.out.println(Ansi.RED + "\nJugada inválida. Prueba otra vez:" + Ansi.RESET);
                jugadaInvalida = true;
            }
        } while (jugadaInvalida);
    }

    public static void turnoIA() {
        Coordenada tiradaIA = ia.tirada();
        resultadoTurnoIA = tableroJugador.tiro(tiradaIA.getFila(), tiradaIA.getColumna());
        System.out.println("El contrincante ha jugado " + tiradaIA.getFila() + tiradaIA.getColumna());
        mostrarTableros();
    }

    public static boolean comprobarFinPartida() {
        return tableroIA.getBarcos().isEmpty() || tableroJugador.getBarcos().isEmpty();
    }

    public static void mostrarGanador() {
        String resultado;
        if (tableroIA.getBarcos().isEmpty())
            resultado = "¡Has ganado!";
        else
            resultado = "Has perdido...";
        System.out.println("Resultado: " + resultado);
    }

    public static void mostrarEstadisticas() {
        System.out.println("\nFIN DE PARTIDA");
        mostrarGanador();
        System.out.println("Número de tiros necesarios: " + numTiros);
    }

    public static void mostrarTableros() {
        System.out.println("\n---- " + Ansi.UNDERLINED + "BARCOS IA" + Ansi.RESET + " ----");
        tableroIA.mostrarTablero(false);
        System.out.println("\n---- " + Ansi.UNDERLINED + "TUS BARCOS" + Ansi.RESET + " ---");
        tableroJugador.mostrarTablero(true);
    }
}
