package U8_interfaces_gráficas.GestionDeEquipos.Model;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Equipo> equipos = new ArrayList<>();
    private static ArrayList<Jugador> jugadores = new ArrayList<>();

    public static ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
