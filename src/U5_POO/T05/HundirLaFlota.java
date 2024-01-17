package U5_POO.T05;

public class HundirLaFlota {
    private static int numTiros;
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

    public static int getNumTiros() {
        return numTiros;
    }

    public static void play() {
        numTiros = 0;
        Tablero tablero = new Tablero(4, 4, 4);

        while(!tablero.comprobarFinPartida()) {
            tablero.mostrarTablero(true);
            try {
                int fila = InterfazUsuario.inputFila();
                int columna = InterfazUsuario.inputColumna();
                tablero.tiro(fila, columna);
                numTiros++;
            } catch (Exception e) {
                System.out.println("Jugada inválida. Prueba otra vez: \n");
            }
        }
        tablero.mostrarEstadisticas();
        if(InterfazUsuario.volverAJugar())
            play();
    }
}
