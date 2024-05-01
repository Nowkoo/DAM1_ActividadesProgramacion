package U8_interfaces_gráficas.GestionDeEquipos;

import java.util.ArrayList;

public class GestorEquiposMain {
    private static Interfaz interfaz;
    private static ArrayList<AltaEquipo> equipos;
    private static ArrayList<AltaJugador> jugadores;
    public static void main(String[] args) {
        interfaz = new Interfaz();
        equipos = new ArrayList<>();
        jugadores = new ArrayList<>();
    }

    public static void altaEquipo(AltaEquipo nuevoEquipo) {
        equipos.add(nuevoEquipo);
    }

    public static void altaJugador(AltaJugador nuevoJugador) {
        jugadores.add(nuevoJugador);
    }
}
