package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.Model.DatabaseConnection;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;

import java.sql.ResultSet;
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

            sql = "SELECT cod_eq FROM equipos WHERE nombre = '" + nuevoEquipo.getNombreEquipo() + "' AND pais_comp = '"
                    + nuevoEquipo.getPaisCompeticion() + "' AND nombre_comp = '" + nuevoEquipo.getNombreCompeticion()
                    + "' AND entrenador = '" + nuevoEquipo.getEntrenador() + "';";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                Equipo equipo = new Equipo(rs.getInt(1), nuevoEquipo.getNombreEquipo(), nuevoEquipo.getPaisCompeticion(), nuevoEquipo.getNombreEquipo(), nuevoEquipo.getEntrenador());
                Datos.getEquipos().add(equipo);
            }

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
    }

    public static void modificarEquipo(int id, Equipo equipo) {
        try {
            Statement st = con.createStatement();
            String sql = "UPDATE equipos SET nombre = '" + equipo.getNombreEquipo() + "', pais_comp = '"
                    + equipo.getPaisCompeticion() + "', nombre_comp = '" + equipo.getNombreCompeticion()
                    + "', entrenador = '" + equipo.getEntrenador() + "' WHERE  cod_eq = " + id + ";";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificarJugador(int id, Jugador jugador) {
        try {
            Statement st = con.createStatement();
            String sql = "UPDATE equipos SET demarcacion = '" + jugador.getDemarcacion() + "', nombre = '"
                    + jugador.getNombre() + "', fecha_nac = '" + jugador.getFechaNacimiento()
                    + "', altura = " + jugador.getAltura() + ", dorsal = " + jugador.getDorsal() + ", club = '"
                    + jugador.getClub() + "' WHERE  cod_jug = " + id + ";";
            st.executeUpdate(sql);

            sql = "SELECT * FROM equipos WHERE cod_eq = " + id + ";";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                Equipo nuevoEquipo = new Equipo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                Datos.getEquipos().add(nuevoEquipo);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void borrarEquipo(int id) {
        try {
            Statement st = con.createStatement();
            String sql = "DELETE FROM equipos WHERE cod_eq = " + id + ";";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void borrarJugador(int id) {
        try {
            Statement st = con.createStatement();
            String sql = "DELETE FROM jugadores WHERE cod_eq = " + id + ";";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void cargarDatosEquipos(ArrayList<Equipo> equipos) {
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM equipos;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Equipo nuevoEquipo = new Equipo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                equipos.add(nuevoEquipo);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("done");
    }

    public static void cargarDatosJugadores(ArrayList<Jugador> jugadores) {
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM jugadores;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Jugador nuevoJugador = new Jugador(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getInt(6), rs.getString(7));
                Datos.getJugadores().add(nuevoJugador);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("done");
    }
}
