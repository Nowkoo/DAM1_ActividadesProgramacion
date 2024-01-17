package U5_POO.T05;

public class Barco {
    private int fila;
    private int columna;
    private boolean hundido;

    public Barco(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        hundido = false;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getColumna() {
        return columna;
    }
}
