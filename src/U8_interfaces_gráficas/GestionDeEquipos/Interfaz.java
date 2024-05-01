package U8_interfaces_gráficas.GestionDeEquipos;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    public Interfaz() {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("Gestión de equipos");
        myApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MainFrame extends JFrame {
    public MainFrame() {
        this.setBounds(300,300,600,350);
        MainPanel myPanel = new MainPanel();
        this.add(myPanel);
        this.setVisible(true);
    }
}

class MainPanel extends JPanel {
    private PanelEquipos panelEquipos;
    private PanelJugadores panelJugadores;
    public MainPanel() {
        this.setLayout(new BorderLayout());
        JMenuBar menu = crearMenu();
        add(menu, BorderLayout.NORTH);

        panelEquipos = new PanelEquipos();
        panelJugadores = new PanelJugadores();
    }

    private JMenuBar crearMenu() {
        JMenuBar myBar = new JMenuBar();
        JMenu menu = new JMenu("Menú");
        JMenuItem altaEquipos = new JMenuItem("Alta equipos");
        JMenuItem altaJugadores = new JMenuItem("Alta jugadores");

        altaJugadores.addActionListener(e -> cambiarDePanel(panelEquipos, panelJugadores));
        altaEquipos.addActionListener(e -> cambiarDePanel(panelJugadores, panelEquipos));

        menu.add(altaEquipos);
        menu.add(altaJugadores);
        myBar.add(menu);

        return myBar;
    }

    private void cambiarDePanel(JPanel oldPanel, JPanel newPanel) {
        remove(oldPanel);
        add(newPanel, BorderLayout.CENTER);
        newPanel.revalidate();
        newPanel.repaint();
    }
}
