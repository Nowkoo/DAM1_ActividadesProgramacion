package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import javax.swing.*;
import java.awt.*;

public class ControladorPrincipal {
    static JPanel panelActivo;
    static JPanel panelPadre;

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
}
