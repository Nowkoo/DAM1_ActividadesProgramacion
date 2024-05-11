package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaAltaJugadores;

public class CtrlAltaJugadores {
    private static VistaAltaJugadores altaJugadores;
    public CtrlAltaJugadores(VistaAltaJugadores registroJugadores) {
        this.altaJugadores = registroJugadores;
    }

    public static VistaAltaJugadores getAltaJugadores() {
        return altaJugadores;
    }

}
