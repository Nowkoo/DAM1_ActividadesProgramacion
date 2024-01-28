package U5_POO.T06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IATest {

    @Test
    void tirada() {
    }

    @Test
    void hayTocado() {
        Tablero tablero = new Tablero();
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco(2));
        tablero.setBarcos(barcos);
        tablero.setNumFilas(8);
        tablero.setNumColumnas(8);
        tablero.rellenarBarcosIA();
        assertEquals(false, tablero.getBarcos().get(0).isTocado());
        tablero.getBarcos().get(0).setTocado(true);
        assertEquals(true, tablero.getBarcos().get(0).isTocado());
    }

    @Test
    void hayHundido() {
    }

    @Test
    void intentarHundir() {
    }

    @Test
    void tiradaInteligente() {
        Barco barcoTocado = new Barco(2);
        barcoTocado.getCoordenadas().add(new Coordenada(1, 1));
    }

    @Test
    void numCasillasTocadas() {
    }

    @Test
    void tiradaEnCruz() {
    }

    @Test
    void tiradaEnLinea() {
    }

    @Test
    void esBarcoHorizontal() {
    }

    @Test
    void tiradaHorizontal() {
    }

    @Test
    void tiradaVertical() {
    }

    @Test
    void evitarZonaSeguridad() {
        Barco barco = new Barco(1);
        Coordenada cordBarco = new Coordenada(0, 0);
        barco.getCoordenadas().add(cordBarco);
        barco.getCoordenadas().add(new Coordenada(0, 1));
        Tablero tablero = new Tablero();
        tablero.setNumColumnas(3);
        tablero.setNumFilas(3);
        tablero.generarAreaBarco(barco, tablero.areaBarcosHundidos);
        IA ia = new IA(tablero);
        System.out.println(ia.evitarZonaSeguridad());
    }

    @Test
    void malaTirada() {
    }

    @Test
    void tiroAleatorio() {
        Tablero tablero = new Tablero();
        tablero.setNumFilas(1);
        tablero.setNumColumnas(1);
        IA ia = new IA(tablero);
        ia.tiradasPrevias.add(new Coordenada(1, 1));
        System.out.println(ia.tiroAleatorio());
    }
}