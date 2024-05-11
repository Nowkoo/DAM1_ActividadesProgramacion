package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.ControladorPrincipal;
import U8_interfaces_gráficas.GestionDeEquipos.Controller.CtrlConsultaJugadores;
import U8_interfaces_gráficas.GestionDeEquipos.Controller.CtrlRegistroJugadores;
import U8_interfaces_gráficas.GestionDeEquipos.Controller.GestorEquiposMain;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VistaConsultaJugadores extends JPanel {
    private static String demarcacion;
    private static String nombre;
    private static String fechaNacimiento;
    private static String altura;
    private static String dorsal;
    private static String club;
    private static String botonRegistro;
    private static String botonConsulta;
    private static String botonAlta;
    private Map<String, JTextField> textFields;

    public VistaConsultaJugadores(int numIdioma) {
        this.setName("Consulta jugadores");

        cargarLabels(numIdioma);
        textFields = new HashMap<>();
        setLayout(new BorderLayout());  // Modificado para usar BorderLayout
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new BoxLayout(panelDatos, BoxLayout.Y_AXIS));
        panelDatos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        crearTextFields(panelDatos);
        crearBotonAltas(panelDatos);

        JPanel menuLateral = new JPanel();
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(150, 100));

        JButton consulta = crearBotonMenu(botonConsulta);
        consulta.setEnabled(false);
        menuLateral.add(consulta);
        JButton alta = crearBotonMenu(botonAlta);
        alta.addActionListener(e -> ControladorPrincipal.cambiarDePanel(CtrlRegistroJugadores.getRegistroJugadores()));
        menuLateral.add(alta);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuLateral, new JScrollPane(panelDatos));
        splitPane.setDividerLocation(150);
        add(splitPane, BorderLayout.CENTER);
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
        nombre = idioma.getProperty("nombreJugador");
        fechaNacimiento = idioma.getProperty("fechaNacimiento");
        altura = idioma.getProperty("altura");
        dorsal = idioma.getProperty("dorsal");
        club = idioma.getProperty("club");
        botonRegistro = idioma.getProperty("botonRegistro");
        botonAlta = idioma.getProperty("botonAlta");
        botonConsulta = idioma.getProperty("botonConsulta");
    }

    private void crearBotonAltas(JPanel panel) {
        JButton botonAlta = new JButton(botonRegistro);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        botonAlta.addActionListener(e -> procesarAlta());
        panel.add(botonAlta);
    }

    private void procesarAlta() {
        for (String label : textFields.keySet()) {
            if (textFields.get(label).getText().isEmpty()) return;
        }
        altaJugador();
        vaciarTextFields();
    }

    private void altaJugador() {
        Jugador nuevoJugador = new Jugador(
                textFields.get(demarcacion).getText(),
                textFields.get(nombre).getText(),
                textFields.get(fechaNacimiento).getText(),
                textFields.get(altura).getText(),
                textFields.get(dorsal).getText(),
                textFields.get(club).getText()
        );
        GestorEquiposMain.altaJugador(nuevoJugador);
    }

    private void vaciarTextFields() {
        for (String label : textFields.keySet()) {
            textFields.get(label).setText("");
        }
    }

    private void crearTextFields(JPanel panel) {
        Dimension labelSize = new Dimension(180, 30);
        Dimension fieldSize = new Dimension(250, 30);
        String[] labels = {demarcacion, nombre, fechaNacimiento, altura, dorsal, club};

        for (String textoLabel : labels) {
            JPanel fila = new JPanel();
            fila.setLayout(new BoxLayout(fila, BoxLayout.X_AXIS));
            fila.setAlignmentX(Component.LEFT_ALIGNMENT);

            JLabel label = new JLabel(textoLabel);
            label.setMinimumSize(labelSize);
            label.setPreferredSize(labelSize);
            label.setMaximumSize(labelSize);

            JTextField field = new JTextField();
            field.setMinimumSize(fieldSize);
            field.setPreferredSize(fieldSize);
            field.setMaximumSize(fieldSize);

            fila.add(label);
            fila.add(Box.createRigidArea(new Dimension(5, 0)));
            fila.add(field);

            panel.add(fila);
            panel.add(Box.createRigidArea(new Dimension(0, 5)));

            textFields.put(textoLabel, field);
        }
    }
}
