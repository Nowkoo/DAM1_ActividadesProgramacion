package U5_POO.T06;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    @Test
    void mostrarEstadisticas() {
    }

    @Test
    void mostrarTablero() {
    }

    @Test
    void mostrarBarcos() {
    }

    @Test
    void tiro() {
    }

    @Test
    void comprobarBarcos() {
    }

    @Test
    void actualizarTablero() {
    }

    @Test
    void arrayVacio() {
    }

    @Test
    void comprobarFinPartida() {
    }

    @Test
    void generarTablero() {
    }

    @Test
    void rellenarBarcos() {
    }

    @Test
    void rellenarBarco() {
        Barco barcoPrueba = new Barco(4);
        int orientacion = 1;
        int incremento = 1;
        Tablero tablero = new Tablero();
        tablero.setNumFilas(8);
        tablero.setNumColumnas(8);
        tablero.rellenarBarcoIA(barcoPrueba, orientacion, incremento);
        System.out.println(barcoPrueba);
        boolean isEmpty = barcoPrueba.getCoordenadas().size() != 0;
        assertEquals(false, !isEmpty);
    }

    @Test
    void excedeTablero() {
    }

    @Test
    void generarAreaBarco() {
        ArrayList<Coordenada> areaBarco = new ArrayList<>();
        Tablero tablero = new Tablero();
        tablero.setNumFilas(8);
        tablero.setNumColumnas(8);
        Barco barcoPrueba = new Barco(1);
        barcoPrueba.getCoordenadas().add(new Coordenada(1, 1));
        barcoPrueba.getCoordenadas().add(new Coordenada(1, 2));
        tablero.generarAreaBarco(barcoPrueba, areaBarco);
        for (Coordenada coordenadaArea : areaBarco) {
            System.out.println(coordenadaArea);
        }
    }

    @Test
    void generarAreaCoordenada() {
        Coordenada coordenada = new Coordenada(1, 1);
        Tablero tablero = new Tablero();
        for (Coordenada coordenadaArea : tablero.generarAreaCoordenada(coordenada)) {
            System.out.println(coordenadaArea);
        }
    }

    @Test
    void añadirACoordenadasOcupadas() {
    }

    @Test
    void coordenadaRepetida() {
        Tablero tablero = new Tablero();
        tablero.setNumColumnas(8);
        tablero.setNumFilas(8);
        Coordenada coordenada = new Coordenada(2, 1);
        ArrayList<Coordenada> coordenadas = new ArrayList<>();
        coordenadas.add(coordenada);
        boolean repetida = tablero.coordenadaRepetida(new Coordenada (1, 1), coordenadas);
        assertEquals(false, repetida);
    }

    @Test
    void testExcedeTablero() {
        Tablero tablero = new Tablero();
        tablero.setNumColumnas(8);
        tablero.setNumFilas(8);

        Barco barcoPrueba = new Barco(1);
        barcoPrueba.getCoordenadas().add(new Coordenada(1, 1));
        assertEquals(false, tablero.excedeTablero(barcoPrueba));

        barcoPrueba.getCoordenadas().set(0, new Coordenada(10, 10));
        assertEquals(true, tablero.excedeTablero(barcoPrueba));

        barcoPrueba.getCoordenadas().set(0, new Coordenada(-1, -1));
        assertEquals(true, tablero.excedeTablero(barcoPrueba));
    }

    @Test
    void barcoInvalido() {
        Barco barcoPrueba = new Barco(1);
        Coordenada coordenada = new Coordenada(1, 1);
        barcoPrueba.getCoordenadas().add(coordenada);
        Tablero tablero = new Tablero();
        assertEquals(false, tablero.barcoInvalido(barcoPrueba));
        tablero.getPosicionesOcupadas().add(coordenada);
        assertEquals(true, tablero.barcoInvalido(barcoPrueba));
    }
}