package U5_POO.T05;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    ArrayList<String> tablero;
    ArrayList<Barco> barcos;
    int numFilas;
    int numColumnas;
    Random random = new Random();

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
        boolean tocado = false;
        String resultado = "Has fallado.";
        InterfazUsuario ui = new InterfazUsuario();
        fila = ui.inputFila();
        columna = ui.inputColumna();

        for (Barco b : barcos) {
            if (b.fila == fila && b.columna == columna) {
                barcos.remove(b);
                resultado = "¡Hundido!";
            }
            break;
        }
        System.out.println(resultado);
    }

    public void actualizarTablero(int fila, int columna, boolean tocado) {
        if (tocado) {
            String tirada = tablero.get(fila - 1);
            for (int i = 0; i < columna; i++) {

            }
        }
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
            barcos.add(new Barco(random.nextInt(numFilas), random.nextInt(numColumnas)));
        }
    }
}
