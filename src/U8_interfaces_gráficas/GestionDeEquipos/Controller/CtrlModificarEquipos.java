package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.View.VistaModificarEquipos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Map;

public class CtrlModificarEquipos {
    private static VistaModificarEquipos modificarEquipos;
    private static int idBuscado = -1;

    public CtrlModificarEquipos(VistaModificarEquipos modificarEquipos) {
        this.modificarEquipos = modificarEquipos;
    }

    private static Equipo buscarEquipoPorId(String input) {
        ArrayList<Equipo> equipos = Datos.getEquipos();
        for (Equipo equipo: equipos) {
            String id = String.valueOf(equipo.getId());
            if (id.equals(input)) {
                idBuscado = equipo.getId();
                return equipo;
            }
        }
        return null;
    }

    public static void mostrarEquipo(Map<String, JTextField> textFields, String input) {
        Equipo equipo = buscarEquipoPorId(input);
        if (equipo != null) {
            String[] contenido = new String[] {equipo.getNombreEquipo(), equipo.getPaisCompeticion(), equipo.getNombreCompeticion(), equipo.getEntrenador()};
            int i = 0;
            for (JTextField textField : textFields.values()) {

                textField.setText(contenido[i]);
                i++;
            }
        } else if (input.length() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Introduce un ID.");
        } else {
            JOptionPane.showInternalMessageDialog(null, "No existen equipos con el ID proporcionado.");
        }
    }

    public static void modificarEquipo(Equipo equipo) {
        if (idBuscado != -1) {
            OperacionesBBDD.modificarEquipo(idBuscado, equipo);
            JOptionPane.showInternalMessageDialog(null, "El equipo ha sido modificado.");
            CtrlConsultaEquipos.actualizarPanel();
        }
    }

    public static void borrarEquipo() {
        if (idBuscado != -1) {
            OperacionesBBDD.borrarEquipo(idBuscado);
            JOptionPane.showInternalMessageDialog(null, "El equipo ha sido eliminado.");
            CtrlConsultaEquipos.actualizarPanel();
        }
    }

    public static JPanel getModificarEquipos() { return modificarEquipos; }
}
