package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaAltaEquipos;

public class CtrlRegistroEquipos {
    private static VistaAltaEquipos registroEquipos;

    public CtrlRegistroEquipos(VistaAltaEquipos registroEquipos) {
        this.registroEquipos = registroEquipos;
    }

    public static VistaAltaEquipos getRegistroEquipos() {
        return registroEquipos;
    }

    public void setRegistroEquipos(VistaAltaEquipos registroEquipos) {
        this.registroEquipos = registroEquipos;
    }
}
