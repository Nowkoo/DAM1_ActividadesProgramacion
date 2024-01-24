package U5_POO.T06;

import java.util.ArrayList;

public class Barco {
    private int longitud;
    private ArrayList<Coordenada> coordenadas = new ArrayList<>();

    public Barco(int longitud) {
        this.longitud = longitud;
    }

    public ArrayList<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setCoordenadas(ArrayList<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public String toString() {
        String str = "";
        for (Coordenada coordenada : coordenadas) {
            str+= "C: " + coordenada.toString() + " ";
        }
        return str;
    }
}
