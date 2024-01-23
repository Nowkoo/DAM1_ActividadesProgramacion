package U5_POO.T06;

import U5_POO.T05.HundirLaFlota;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    private char[][] tablero;
    private Barco[] barcos;
    private ArrayList<Coordenada> posicionesOcupadas = new ArrayList<>();
    private int numFilas;
    private int numColumnas;
    private Random random = new Random();

    public Tablero(int numFilas, int numColumnas, Barco[] barcos) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.barcos = barcos;
        generarTablero();
        rellenarBarcos();
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
            for (Coordenada c : b.getCoordenadas()) {
                if (tablero[c.getFila()][c.getColumna()] != 'X') {
                    tablero[c.getFila()][c.getColumna()] = 'B';
                }
            }
        }
    }

    public void tiro(int fila, int columna) {
        boolean tocado = false;
        String resultado = "Has fallado.";

        for (Barco b : barcos) {
            for (Coordenada c : b.getCoordenadas()) {
                if (c.getFila() == fila && c.getColumna() == columna) {
                    b.getCoordenadas().remove(b);
                    resultado = "¡Hundido!";
                    tocado = true;
                    break;
                }
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
    public void rellenarBarcos() {
        for (int i = 0; i < barcos.length; i++) {
            do {
                rellenarBarco(barcos[i], orientacion(), incremento());
            } while (barcoInvalido(barcos[i]));
            generarAreaBarco(barcos[i]);
        }
    }

    public void rellenarBarco(Barco barco, int orientacion, int incremento) {
        barco.getCoordenadas()[0] = new Coordenada(random.nextInt(numFilas), random.nextInt(numColumnas));
        for (int i = 1; i < barco.getLongitud(); i++) {
            if (orientacion == 0) {
                barco.getCoordenadas()[i] = new Coordenada(barco.getCoordenadas()[i - 1].getFila() + incremento, barco.getCoordenadas()[i - 1].getColumna());
            } else {
                barco.getCoordenadas()[i] = new Coordenada(barco.getCoordenadas()[i - 1].getFila(), barco.getCoordenadas()[i - 1].getColumna() + incremento);
            }
        }
        if (excedeTablero(barco))
            rellenarBarco(barco, orientacion, incremento);
    }

    public boolean excedeTablero(Barco barco) {
        for (Coordenada c : barco.getCoordenadas()) {
            if (c.getFila() > numFilas || c.getColumna() > numColumnas)
                return true;
        }
        return false;
    }

    public int orientacion() {
        return random.nextInt(2);
    }

    public int incremento() {
        int randomNum = random.nextInt(2);
        if (randomNum == 0)
            return -1;
        else
            return 1;
    }

    public void generarAreaBarco(Barco barco) {
        ArrayList<Coordenada> areaCoordenada = new ArrayList<>();
        for (Coordenada coordenadaBarco : barco.getCoordenadas()) {
            areaCoordenada = generarAreaCoordenada(coordenadaBarco);
            añadirACoordenadasOcupadas(areaCoordenada);
        }
    }

    public ArrayList<Coordenada> generarAreaCoordenada(Coordenada coordenadaBarco) {
        ArrayList<Coordenada> areaCoordenada = new ArrayList<>();
        for (int i = coordenadaBarco.getFila() - 1; i < 3; i++) {
            for (int j = coordenadaBarco.getColumna() - 1; i < 3; i++) {
                areaCoordenada.add(new Coordenada(i, j));
            }
        }
        return areaCoordenada;
    }

    public void añadirACoordenadasOcupadas(ArrayList<Coordenada> nuevasCoordenadas) {
        for (Coordenada coordenada : nuevasCoordenadas) {
            if(!coordenadaRepetida(coordenada) && !excedeTablero(coordenada)) {
                posicionesOcupadas.add(coordenada);
            }
        }
    }

    public boolean coordenadaRepetida(Coordenada c) {
        boolean repetida = false;
        for (Coordenada cOcupada : posicionesOcupadas) {
            if (cOcupada.getFila() == c.getFila() && cOcupada.getColumna() == c.getColumna())
                repetida = true;
        }
        return repetida;
    }

    public boolean excedeTablero(Coordenada coordenada) {
        if (coordenada.getFila() > numFilas || coordenada.getColumna() > numColumnas)
            return true;
        return false;
    }

    public boolean barcoInvalido(Barco barco) {
        for (Coordenada coordenadaBarco : barco.getCoordenadas()) {
            if (coordenadaRepetida(coordenadaBarco))
                return true;
        }
        return false;
    }
}
