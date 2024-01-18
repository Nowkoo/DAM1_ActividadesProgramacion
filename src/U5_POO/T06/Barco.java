package U5_POO.T06;

public class Barco {
    private Coordenada[] coordenadas;

    public Barco(Coordenada[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Coordenada[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenada[] coordenadas) {
        this.coordenadas = coordenadas;
    }
}
