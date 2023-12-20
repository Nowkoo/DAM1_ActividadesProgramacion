package U5_POO.T02;

import java.util.ArrayList;

public class Mudanza {
    private int id;
    private int distancia;
    private Camion camion;
    private ArrayList<Bulto> bultos;

    public Mudanza(int id, int distancia, Camion camion, ArrayList<Bulto> bultos) {
        this.id = id;
        this.distancia = distancia;
        this.camion = camion;
        this.bultos = bultos;
    }

    public int coste() {
        int precioTotal = costeCarga() + costeDistancia();
        return precioTotal;
    }

    public int costeCarga() {
        int coste = 0;
        for (Bulto bulto : bultos) {
            if (bulto.getTipo().equals("FRÁGIL")) {
                coste += (bulto.getPeso() * 4);
            } else {
                coste += bulto.getPeso();
            }
        }
        return coste;
    }

    public int costeDistancia() {
        int coste = numeroViajes() * distancia * 2;
        return coste;
    }

    public int numeroViajes() {
        int volumenCargado = 0;
        int pesoCargado = 0;
        for (Bulto bulto : bultos) {
            volumenCargado += bulto.getVolumen();
            pesoCargado += bulto.getPeso();

        }
        return 0;
    }
}
