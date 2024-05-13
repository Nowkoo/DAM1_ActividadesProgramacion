package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.View.VistaAltaEquipos;
import U8_interfaces_gráficas.GestionDeEquipos.View.VistaConsultaEquipos;

import javax.swing.*;
import java.util.Map;

public class CtrlAltaEquipos {
    private static VistaAltaEquipos altaEquipos;

    public CtrlAltaEquipos(VistaAltaEquipos altaEquipos) {
        this.altaEquipos = altaEquipos;
    }

    public static void procesarAlta(Map<String, JTextField> textFields) {
        for (String label : textFields.keySet()) {
            if (textFields.get(label).getText().isEmpty()) return;
        }
        Equipo nuevoEquipo = VistaAltaEquipos.recogerDatos();
        OperacionesBBDD.altaEquipo(nuevoEquipo);
        ControladorInterfaz.vaciarTextFields(textFields);
        CtrlConsultaEquipos.actualizarPanel();
    }

    public static VistaAltaEquipos getAltaEquipos() {
        return altaEquipos;
    }
}
