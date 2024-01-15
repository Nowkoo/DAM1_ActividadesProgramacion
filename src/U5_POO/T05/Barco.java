package U5_POO.T05;

public class Barco {
    int fila;
    int columna;
    boolean hundido;

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
}
