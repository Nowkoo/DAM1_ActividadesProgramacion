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
            System.out.println("¡Bienvendo a Hundir la flota!");
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
        try {
            System.out.println("Tu turno");
            int fila = InterfazUsuario.inputFila();
            int columna = InterfazUsuario.inputColumna();
            resultadoTurnoJugador = tableroIA.tiro(fila, columna);
            numTiros++;
        } catch (Exception e) {
            System.out.println("Jugada inválida. Prueba otra vez: \n");
        }
    }

    public static void turnoIA() {
        Coordenada tiradaIA = ia.tirada();
        resultadoTurnoIA = tableroJugador.tiro(tiradaIA.getFila(), tiradaIA.getColumna());
        System.out.println("El contrincante ha jugado " + tiradaIA.getFila() + tiradaIA.getColumna());
        mostrarTableros();
    }

    public static boolean comprobarFinPartida() {
        return false;
    }

    public static void mostrarEstadisticas() {
        System.out.println("\nFIN DE PARTIDA");
        System.out.println("--Estadísticas--");
        System.out.println("Número de tiros necesarios: " + numTiros);
    }

    public static void mostrarTableros() {
        System.out.println("\n----BARCOS IA----");
        tableroIA.mostrarTablero(true);
        System.out.println("\n----TUS BARCOS----");
        tableroJugador.mostrarTablero(true);
    }
}
