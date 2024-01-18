package U5_POO.T06;

import U5_POO.T05.HundirLaFlota;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    private char[][] tablero;
    private ArrayList<Barco> barcos;
    private int numFilas;
    private int numColumnas;
    private Random random = new Random();

    public Tablero(int numFilas, int numColumnas, int numBarcos) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        generarTablero();
        generarBarcos(numBarcos);
    }
    public void mostrarEstadisticas() {
        System.out.println("\nFIN DE PARTIDA");
        System.out.println("--Estadísticas--");
        System.out.println("Número de tiros necesarios: " + HundirLaFlota.getNumTiros());
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
        else if (tablero[fila][columna] != 'X')
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
    public void generarArrayBarcos(int numBarcos) {
        barcos = new ArrayList<>();
        for (int i = 0; i < numBarcos; i++) {
            barcos.add(generarBarco());
        }
    }

    public Barco generarBarco() {
        Coordenada inicio = new Coordenada(random.nextInt(numFilas), random.nextInt(numColumnas));

        return new Barco();
    }

    public boolean CoordenadaRepetida (Coordenada coord) {
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
