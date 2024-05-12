package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.*;
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
        this.setBounds(300,300,700,400);
        MainPanel myPanel = new MainPanel();
        this.add(myPanel);
        this.setVisible(true);
    }
}

class MainPanel extends JPanel {
    private static JMenu menu;
    private static JMenuItem gestionarEquipos;
    private static JMenuItem altaJugadores;
    private static JMenu cambiarIdioma;
    private static JMenuItem espanol;
    private static JMenuItem ingles;
    int numIdioma;
    public MainPanel() {
        numIdioma = ControladorInterfaz.getIdiomaActual();
        this.setLayout(new BorderLayout());
        JMenuBar menu = crearMenu();
        add(menu, BorderLayout.NORTH);
        VistaInicio vistaInicio = new VistaInicio(numIdioma);
        add(vistaInicio, BorderLayout.CENTER);

        int idioma = ControladorInterfaz.getIdiomaActual();
        inicializarPaneles(vistaInicio, idioma);
    }

    private void inicializarPaneles(VistaInicio vistaInicio, int idioma) {
        new ControladorInterfaz(vistaInicio, this);
        new CtrlAltaEquipos(new VistaAltaEquipos(idioma));
        new CtrlAltaJugadores(new VistaAltaJugadores(idioma));
        new CtrlConsultaEquipos(new VistaConsultaEquipos(idioma));
        new CtrlConsultaJugadores(new VistaConsultaJugadores(idioma));
        new CtrlModificarEquipos(new VistaModificarEquipos(idioma));
        new CtrlModificarJugadores(new VistaModificarJugadores(idioma));
    }

    private JMenuBar crearMenu() {
        Idioma idioma = new Idioma(numIdioma);
        JMenuBar myBar = new JMenuBar();
        menu = new JMenu(idioma.getProperty("menu"));
        gestionarEquipos = new JMenuItem(idioma.getProperty("gestionarEquipos"));
        altaJugadores = new JMenuItem(idioma.getProperty("gestionarJugadores"));
        cambiarIdioma = new JMenu(idioma.getProperty("cambiarIdioma"));
        espanol = new JMenuItem(idioma.getProperty("espanol"));
        ingles = new JMenuItem(idioma.getProperty("ingles"));

        altaJugadores.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlConsultaJugadores.getConsultaJugadores()));
        gestionarEquipos.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlConsultaEquipos.getConsultaEquipos()));
        espanol.addActionListener(e -> cambiarIdioma(0));
        ingles.addActionListener(e -> cambiarIdioma(1));

        menu.add(gestionarEquipos);
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
        gestionarEquipos.setText(idioma.getProperty("gestionarEquipos"));
        altaJugadores.setText(idioma.getProperty("gestionarJugadores"));
        cambiarIdioma.setText(idioma.getProperty("cambiarIdioma"));
        espanol.setText(idioma.getProperty("espanol"));
        ingles.setText(idioma.getProperty("ingles"));

        new CtrlConsultaEquipos(new VistaConsultaEquipos(numIdioma));
        new CtrlConsultaJugadores(new VistaConsultaJugadores(numIdioma));
        new CtrlAltaEquipos(new VistaAltaEquipos(numIdioma));
        new CtrlAltaJugadores(new VistaAltaJugadores(numIdioma));
        new CtrlModificarEquipos(new VistaModificarEquipos(numIdioma));
        new CtrlModificarJugadores(new VistaModificarJugadores(numIdioma));

        ControladorInterfaz.cambiarDePanel(new VistaInicio(numIdioma));
        revalidate();
        repaint();
    }
}
