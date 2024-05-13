package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.*;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Datos;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VistaModificarJugadores extends JPanel {
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
    private static Map<String, JTextField> textFields;

    public VistaModificarJugadores(int numIdioma) {
        this.setName("Modificar jugadores");
        cargarLabels(numIdioma);
        textFields = new HashMap<>();
        setLayout(new BorderLayout());

        JPanel panelDatos = crearPanelDatos(numIdioma);
        JPanel menuLateral = crearMenuLateral();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuLateral, new JScrollPane(panelDatos));
        splitPane.setDividerLocation(150);
        add(splitPane, BorderLayout.CENTER);
    }

    public JPanel crearPanelId(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        JPanel panelId = new JPanel();
        panelId.setLayout(new BoxLayout(panelId, BoxLayout.X_AXIS));
        panelId.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel label = new JLabel(idioma.getProperty("id"));
        JTextField idTextField = new JTextField();
        idTextField.setMaximumSize(new Dimension(200, 30));

        JButton buscar = new JButton(idioma.getProperty("buscar"));
        buscar.addActionListener(e -> CtrlModificarJugadores.mostrarJugador(textFields, idTextField.getText()));

        panelId.add(label);
        panelId.add(Box.createRigidArea(new Dimension(5, 0)));
        panelId.add(idTextField);
        panelId.add(Box.createRigidArea(new Dimension(5, 0)));
        panelId.add(buscar);

        return panelId;
    }

    public JPanel crearBotones(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        panelBotones.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton modificar = new JButton(idioma.getProperty("botonModificar"));
        JButton borrar = new JButton(idioma.getProperty("botonBorrar"));
        modificar.addActionListener(e -> CtrlModificarJugadores.modificarJugador(recogerDatos()));
        borrar.addActionListener(e -> CtrlModificarJugadores.borrarJugador());
        borrar.setForeground(Color.RED);

        panelBotones.add(modificar);
        panelBotones.add(Box.createRigidArea(new Dimension(5, 0)));
        panelBotones.add(borrar);
        return panelBotones;
    }

    private JPanel crearPanelDatos(int numIdioma) {
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new BoxLayout(panelDatos, BoxLayout.Y_AXIS));
        panelDatos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        crearTextFields(panelDatos);

        JPanel panelId = crearPanelId(numIdioma);
        JPanel panelBotones = crearBotones(numIdioma);

        panelDatos.add(Box.createRigidArea(new Dimension(0, 10)));
        panelDatos.add(panelId);
        panelDatos.add(Box.createRigidArea(new Dimension(0, 10)));
        panelDatos.add(panelBotones);
        return panelDatos;
    }

    private JPanel crearMenuLateral() {
        JPanel menuLateral = new JPanel();
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(150, 100));

        JButton consulta = crearBotonMenu(botonConsulta);
        consulta.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlConsultaJugadores.getConsultaJugadores()));
        menuLateral.add(consulta);
        JButton alta = crearBotonMenu(botonAlta);
        alta.addActionListener(e -> ControladorInterfaz.cambiarDePanel(CtrlAltaJugadores.getAltaJugadores()));
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
        demarcacion = idioma.getProperty("demarcacion");
        nombre = idioma.getProperty("nombreJugador");
        fechaNacimiento = idioma.getProperty("fechaNacimiento");
        altura = idioma.getProperty("altura");
        dorsal = idioma.getProperty("dorsal");
        club = idioma.getProperty("club");
        botonAlta = idioma.getProperty("botonAlta");
        botonConsulta = idioma.getProperty("botonConsulta");
        botonModificar = idioma.getProperty("modificar");
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

    public static Jugador recogerDatos() {
        Jugador nuevoJugador = new Jugador(
                textFields.get(demarcacion).getText(),
                textFields.get(nombre).getText(),
                textFields.get(fechaNacimiento).getText(),
                Float.parseFloat(textFields.get(altura).getText()),
                Integer.parseInt(textFields.get(dorsal).getText()),
                textFields.get(club).getText()
        );

        return nuevoJugador;
    }
}
