package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.VistaConsultaEquipos;

public class CtrlConsultaEquipos {
    private static VistaConsultaEquipos consultaEquipos;

    public CtrlConsultaEquipos(VistaConsultaEquipos consultaEquipos) {
        this.consultaEquipos = consultaEquipos;
    }

    public static VistaConsultaEquipos getConsultaEquipos() {
        return consultaEquipos;
    }
}
