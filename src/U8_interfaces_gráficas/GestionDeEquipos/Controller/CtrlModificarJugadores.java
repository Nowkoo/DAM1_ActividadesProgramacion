package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;
import U8_interfaces_gráficas.GestionDeEquipos.View.VistaModificarJugadores;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Map;

public class CtrlModificarJugadores {
    private static VistaModificarJugadores modificarJugadores;
    private static int idBuscado = -1;

    public CtrlModificarJugadores(VistaModificarJugadores modificarJugadores) {
        this.modificarJugadores = modificarJugadores;
    }

    private static Jugador buscarJugadorPorId(String input) {
        ArrayList<Jugador> jugadores = Datos.getJugadores();
        for (Jugador jugador: jugadores) {
            String id = String.valueOf(jugador.getId());
            if (id.equals(input)) {
                idBuscado = jugador.getId();
                return jugador;
            }
        }
        return null;
    }

    public static void mostrarJugador(Map<String, JTextField> textFields, String input) {
        Jugador jugador = buscarJugadorPorId(input);
        if (jugador != null) {
            String[] contenido = new String[] {jugador.getDemarcacion(), jugador.getNombre(), jugador.getFechaNacimiento(), jugador.getAltura(), jugador.getDorsal(), jugador.getClub()};
            int i = 0;
            for (JTextField textField : textFields.values()) {
                textField.setText(contenido[i]);
                i++;
            }
        } else if (input.length() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Introduce un ID.");
        } else {
            JOptionPane.showInternalMessageDialog(null, "No existen jugadores con el ID proporcionado.");
        }
    }

    public static void modificarJugador(Jugador jugador) {
        if (idBuscado != -1) {
            OperacionesBBDD.modificarJugador(idBuscado, jugador);
            JOptionPane.showInternalMessageDialog(null, "El jugador ha sido modificado.");
        }
    }

    public static void borrarJugador() {
        if (idBuscado != -1) {
            OperacionesBBDD.borrarJugador(idBuscado);
            JOptionPane.showInternalMessageDialog(null, "El jugador ha sido eliminado.");
        }
    }

    public static JPanel getModificarJugadores() { return modificarJugadores; }
}
