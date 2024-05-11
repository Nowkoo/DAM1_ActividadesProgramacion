package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaModificarJugadores;

import javax.swing.*;

public class CtrlModificarJugadores {
    private static VistaModificarJugadores modificarJugadores;

    public CtrlModificarJugadores(VistaModificarJugadores modificarJugadores) {
        this.modificarJugadores = modificarJugadores;
    }

    public static JPanel getModificarJugadores() { return modificarJugadores; }
}
