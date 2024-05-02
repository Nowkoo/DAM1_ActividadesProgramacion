package U8_interfaces_gráficas.GestionDeEquipos;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelEquipos extends JPanel {
    private static String nombreEquipo;
    private static String paisCompeticion;
    private static String nombreCompeticion;
    private static String entrenador;
    private static String botonRegistro;
    private Map<String, JTextField> textFields;

    public PanelEquipos(int numIdioma) {
        cargarLabels(numIdioma);
        textFields = new HashMap<>();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        crearTextFields();
        crearBotonAltas();
    }

    private void cargarLabels(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        nombreEquipo = idioma.getProperty("nombreEquipo");
        paisCompeticion = idioma.getProperty("paisCompeticion");
        nombreCompeticion = idioma.getProperty("nombreCompeticion");
        entrenador = idioma.getProperty("entrenador");
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
        altaEquipo();
        vaciarTextFields();
    }

    private void altaEquipo() {
        AltaEquipo nuevoEquipo = new AltaEquipo(
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

    private void crearTextFields() {
        Dimension labelSize = new Dimension(180, 30);
        Dimension fieldSize = new Dimension(250, 30);
        String[] labels = new String[] {
                nombreEquipo,
                paisCompeticion,
                nombreCompeticion,
                entrenador
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
