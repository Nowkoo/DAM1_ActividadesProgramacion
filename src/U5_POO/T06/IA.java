package U5_POO.T06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class IA {
    Tablero tablero;
    ArrayList<Coordenada> tiradasPrevias = new ArrayList<>();
    Random random = new Random();

    public IA(Tablero tablero) {
        this.tablero = tablero;
    }

    public Coordenada tirada() {
        Coordenada tiradaIA;
        if (hayTocado()) {
            tiradaIA = intentarHundir();
        } else if (hayHundido()) {
            tiradaIA = evitarZonaSeguridad();
        } else {
            tiradaIA = tiroAleatorio();
        }
        return tiradaIA;
    }

    public boolean hayTocado() {
        return !tablero.getBarcosTocados().isEmpty();
    }

    public boolean hayHundido() {
        return tablero.arrayVacio(tablero.getAreaBarcosHundidos());
    }

    public Coordenada intentarHundir() {
        ArrayList<Coordenada> tiradasCircundantes = tiradasCircundantes();
        for (Coordenada coordenada : tiradasCircundantes) {
            if (tablero.coordenadaRepetida(coordenada, tiradasPrevias) || malaTirada(coordenada)) {
                tiradasCircundantes.remove(coordenada);
            }
        }
        Coordenada tiradaElegida = tiradasCircundantes.get(random.nextInt(tiradasCircundantes.size() - 1));
        return tiradaElegida;
    }

    //AQUÍ!!!!!
    public ArrayList<Coordenada> tiradasCircundantes() {
        ArrayList<Coordenada> tiradasCircundantes = new ArrayList<>();
        for (Barco barco : tablero.getBarcosTocados()) {
            for (Coordenada coordenada : barco.getCoordenadas()) {
                ArrayList<Coordenada> areaCoordenada = tablero.generarAreaCoordenada(coordenada);
                tablero.añadirCoordenadasAlArray(areaCoordenada, tiradasCircundantes);
            }
        }
        return tiradasCircundantes();
    }

    public Coordenada evitarZonaSeguridad() {
        Coordenada tirada;
        do {
            tirada = tiroAleatorio();
        } while (malaTirada(tirada));
        return tirada;
    }

    public boolean malaTirada(Coordenada coordenada) {
        return tablero.coordenadaRepetida(coordenada, tablero.getAreaBarcosHundidos());
    }

    public Coordenada tiroAleatorio() {
        Coordenada tirada;
        do {
            int fila = random.nextInt(tablero.getNumFilas());
            int columna = random.nextInt(tablero.getNumColumnas());
            tirada = new Coordenada(fila, columna);
        } while (tablero.coordenadaRepetida(tirada, tiradasPrevias) && tablero.excedeTablero(tirada));
        return tirada;
    }
}
