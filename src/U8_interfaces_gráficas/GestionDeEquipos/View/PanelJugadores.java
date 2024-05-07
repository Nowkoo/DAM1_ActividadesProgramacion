package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Model.AltaJugador;
import U8_interfaces_gráficas.GestionDeEquipos.Controller.GestorEquiposMain;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelJugadores extends JPanel {
    private static String demarcacion;
    private static String nombre;
    private static String fechaNacimiento;
    private static String altura;
    private static String dorsal;
    private static String club;
    private static String botonRegistro;
    private Map<String, JTextField> textFields;

    public PanelJugadores(int numIdioma) {
        cargarLabels(numIdioma);
        textFields = new HashMap<>();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        crearTextFields();
        crearBotonAltas();
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
    }

    private void crearBotonAltas() {
        JButton botonAlta = new JButton(botonRegistro);
        add(Box.createRigidArea(new Dimension(0, 10)));
        botonAlta.addActionListener((e) -> {
            procesarAlta();
        });
        add(botonAlta);
    }

    private void procesarAlta() {
        for (String label : textFields.keySet()) {
            if (textFields.get(label).getText().equals("")) return;
        }
        altaJugador();
        vaciarTextFields();
    }

    private void altaJugador() {
        AltaJugador nuevoJugador = new AltaJugador(
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

    private void crearTextFields() {
        Dimension labelSize = new Dimension(180, 30);
        Dimension fieldSize = new Dimension(250, 30);
        String[] labels = new String[] {
                demarcacion,
                nombre,
                fechaNacimiento,
                altura,
                dorsal,
                club
        };

        for (String textoLabel : labels) {
            crearTextField(textoLabel, labelSize, fieldSize);
        }
    }

    private void crearTextField(String textoLabel, Dimension labelSize, Dimension fieldSize) {
        JPanel fila = new JPanel();
        fila.setLayout(new BoxLayout(fila, BoxLayout.X_AXIS));
        fila.setAlignmentX(LEFT_ALIGNMENT);

        JLabel newLabel = new JLabel(textoLabel);
        newLabel.setMinimumSize(labelSize);
        newLabel.setMaximumSize(labelSize);

        JTextField newField = new JTextField();
        newField.setMinimumSize(fieldSize);
        newField.setMaximumSize(fieldSize);

        fila.add(newLabel);
        fila.add(Box.createRigidArea(new Dimension(5, 0)));
        fila.add(newField);

        add(fila);
        this.add(Box.createRigidArea(new Dimension(0, 5)));

        textFields.put(newLabel.getText(), newField);
    }
}
