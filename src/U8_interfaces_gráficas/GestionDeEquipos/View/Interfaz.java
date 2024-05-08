package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.MainPanelController;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;

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
    private static RegistrarEquiposVista registrarEquiposVista;
    private static RegistrarPanelJugadores registrarPanelJugadores;
    Idioma idioma = new Idioma(0);
    public MainPanel() {
        this.setLayout(new BorderLayout());
        JMenuBar menu = crearMenu();
        add(menu, BorderLayout.NORTH);

        registrarEquiposVista = new RegistrarEquiposVista(0);
        registrarPanelJugadores = new RegistrarPanelJugadores(0);
    }

    private JMenuBar crearMenu() {
        JMenuBar myBar = new JMenuBar();
        menu = new JMenu(idioma.getProperty("menu"));
        altaEquipos = new JMenuItem(idioma.getProperty("altaEquipos"));
        altaJugadores = new JMenuItem(idioma.getProperty("altaJugadores"));
        cambiarIdioma = new JMenu(idioma.getProperty("cambiarIdioma"));
        espanol = new JMenuItem(idioma.getProperty("espanol"));
        ingles = new JMenuItem(idioma.getProperty("ingles"));

        altaJugadores.addActionListener(e -> MainPanelController.cambiarDePanel(this, registrarEquiposVista, registrarPanelJugadores));
        altaEquipos.addActionListener(e -> MainPanelController.cambiarDePanel(this, registrarPanelJugadores, registrarEquiposVista));
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

    void cambiarIdioma(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        menu.setText(idioma.getProperty("menu"));
        altaEquipos.setText(idioma.getProperty("altaEquipos"));
        altaJugadores.setText(idioma.getProperty("altaJugadores"));
        cambiarIdioma.setText(idioma.getProperty("cambiarIdioma"));
        espanol.setText(idioma.getProperty("espanol"));
        ingles.setText(idioma.getProperty("ingles"));

        RegistrarEquiposVista newRegistrarEquiposVista = new RegistrarEquiposVista(numIdioma);
        remove(registrarEquiposVista);
        registrarEquiposVista = newRegistrarEquiposVista;

        RegistrarPanelJugadores newRegistrarPanelJugadores = new RegistrarPanelJugadores(numIdioma);
        remove(registrarPanelJugadores);
        registrarPanelJugadores = newRegistrarPanelJugadores;

        revalidate();
        repaint();
    }
}
