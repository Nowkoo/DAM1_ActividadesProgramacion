package U5_POO.T06;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IA {
    Tablero tablero;
    ArrayList<Coordenada> tiradasPrevias = new ArrayList<>();

    public IA(Tablero tablero) {
        this.tablero = tablero;
    }

    public void tirada() {
        Coordenada tiradaIA;
        if (hayTocado()) {
            tiradaIA = intentarHundir();
        } else if (hayHundido()) {
            tiradaIA = evitarZonaSeguridad();
        } else {
            tiradaIA = tiroAleatorio();
        }
        tablero.tiro(tiradaIA.getFila(), tiradaIA.getColumna());
        tiradasPrevias.add(tiradaIA);
    }

    public boolean hayTocado() {
        return tablero.arrayVacio(tablero.getBarcosTocados());
    }

    public boolean hayHundido() {
        return tablero.arrayVacio(tablero.getAreaBarcosHundidos());
    }

    public Coordenada intentarHundir() {

    }

    public Coordenada evitarZonaSeguridad() {

    }

    public Coordenada tiroAleatorio() {

    }
}
