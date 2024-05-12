package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.Model.DatabaseConnection;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OperacionesBBDD {
    static java.sql.Connection con = DatabaseConnection.getInstance().getConnection();

    public static void altaEquipo(Equipo nuevoEquipo) {
        try {
            Statement st = con.createStatement();
            String sql = "INSERT INTO equipos (nombre, pais_comp, nombre_comp, entrenador) VALUES ('" + nuevoEquipo.getNombreEquipo() + "', '"
                    + nuevoEquipo.getPaisCompeticion() + "', '" + nuevoEquipo.getNombreCompeticion() + "', '"
                    + nuevoEquipo.getEntrenador() + "');";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void altaJugador(Jugador nuevoJugador) {
        try {
            Statement st = con.createStatement();
            String sql = "INSERT INTO jugadores (demarcacion, nombre, fecha_nac, altura, dorsal, club) " +
                    "VALUES ('" + nuevoJugador.getDemarcacion() + "', '" + nuevoJugador.getNombre() + "', '"
                    + nuevoJugador.getFechaNacimiento() + "', " + nuevoJugador.getAltura() + ", "
                    + nuevoJugador.getDorsal() + ", '" + nuevoJugador.getClub() + "');";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("done");
    }

    public static void modificarEquipo(int id, Equipo equipo) {

    }

    public static void modificarJugador(int id, Jugador jugador) {

    }

    public static void borrarEquipo(int id) {

    }

    public static void borrarJugador(int id) {

    }

    public static void cargarDatosEquipos(ArrayList<Equipo> equipos) {

    }

    public static void cargarDatosJugadores(ArrayList<Jugador> jugadores) {

    }
}
