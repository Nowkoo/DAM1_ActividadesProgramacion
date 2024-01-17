package U5_POO.T05;

public class HundirLaFlota {
    public static void main(String[] args) {
        Tablero tablero = new Tablero(4, 4, 4);
        InterfazUsuario ui = new InterfazUsuario();

        while(!tablero.comprobarFinPartida()) {
            tablero.mostrarTablero(true);
            tablero.tiro(ui.inputFila(), ui.inputColumna());
        }

    }
}
