package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.*;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Equipo;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VistaModificarEquipos extends JPanel {
    ArrayList<Equipo> equipos = Datos.getEquipos();
    private static String nombreEquipo;
    private static String paisCompeticion;
    private static String nombreCompeticion;
    private static String entrenador;
    private static String botonRegistro;
    private static String botonConsulta;
    private static String botonModificar;
    private static String botonAlta;

    private Map<String, JTextField> textFields;

    public VistaModificarEquipos(int numIdioma) {
        cargarLabels(numIdioma);
        textFields = new HashMap<>();
        this.setName("Alta equipos");
        setLayout(new BorderLayout());

        JPanel panelDatos = crearPanelDatos();
        JPanel menuLateral = crearMenuLateral();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuLateral, panelDatos);
        splitPane.setDividerLocation(150);

        add(splitPane, BorderLayout.CENTER);
    }

    private JPanel crearPanelDatos() {
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new BoxLayout(panelDatos, BoxLayout.Y_AXIS));
        panelDatos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        crearTextFields(panelDatos);
        crearBotonAltas(panelDatos);
        return panelDatos;
    }

    private JPanel crearMenuLateral() {
        JPanel menuLateral = new JPanel();
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(150, 100));

        JButton consulta = crearBotonMenu(botonConsulta);
        consulta.addActionListener(e -> ControladorPrincipal.cambiarDePanel(CtrlConsultaEquipos.getConsultaEquipos()));
        menuLateral.add(consulta);
        JButton alta = crearBotonMenu(botonAlta);
        alta.addActionListener(e -> ControladorPrincipal.cambiarDePanel(CtrlAltaEquipos.getAltaEquipos()));
        menuLateral.add(alta);
        JButton modificar = crearBotonMenu(botonModificar);
        modificar.setEnabled(false);
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
        botonRegistro = idioma.getProperty("botonRegistro");
        botonConsulta = idioma.getProperty("botonConsulta");
        botonAlta = idioma.getProperty("botonAlta");
        botonConsulta = idioma.getProperty("botonConsulta");
        botonModificar = idioma.getProperty("modificar");
    }

    private void crearBotonAltas(JPanel panel) {
        JButton botonAlta = new JButton(botonRegistro);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        botonAlta.addActionListener((e) -> {
            procesarAlta();
        });
        panel.add(botonAlta);
    }

    private void procesarAlta() {
        for (String label : textFields.keySet()) {
            if (textFields.get(label).getText().isEmpty()) return;
        }
        altaEquipo();
        vaciarTextFields();
    }

    private void altaEquipo() {
        Equipo nuevoEquipo = new Equipo(
                textFields.get(nombreEquipo).getText(),
                textFields.get(paisCompeticion).getText(),
                textFields.get(nombreCompeticion).getText(),
                textFields.get(entrenador).getText()
        );
        GestorEquiposMain.altaEquipo(nuevoEquipo);
    }

    private void vaciarTextFields() {
        for (String label : textFields.keySet()) {
            textFields.get(label).setText("");
        }
    }

    private void crearTextFields(JPanel panel) {
        Dimension labelSize = new Dimension(180, 30);
        Dimension fieldSize = new Dimension(250, 30);
        String[] labels = new String[] {
                nombreEquipo,
                paisCompeticion,
                nombreCompeticion,
                entrenador
        };

        for (String textoLabel : labels) {
            crearTextField(textoLabel, labelSize, fieldSize, panel);
        }
    }

    private void crearTextField(String textoLabel, Dimension labelSize, Dimension fieldSize, JPanel panel) {
        JPanel fila = new JPanel();
        fila.setLayout(new BoxLayout(fila, BoxLayout.X_AXIS));
        fila.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel newLabel = new JLabel(textoLabel);
        newLabel.setMinimumSize(labelSize);
        newLabel.setMaximumSize(labelSize);

        JTextField newField = new JTextField();
        newField.setMinimumSize(fieldSize);
        newField.setMaximumSize(fieldSize);

        fila.add(newLabel);
        fila.add(Box.createRigidArea(new Dimension(5, 0)));
        fila.add(newField);

        panel.add(fila);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));

        textFields.put(newLabel.getText(), newField);
    }
}
