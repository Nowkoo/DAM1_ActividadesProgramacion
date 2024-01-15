package U5_POO.T05;

import java.util.ArrayList;

public class Tablero {
    ArrayList<String> tablero;
    ArrayList<Barco> barcos;
    int numFilas;
    int numColumnas;

    public Tablero(int numFilas, int numColumnas, int numBarcos) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        generarTablero();
        generarBarcos(numBarcos);
    }
    public void mostrarEstadisticas() {

    }

    public void mostrarTablero(boolean muestraBarcos) {
        for (String t: tablero) {
            System.out.println(t);
        }
    }

    public void tiro(int fila, int columna) {
        InterfazUsuario ui = new InterfazUsuario();
        fila = ui.inputFila();
        columna = ui.inputColumna();
    }

    public void comprobarFinPartida() {

    }

    public void generarTablero() {
        tablero = new ArrayList<>();
        tablero.add(" ");
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (numFilas > letras.length())
            numFilas = letras.length();

        for (int i = 0; i < numColumnas; i++) {
            tablero.set(0, tablero.get(0) + "\t" + (i + 1));
        }

        for (int i = 0; i < numFilas; i++) {
            tablero.add(letras.charAt(i) + "");
            for (int j = 0; j < numColumnas; j++) {
                tablero.set(i, tablero.get(i) + "\t ");
            }
        }
    }

    public void generarBarcos(int numBarcos) {
        barcos = new ArrayList<>();
        for (int i = 0; i < numBarcos; i++) {
            barcos.add(new Barco());
        }
    }
}
