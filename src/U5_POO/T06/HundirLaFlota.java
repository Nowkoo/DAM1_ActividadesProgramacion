package U5_POO.T06;

import java.util.ArrayList;

public class HundirLaFlota {
    private static int numTiros;
    private static Tablero tableroIA;
    private static Tablero tableroJugador;
    private static ArrayList<Barco> barcosIA;
    private static ArrayList<Barco> barcosJugador;
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
        prepararIA();
        prepararJugador();

        while(comprobarFinPartida()) {
            turnoJugador();
            turnoIA();
        }
        mostrarEstadisticas();
        if(InterfazUsuario.volverAJugar())
            play();
    }

    public static void prepararIA() {
        barcosIA = new ArrayList<>();
        barcosIA.add(new Barco(2));
        barcosIA.add(new Barco(3));
        barcosIA.add(new Barco(3));
        barcosIA.add(new Barco(4));
        tableroIA = new Tablero(8, 8, barcosIA);
        tableroIA.rellenarBarcosIA();
    }

    public static void prepararJugador() {
        barcosJugador = new ArrayList<>();
        barcosJugador.add(new Barco(2));
        barcosJugador.add(new Barco(3));
        barcosJugador.add(new Barco(3));
        barcosJugador.add(new Barco(4));
        tableroJugador = new Tablero(8, 8, barcosJugador);
        tableroJugador.rellenarBarcosJugador();
    }

    public static void turnoJugador() {
        tableroIA.mostrarTablero(true);
        try {
            System.out.println("--Realiza tu tirada--");
            int fila = InterfazUsuario.inputFila();
            int columna = InterfazUsuario.inputColumna();
            tableroIA.tiro(fila, columna);
            numTiros++;
        } catch (Exception e) {
            System.out.println("Jugada inválida. Prueba otra vez: \n");
        }
    }

    public static void turnoIA() {

    }

    public static boolean comprobarFinPartida() {
        return false;
    }

    public static void mostrarEstadisticas() {
        System.out.println("\nFIN DE PARTIDA");
        System.out.println("--Estadísticas--");
        System.out.println("Número de tiros necesarios: " + numTiros);
    }
}
