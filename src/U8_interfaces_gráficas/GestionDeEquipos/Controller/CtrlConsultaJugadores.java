package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaConsultaEquipos;
import U8_interfaces_gráficas.GestionDeEquipos.View.VistaConsultaJugadores;

import javax.swing.*;

public class CtrlConsultaJugadores {
    private static VistaConsultaJugadores consultaJugadores;

    public CtrlConsultaJugadores(VistaConsultaJugadores consultaJugadores) {
        this.consultaJugadores = consultaJugadores;
    }

    public static void actualizarPanel() {
        consultaJugadores = new VistaConsultaJugadores(ControladorInterfaz.getIdiomaActual());
    }

    public static JPanel getConsultaJugadores() {
        return consultaJugadores;
    }
}
