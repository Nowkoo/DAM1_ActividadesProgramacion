package U8_interfaces_gráficas.GestionDeEquipos;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelJugadores extends JPanel {
    private static final String DEMARCACION = "Demarcación:";
    private static final String NOMBRE = "Nombre del jugador:";
    private static final String FECHA_NACIMIENTO = "Año de nacimiento:";
    private static final String ALTURA = "Altura:";
    private static final String DORSAL = "Dorsal:";
    private static final String CLUB = "Club de pertenencia:";
    private Map<String, JTextField> textFields;

    public PanelJugadores() {
        textFields = new HashMap<>();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        crearTextFields();
        crearBotonAltas();
    }

    private void crearBotonAltas() {
        JButton botonAlta = new JButton("Registrar jugador");
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
                textFields.get(DEMARCACION).getText(),
                textFields.get(NOMBRE).getText(),
                textFields.get(FECHA_NACIMIENTO).getText(),
                textFields.get(ALTURA).getText(),
                textFields.get(DORSAL).getText(),
                textFields.get(CLUB).getText()
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
                DEMARCACION,
                NOMBRE,
                FECHA_NACIMIENTO,
                ALTURA,
                DORSAL,
                CLUB
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
