package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaAltaEquipos;

public class CtrlAltaEquipos {
    private static VistaAltaEquipos altaEquipos;

    public CtrlAltaEquipos(VistaAltaEquipos altaEquipos) {
        this.altaEquipos = altaEquipos;
    }

    public static VistaAltaEquipos getAltaEquipos() {
        return altaEquipos;
    }
}
