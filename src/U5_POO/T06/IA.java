package U5_POO.T06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class IA {
    Tablero tablero;
    ArrayList<Coordenada> tiradasPrevias = new ArrayList<>();
    Coordenada primeraCoordenadaTocada;
    boolean hayCoordenadaTocada = false;
    Barco barcoTocado;
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
        tiradasPrevias.add(tiradaIA);
        return tiradaIA;
    }

    public boolean hayTocado() {
        for (Barco barco : tablero.getBarcos()) {
            if (barco.isTocado()) {
                barcoTocado = barco;
                return true;
            }
        }
        return false;
    }

    public boolean hayHundido() {
        return tablero.arrayVacio(tablero.getAreaBarcosHundidos());
    }

    public Coordenada intentarHundir() {
        Coordenada tirada;
        do {
            tirada = evitarZonaSeguridad();
        } while (!tiradaInteligente(tirada));
        return tirada;
    }

    public boolean tiradaInteligente(Coordenada tirada) {
        actualizarCoordenadasTocadas();
        if (numCasillasTocadas(barcoTocado) == 1) {
            return tablero.coordenadaRepetida(tirada, tiradaEnCruz());
        } else {
            return tablero.coordenadaRepetida(tirada, tiradaEnLinea());
        }
    }

    public void actualizarCoordenadasTocadas() {
        if (barcoTocado.getCoordenadas().isEmpty()) {
            hayCoordenadaTocada = false;
        }
        if (numCasillasTocadas(barcoTocado) == 1) {
            if (!hayCoordenadaTocada) {
                primeraCoordenadaTocada = tiradasPrevias.get(tiradasPrevias.size() - 1);
                hayCoordenadaTocada = true;
            }

        }
    }

    public int numCasillasTocadas(Barco barco) {
        return barco.getLongitud() - barco.getCoordenadas().size();
    }

    public ArrayList<Coordenada> tiradaEnCruz() {
        Coordenada tocado = primeraCoordenadaTocada;
        ArrayList<Coordenada> cruz = new ArrayList<>();
        cruz.add(new Coordenada(tocado.getFila() - 1, tocado.getColumna()));
        cruz.add(new Coordenada(tocado.getFila() + 1, tocado.getColumna()));
        cruz.add(new Coordenada(tocado.getFila(), tocado.getColumna() + 1));
        cruz.add(new Coordenada(tocado.getFila(), tocado.getColumna() - 1));
        return cruz;
    }

    public ArrayList<Coordenada> tiradaEnLinea() {
        if (barcoTocado.esHorizontal()) {
            return tiradaHorizontal();
        } else {
            return tiradaVertical();
        }
    }

    public ArrayList<Coordenada> tiradaHorizontal() {
        ArrayList<Coordenada> linea = new ArrayList<>();
        for (Coordenada coordenada : tablero.getCoordenadasTocadas()) {
            linea.add(new Coordenada(coordenada.getFila(), coordenada.getColumna() + 1));
            linea.add(new Coordenada(coordenada.getFila(), coordenada.getColumna() - 1));
        }
        return linea;
    }

    public ArrayList<Coordenada> tiradaVertical() {
        ArrayList<Coordenada> linea = new ArrayList<>();
        for (Coordenada coordenada : tablero.getCoordenadasTocadas()) {
            linea.add(new Coordenada(coordenada.getFila() + 1, coordenada.getColumna()));
            linea.add(new Coordenada(coordenada.getFila() - 1, coordenada.getColumna()));
        }
        return linea;
    }

    public Coordenada evitarZonaSeguridad() {
        Coordenada tirada;
        do {
            tirada = tiroAleatorio();
        } while (tiradaEnArea(tirada));
        return tirada;
    }

    public boolean tiradaEnArea(Coordenada coordenada) {
        return tablero.coordenadaRepetida(coordenada, tablero.getAreaBarcosHundidos());
    }

    public Coordenada tiroAleatorio() {
        Coordenada tirada;
        do {
            int fila = random.nextInt(tablero.getNumFilas());
            int columna = random.nextInt(tablero.getNumColumnas());
            tirada = new Coordenada(fila, columna);
        } while (tablero.coordenadaRepetida(tirada, tiradasPrevias) || tablero.excedeTablero(tirada));
        return tirada;
    }
}
