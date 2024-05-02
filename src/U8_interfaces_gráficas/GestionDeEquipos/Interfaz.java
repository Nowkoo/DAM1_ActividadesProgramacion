package U8_interfaces_gráficas.GestionDeEquipos;

import U8_interfaces_gráficas.Ejemplos_MenuBar.Example2.Language;

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
    private static JMenu menu;
    private static JMenuItem altaEquipos;
    private static JMenuItem altaJugadores;
    private static JMenu cambiarIdioma;
    private static JMenuItem espanol;
    private static JMenuItem ingles;
    private static PanelEquipos panelEquipos;
    private static PanelJugadores panelJugadores;
    Idioma idioma = new Idioma(0);
    public MainPanel() {
        this.setLayout(new BorderLayout());
        JMenuBar menu = crearMenu();
        add(menu, BorderLayout.NORTH);

        panelEquipos = new PanelEquipos(0);
        panelJugadores = new PanelJugadores();
    }

    private JMenuBar crearMenu() {
        JMenuBar myBar = new JMenuBar();
        menu = new JMenu(idioma.getProperty("menu"));
        altaEquipos = new JMenuItem(idioma.getProperty("altaEquipos"));
        altaJugadores = new JMenuItem(idioma.getProperty("altaJugadores"));
        cambiarIdioma = new JMenu(idioma.getProperty("cambiarIdioma"));
        espanol = new JMenuItem(idioma.getProperty("espanol"));
        ingles = new JMenuItem(idioma.getProperty("ingles"));

        altaJugadores.addActionListener(e -> cambiarDePanel(panelEquipos, panelJugadores));
        altaEquipos.addActionListener(e -> cambiarDePanel(panelJugadores, panelEquipos));
        espanol.addActionListener(e -> cambiarIdioma(0));
        ingles.addActionListener(e -> cambiarIdioma(1));

        menu.add(altaEquipos);
        menu.add(altaJugadores);
        menu.add(cambiarIdioma);
        cambiarIdioma.add(espanol);
        cambiarIdioma.add(ingles);
        myBar.add(menu);

        return myBar;
    }

    private void cambiarDePanel(JPanel oldPanel, JPanel newPanel) {
        remove(oldPanel);
        add(newPanel, BorderLayout.CENTER);
        newPanel.revalidate();
        newPanel.repaint();
    }

    static void cambiarIdioma(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        menu.setText(idioma.getProperty("menu"));
        altaEquipos.setText(idioma.getProperty("altaEquipos"));
        altaJugadores.setText(idioma.getProperty("altaJugadores"));
        cambiarIdioma.setText(idioma.getProperty("cambiarIdioma"));
        espanol.setText(idioma.getProperty("espanol"));
        ingles.setText(idioma.getProperty("ingles"));
        JPanel oldPanel = panelEquipos;
        panelEquipos = new PanelEquipos(numIdioma);
        cambiarDePanel(oldPanel, panelEquipos);
    }
}
