package U5_POO.T06;

import U5_POO.T05.HundirLaFlota;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    private char[][] tablero;
    private ArrayList<Barco> barcos;
    ArrayList<Barco> barcosTocados = new ArrayList<>();
    ArrayList<Coordenada> areaBarcosHundidos = new ArrayList<>();
    private ArrayList<Coordenada> posicionesOcupadas = new ArrayList<>();
    private int numFilas;
    private int numColumnas;

    private String[] resultados = {"Agua.", "Tocado...", "¡Hundido!"};
    private Random random = new Random();

    public Tablero(int numFilas, int numColumnas, ArrayList<Barco> barcos) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.barcos = barcos;
        generarTablero();
    }

    public Tablero() {
        //Tablero para pruebas
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

    public String tiro(int fila, int columna) {
        String resultado = comprobarBarcos(fila, columna);
        actualizarTablero(fila, columna, resultado);
        return resultado;
    }

    public String comprobarBarcos(int fila, int columna) {
        String resultado = resultados[0];
        for (Barco barco : barcos) {
            for (Coordenada coordenada : barco.getCoordenadas()) {
                boolean coordenadasCoinciden = coordenada.getFila() == fila && coordenada.getColumna() == columna;
                if (coordenadasCoinciden) {
                    barco.getCoordenadas().remove(coordenada);
                    resultado = resultados[1];
                    barcosTocados.add(barco);
                    break;
                }
            }
            if (arrayVacio(barco.getCoordenadas())) {
                resultado = resultados[2];
                barcos.remove(barco);
                barcosTocados.remove(barco);
                generarAreaBarco(barco, areaBarcosHundidos);
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

    public void generarTablero() {
        tablero = new char[numFilas][numColumnas];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    public void rellenarBarcosIA() {
        for (Barco barco : barcos) {
            do {
                rellenarBarcoIA(barco, orientacion(), incremento());
            } while (barcoInvalido(barco));
            generarAreaBarco(barco, posicionesOcupadas);
        }
    }

    public void rellenarBarcoIA(Barco barco, int orientacion, int incremento) {
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

    public void rellenarBarcosJugador() {
        System.out.println("Primero escoge la posición de tus barcos.");
        for (Barco barco : barcos) {
            boolean barcoLleno;
            do {
                mostrarTablero(true);
                System.out.println("--Estás colocando un barco de " + barco.getLongitud() + " casillas--");
                rellenarCoordenadaJugador(barco);
                barcoLleno = barco.getCoordenadas().size() == barco.getLongitud();
            } while (!barcoLleno);
            generarAreaBarco(barco, posicionesOcupadas);
            System.out.println("¡Barco creado!");
        }
    }

    public void rellenarCoordenadaJugador(Barco barco) {
        Coordenada nuevaCoordenada;
        int i = 0;
        do {
            if (i != 0)
                System.out.println("Posición inválida.");
            int fila = InterfazUsuario.inputFila();
            int columna = InterfazUsuario.inputColumna();
            nuevaCoordenada = new Coordenada(fila, columna);
            i++;
        } while (excedeTablero(nuevaCoordenada) || !esAdyacente(barco, nuevaCoordenada) || posicionOcupada(barco, nuevaCoordenada));
        barco.getCoordenadas().add(nuevaCoordenada);
    }

    public boolean posicionOcupada(Barco barco, Coordenada nuevaCoordenada) {
        for (Coordenada coordenada : barco.getCoordenadas()) {
            boolean perteneceAlBarco = nuevaCoordenada.getFila() == coordenada.getFila() && nuevaCoordenada.getColumna() == coordenada.getColumna();
            if (perteneceAlBarco)
                return true;
        }
        boolean perteneceAOtrosBarcos = coordenadaRepetida(nuevaCoordenada, posicionesOcupadas);
        return perteneceAOtrosBarcos;
    }

    public boolean esAdyacente(Barco barco, Coordenada nuevaCoordenada) {
        if (arrayVacio(barco.getCoordenadas()))
            return true;
        Coordenada ultimaCoordenada = barco.getCoordenadas().get(barco.getCoordenadas().size() - 1);
        boolean mismaFila = nuevaCoordenada.getFila() == ultimaCoordenada.getFila();
        boolean mismaColumna = nuevaCoordenada.getColumna() == ultimaCoordenada.getColumna();
        if (mismaFila) {
            return columnaAdyacente(barco, nuevaCoordenada);
        } else if (mismaColumna) {
            return filaAdyacente(barco, nuevaCoordenada);
        }
        return false;
    }

    public boolean columnaAdyacente(Barco barco, Coordenada nuevaCoordenada) {
        for (Coordenada coordenada : barco.getCoordenadas()) {
            boolean estaDerecha = nuevaCoordenada.getColumna() - 1 == coordenada.getColumna();
            boolean estaIzquierda = nuevaCoordenada.getColumna() + 1 == coordenada.getColumna();
            if (estaDerecha || estaIzquierda)
                return true;
        }
        return false;
    }

    public boolean filaAdyacente(Barco barco, Coordenada nuevaCoordenada) {
        for (Coordenada coordenada: barco.getCoordenadas()) {
            boolean estaAbajo = nuevaCoordenada.getFila() - 1 == coordenada.getFila();
            boolean estaArriba = nuevaCoordenada.getFila() + 1 == coordenada.getFila();
            if (estaArriba || estaAbajo)
                return true;
        }
        return false;
    }

    public boolean excedeTablero(Barco barco) {
        for (Coordenada c : barco.getCoordenadas()) {
            boolean esDemasiadoGrande = c.getFila() > numFilas - 1 || c.getColumna() > numColumnas - 1;
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

    public void generarAreaBarco(Barco barco, ArrayList<Coordenada> almacenAreas) {
        ArrayList<Coordenada> areaCoordenada;
        for (Coordenada coordenadaBarco : barco.getCoordenadas()) {
            areaCoordenada = generarAreaCoordenada(coordenadaBarco);
            añadirCoordenadasAlArray(areaCoordenada, almacenAreas);
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

    public void añadirCoordenadasAlArray(ArrayList<Coordenada> nuevasCoordenadas, ArrayList<Coordenada> almacenAreas) {
        for (Coordenada coordenada : nuevasCoordenadas) {
            if(!coordenadaRepetida(coordenada, almacenAreas) && !excedeTablero(coordenada)) {
                almacenAreas.add(coordenada);
            }
        }
    }

    public boolean coordenadaRepetida(Coordenada coordenada, ArrayList<Coordenada> coordenadasOcupadas) {
        boolean repetida = false;
        for (Coordenada coordenadaOcupada : coordenadasOcupadas) {
            if (coordenadaOcupada.getFila() == coordenada.getFila() && coordenadaOcupada.getColumna() == coordenada.getColumna())
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
            if (coordenadaRepetida(coordenadaBarco, posicionesOcupadas))
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

    public ArrayList<Barco> getBarcosTocados() {
        return barcosTocados;
    }

    public ArrayList<Coordenada> getAreaBarcosHundidos() {
        return areaBarcosHundidos;
    }
}
