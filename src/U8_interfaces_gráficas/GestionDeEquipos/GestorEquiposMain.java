package U8_interfaces_gráficas.GestionDeEquipos;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorEquiposMain {
    static java.sql.Connection con = DatabaseConnection.getInstance().getConnection();
    private static Interfaz interfaz;
    private static ArrayList<AltaEquipo> equipos;
    private static ArrayList<AltaJugador> jugadores;
    public static void main(String[] args) {
        interfaz = new Interfaz();
        equipos = new ArrayList<>();
        jugadores = new ArrayList<>();
    }

    public static void altaEquipo(AltaEquipo nuevoEquipo) {
        try {
            Statement st = con.createStatement();
            String sql = "INSERT INTO equipos (nombre, pais_comp, nombre_comp, entrenador) VALUES ('" + nuevoEquipo.getNombreEquipo() + "', '"
                    + nuevoEquipo.getPaisCompeticion() + "', '" + nuevoEquipo.getNombreCompeticion() + "', '"
                    + nuevoEquipo.getEntrenador() + "');";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        };
    }

    public static void altaJugador(AltaJugador nuevoJugador) {
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
        };
        System.out.println("done");
    }
}
