package U8_interfaces_gráficas.GestionDeEquipos.Controller;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ControladorInterfaz {
    static JPanel panelActivo;
    static JPanel panelPadre;
    private static int idiomaActual = 0;

    public ControladorInterfaz(JPanel panelActivo, JPanel panelPadre) {
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

    public static void vaciarTextFields(Map<String, JTextField> textFields) {
        for (String label : textFields.keySet()) {
            textFields.get(label).setText("");
        }
    }

    public static int getIdiomaActual() {
        return idiomaActual;
    }
}
