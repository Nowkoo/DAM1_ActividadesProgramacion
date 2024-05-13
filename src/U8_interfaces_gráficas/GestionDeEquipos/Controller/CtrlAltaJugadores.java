package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;
import U8_interfaces_gráficas.GestionDeEquipos.View.VistaAltaJugadores;

import javax.swing.*;
import java.util.Map;

public class CtrlAltaJugadores {
    private static VistaAltaJugadores altaJugadores;
    public CtrlAltaJugadores(VistaAltaJugadores altaJugadores) {
        this.altaJugadores = altaJugadores;
    }

    public static void procesarAlta(Map<String, JTextField> textFields) {
        for (String label : textFields.keySet()) {
            if (textFields.get(label).getText().isEmpty()) return;
        }
        Jugador nuevoJugador = VistaAltaJugadores.recogerDatos();
        OperacionesBBDD.altaJugador(nuevoJugador);
        ControladorInterfaz.vaciarTextFields(textFields);
        CtrlConsultaJugadores.actualizarPanel();
    }

    public static JPanel getAltaJugadores() {
        return altaJugadores;
    }
}
