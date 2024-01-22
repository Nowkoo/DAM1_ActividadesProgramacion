package U5_POO.T06;

public class Barco {
    private int longitud;
    private Coordenada[] coordenadas;

    public Barco(int longitud) {
        this.longitud = longitud;
    }

    public Coordenada[] getCoordenadas() {
        return coordenadas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setCoordenadas(Coordenada[] coordenadas) {
        this.coordenadas = coordenadas;
    }
}
