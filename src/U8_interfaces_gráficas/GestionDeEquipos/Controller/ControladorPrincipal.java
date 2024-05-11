package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import U8_interfaces_gráficas.GestionDeEquipos.View.*;

import javax.swing.*;
import java.awt.*;

public class ControladorPrincipal {
    static JPanel panelActivo;
    static JPanel panelPadre;
    private static int idiomaActual = 0;

    public ControladorPrincipal(JPanel panelActivo, JPanel panelPadre) {
        this.panelActivo = panelActivo;
        this.panelPadre = panelPadre;
    }
    public static void cambiarDePanel(JPanel newPanel) {
        panelPadre.remove(panelActivo);
        panelPadre.add(newPanel, BorderLayout.CENTER);
        newPanel.revalidate();
        newPanel.repaint();
        panelActivo = newPanel;
    }

    public static int getIdiomaActual() {
        return idiomaActual;
    }
}
