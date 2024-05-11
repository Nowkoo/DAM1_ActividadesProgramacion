package U8_interfaces_gráficas.GestionDeEquipos.Model;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Equipo> equipos;
    private static ArrayList<Jugador> jugadores;

    public static ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
