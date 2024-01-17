package U5_POO.T05;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    char[][] tablero;
    ArrayList<Barco> barcos;
    int numFilas;
    int numColumnas;
    Random random = new Random();

    public Tablero(int numFilas, int numColumnas, int numBarcos) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        generarTablero();
        generarBarcos(numBarcos);

        for (Barco b : barcos) {
            System.out.println("filaBarco: " + b.getFila() + ", columnaBarco: " + b.getColumna());
        }
    }
    public void mostrarEstadisticas() {

    }

    public void mostrarTablero(boolean muestraBarcos) {
        if(muestraBarcos)
            mostrarBarcos();

        System.out.print(" \t");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(letras.charAt(i) + "\t");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarBarcos() {
        for (Barco b : barcos) {
            if (tablero[b.getFila()][b.getColumna()] != 'X') {
                tablero[b.getFila()][b.getColumna()] = 'B';
            }
        }
    }

    public void tiro(int fila, int columna) {
        boolean tocado = false;
        String resultado = "Has fallado.";

        for (Barco b : barcos) {
            if (b.getFila() == fila && b.getColumna() == columna) {
                barcos.remove(b);
                resultado = "¡Hundido!";
                tocado = true;
                break;
            }
        }

        if (tocado)
            tablero[fila][columna] = 'X';
        else
            tablero[fila][columna] = 'O';

        System.out.println(resultado);
    }

    public boolean comprobarFinPartida() {
        return barcos.isEmpty();
    }

    public void generarTablero() {
        tablero = new char[numFilas][numColumnas];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public void generarBarcos(int numBarcos) {
        barcos = new ArrayList<>();
        for (int i = 0; i < numBarcos; i++) {
            barcos.add(new Barco(random.nextInt(numFilas), random.nextInt(numColumnas)));
            while (barcoRepetido(barcos.get(i))) {
                barcos.get(i).setFila(random.nextInt(numFilas));
                barcos.get(i).setColumna(random.nextInt(numColumnas));
            }
        }
    }

    public boolean barcoRepetido (Barco barco) {
        boolean repetido = false;
        for (Barco b : barcos) {
            if (barco == b)
                break;
            else if (barco.getFila() == b.getFila() && barco.getColumna() == b.getColumna())
                repetido = true;
        }
        return repetido;
    }
}
