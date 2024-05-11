package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaModificarEquipos;

import javax.swing.*;

public class CtrlModificarEquipos {
    private static VistaModificarEquipos modificarEquipos;

    public CtrlModificarEquipos(VistaModificarEquipos modificarEquipos) {
        this.modificarEquipos = modificarEquipos;
    }

    public static JPanel getModificarEquipos() { return modificarEquipos; }
}
