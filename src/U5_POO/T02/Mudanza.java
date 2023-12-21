package U5_POO.T02;

import java.util.ArrayList;

public class Mudanza {
    private int id;
    private int distancia;
    private Camion camion;
    private ArrayList<Bulto> bultos;

    Exception noCabe = new Exception();

    public Mudanza(int id, int distancia, Camion camion, ArrayList<Bulto> bultos) {
        this.id = id;
        this.distancia = distancia;
        this.camion = camion;
        this.bultos = bultos;
    }

    public int coste() throws Exception {
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

    public int costeDistancia() throws Exception {
        int coste = numeroViajes() * distancia * 2;
        return coste;
    }

    public int numeroViajes() throws Exception {
        int viajes = 1;
        int volumenCargado = 0;
        int pesoCargado = 0;
        for (Bulto bulto : bultos) {
            int volumenPreCargado = volumenCargado + bulto.getVolumen();
            int pesoPreCargado = pesoCargado + bulto.getPeso();
            if (volumenPreCargado > camion.getVolumen() || pesoPreCargado > camion.getPeso()) {
                viajes++;
                if (bulto.getVolumen() > camion.getVolumen() | bulto.getPeso() > camion.getPeso()) {
                    throw noCabe;
                } else {
                    volumenCargado = bulto.getVolumen();
                    pesoCargado = bulto.getPeso();
                }

            } else{
                volumenCargado += bulto.getVolumen();
                pesoCargado += bulto.getPeso();
            }
        }
        return viajes;
    }
}
