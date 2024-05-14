package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.*;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class VistaConsultaEquipos extends JPanel {
    ArrayList<Equipo> equipos = Datos.getEquipos();
    private static String nombreEquipo;
    private static String paisCompeticion;
    private static String nombreCompeticion;
    private static String entrenador;
    private static String botonConsulta;
    private static String botonAlta;
    private static String botonModificar;
    private static String id;

    private static DefaultTableModel modelo;
    private JTable tabla;

    public VistaConsultaEquipos(int numIdioma) {
        cargarLabels(numIdioma);
        this.setName("Consulta equipos");
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
        modelo.setColumnIdentifiers(new String[] {id, nombreEquipo, paisCompeticion, nombreCompeticion, entrenador});
        tabla = new JTable(modelo);

        for (Equipo equipo : equipos) {
            Object[] fila = new Object[] {equipo.getId(), equipo.getNombreEquipo(), equipo.getPaisCompeticion(), equipo.getNombreCompeticion(), equipo.getEntrenador()};
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
        alta.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlAltaEquipos.getAltaEquipos()));
        menuLateral.add(alta);
        JButton modificar = crearBotonMenu(botonModificar);
        modificar.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlModificarEquipos.getModificarEquipos()));
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
        nombreEquipo = idioma.getProperty("nombreEquipo");
        paisCompeticion = idioma.getProperty("paisCompeticion");
        nombreCompeticion = idioma.getProperty("nombreCompeticion");
        entrenador = idioma.getProperty("entrenador");
        botonConsulta = idioma.getProperty("botonConsulta");
        botonAlta = idioma.getProperty("botonAlta");
        botonModificar = idioma.getProperty("modificar");
        id = idioma.getProperty("id");
    }

    public static DefaultTableModel getModelo() {
        return modelo;
    }
}
