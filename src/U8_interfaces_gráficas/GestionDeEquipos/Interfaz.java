package U8_interfaces_gráficas.GestionDeEquipos;

import U5_POO.T01.Main;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {

    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("Gestión de equipos");
        myApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MainFrame extends JFrame {
    public MainFrame() {
        this.setBounds(300,300,600,300);
        MainPanel myPanel = new MainPanel();
        this.add(myPanel);
        this.setVisible(true);
    }
}

class MainPanel extends JPanel {
    PanelEquipos panelEquipos;
    PanelJugadores panelJugadores;
    public MainPanel() {
        this.setLayout(new BorderLayout());
        JMenuBar myBar = new JMenuBar();
        JMenu menu = new JMenu("Menú");
        JMenuItem altaEquipos = new JMenuItem("Alta equipos");
        JMenuItem altaJugadores = new JMenuItem("Alta jugadores");
        menu.add(altaEquipos);
        menu.add(altaJugadores);
        myBar.add(menu);

        add(myBar, BorderLayout.NORTH);

        panelEquipos = new PanelEquipos();
        panelJugadores = new PanelJugadores();
        altaEquipos.addActionListener((e) -> {
            remove(panelJugadores);
            add(panelEquipos, BorderLayout.CENTER);
            panelEquipos.revalidate();
            panelEquipos.repaint();
        });
        altaJugadores.addActionListener((e) -> {
            remove(panelEquipos);
            add(panelJugadores, BorderLayout.CENTER);
            panelJugadores.revalidate();
            panelJugadores.repaint();
        });
    }
}
