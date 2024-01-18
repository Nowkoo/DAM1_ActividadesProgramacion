package U5_POO.T06;

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
        Tablero tablero = new Tablero(8, 8, 10);

        while(!tablero.comprobarFinPartida()) {
            tablero.mostrarTablero(false);
            try {
                System.out.println("--Realiza tu tirada--");
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
