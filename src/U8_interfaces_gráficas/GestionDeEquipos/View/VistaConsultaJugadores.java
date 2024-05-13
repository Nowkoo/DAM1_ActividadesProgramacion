package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.*;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class VistaConsultaJugadores extends JPanel {
    ArrayList<Jugador> jugadores = Datos.getJugadores();
    private static String demarcacion;
    private static String nombre;
    private static String fechaNacimiento;
    private static String altura;
    private static String dorsal;
    private static String club;
    private static String botonConsulta;
    private static String botonAlta;
    private static String botonModificar;
    private static String id;
    private DefaultTableModel modelo;
    private JTable tabla;

    public VistaConsultaJugadores(int numIdioma) {
        cargarLabels(numIdioma);
        this.setName("Consulta jugadores");
        setLayout(new BorderLayout());

        JPanel panelDatos = crearPanelDatos();
        JPanel menuLateral = crearMenuLateral();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuLateral, panelDatos);
        splitPane.setDividerLocation(150);
        add(splitPane, BorderLayout.CENTER);
    }

    private JPanel crearPanelDatos() {
        JPanel panelDatos = new JPanel(new BorderLayout());
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {id, demarcacion, nombre, fechaNacimiento, altura, dorsal, club});
        tabla = new JTable(modelo);

        for (Jugador jugador : jugadores) {
            Object[] fila = new Object[] {jugador.getId(), jugador.getDemarcacion(), jugador.getNombre(), jugador.getFechaNacimiento(), jugador.getAltura(), jugador.getDorsal(), jugador.getClub()};
            modelo.addRow(fila);
        }

        JScrollPane scrollPane = new JScrollPane(tabla);
        panelDatos.add(scrollPane, BorderLayout.CENTER);
        panelDatos.setLayout(new BoxLayout(panelDatos, BoxLayout.Y_AXIS));
        panelDatos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        return panelDatos;
    }

    private JPanel crearMenuLateral() {
        JPanel menuLateral = new JPanel();
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(150, 100));

        JButton consulta = crearBotonMenu(botonConsulta);
        consulta.setEnabled(false);
        menuLateral.add(consulta);
        JButton alta = crearBotonMenu(botonAlta);
        alta.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlAltaJugadores.getAltaJugadores()));
        menuLateral.add(alta);
        JButton modificar = crearBotonMenu(botonModificar);
        modificar.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlModificarJugadores.getModificarJugadores()));
        menuLateral.add(modificar);

        return menuLateral;
    }

    private JButton crearBotonMenu(String texto) {
        JButton button = new JButton(texto);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, button.getMaximumSize().height));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        return button;
    }

    private void cargarLabels(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        demarcacion = idioma.getProperty("demarcacion");
        nombre = idioma.getProperty("nombre");
        fechaNacimiento = idioma.getProperty("fechaNacimiento");
        altura = idioma.getProperty("altura");
        dorsal = idioma.getProperty("dorsal");
        club = idioma.getProperty("club");
        botonConsulta = idioma.getProperty("botonConsulta");
        botonAlta = idioma.getProperty("botonAlta");
        botonModificar = idioma.getProperty("modificar");
        id = idioma.getProperty("id");
    }
}
