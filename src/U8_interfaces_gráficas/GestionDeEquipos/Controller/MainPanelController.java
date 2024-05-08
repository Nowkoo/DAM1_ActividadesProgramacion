package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import javax.swing.*;
import java.awt.*;

public class MainPanelController {
    public static void cambiarDePanel(JPanel panelPrincipal, JPanel oldPanel, JPanel newPanel) {
        panelPrincipal.remove(oldPanel);
        panelPrincipal.add(newPanel, BorderLayout.CENTER);
        newPanel.revalidate();
        newPanel.repaint();
    }
}
