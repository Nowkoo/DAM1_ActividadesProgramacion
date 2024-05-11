package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaAltaJugadores;

public class CtrlRegistroJugadores {
    private static VistaAltaJugadores registroJugadores;
    public CtrlRegistroJugadores(VistaAltaJugadores registroJugadores) {
        this.registroJugadores = registroJugadores;
    }

    public static VistaAltaJugadores getRegistroJugadores() {
        return registroJugadores;
    }

    public void setRegistroJugadores(VistaAltaJugadores registroJugadores) {
        this.registroJugadores = registroJugadores;
    }
}
