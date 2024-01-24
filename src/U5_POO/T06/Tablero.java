package U5_POO.T06;

import U5_POO.T05.HundirLaFlota;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    private char[][] tablero;
    private ArrayList<Barco> barcos;
    private ArrayList<Coordenada> posicionesOcupadas = new ArrayList<>();
    private int numFilas;
    private int numColumnas;

    private String[] resultados = {"Has fallado.", "Tocado...", "¡Hundido!"};
    private Random random = new Random();

    public Tablero(int numFilas, int numColumnas, ArrayList<Barco> barcos) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.barcos = barcos;
        generarTablero();
        rellenarBarcos();
    }

    public Tablero() {
        //Tablero para pruebas
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
        String resultado = comprobarBarcos(fila, columna);
        actualizarTablero(fila, columna, resultado);
        System.out.println(resultado);
    }

    public String comprobarBarcos(int fila, int columna) {
        String resultado = resultados[0];
        for (Barco barco : barcos) {
            for (Coordenada coordenada : barco.getCoordenadas()) {
                boolean coordenadasCoinciden = coordenada.getFila() == fila && coordenada.getColumna() == columna;
                if (coordenadasCoinciden) {
                    barco.getCoordenadas().remove(coordenada);
                    resultado = resultados[1];
                    break;
                }
            }
            if (arrayVacio(barco.getCoordenadas())) {
                barcos.remove(barco);
                resultado = resultados[2];
                break;
            }
        }
        return resultado;
    }

    public void actualizarTablero(int fila, int columna, String resultado) {
        boolean haFallado = resultado.equals(resultados[0]);
        if (haFallado)
            tablero[fila][columna] = 'O';
        else
            tablero[fila][columna] = 'X';
    }

    public boolean arrayVacio(ArrayList array) {
        return array.size() == 0;
    }

    public boolean comprobarFinPartida() {
        return arrayVacio(barcos);
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
        for (Barco barco : barcos) {
            do {
                rellenarBarco(barco, orientacion(), incremento());
            } while (barcoInvalido(barco));
            generarAreaBarco(barco);
        }
    }

    public void rellenarBarco(Barco barco, int orientacion, int incremento) {
        do {
            barco.setCoordenadas(new ArrayList<Coordenada>());
            barco.getCoordenadas().add(new Coordenada(random.nextInt(numFilas), random.nextInt(numColumnas)));
            for (int i = 1; i < barco.getLongitud(); i++) {
                int fila = barco.getCoordenadas().get(i - 1).getFila();
                int columna = barco.getCoordenadas().get(i - 1).getColumna();
                if (orientacion == 0) {
                    barco.getCoordenadas().add(new Coordenada(fila + incremento, columna));
                } else {
                    barco.getCoordenadas().add(new Coordenada(fila, columna + incremento));
                }
            }
        } while (excedeTablero(barco));
    }

    public boolean excedeTablero(Barco barco) {
        for (Coordenada c : barco.getCoordenadas()) {
            boolean esDemasiadoGrande = c.getFila() > numFilas || c.getColumna() > numColumnas;
            boolean esDemasiadoPequeño = c.getFila() < 0 || c.getColumna() < 0;
            if (esDemasiadoGrande || esDemasiadoPequeño)
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
        ArrayList<Coordenada> areaCoordenada;
        for (Coordenada coordenadaBarco : barco.getCoordenadas()) {
            areaCoordenada = generarAreaCoordenada(coordenadaBarco);
            añadirACoordenadasOcupadas(areaCoordenada);
        }
    }

    public ArrayList<Coordenada> generarAreaCoordenada(Coordenada coordenadaBarco) {
        ArrayList<Coordenada> areaCoordenada = new ArrayList<>();
        int fila = coordenadaBarco.getFila() - 1;
        int columna = coordenadaBarco.getColumna() - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                areaCoordenada.add(new Coordenada(fila, columna));
                columna++;
            }
            columna = coordenadaBarco.getColumna() - 1;
            fila++;
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

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

    public ArrayList<Coordenada> getPosicionesOcupadas() {
        return posicionesOcupadas;
    }

    public void setPosicionesOcupadas(ArrayList<Coordenada> posicionesOcupadas) {
        this.posicionesOcupadas = posicionesOcupadas;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public String[] getResultados() {
        return resultados;
    }

    public void setResultados(String[] resultados) {
        this.resultados = resultados;
    }
}
