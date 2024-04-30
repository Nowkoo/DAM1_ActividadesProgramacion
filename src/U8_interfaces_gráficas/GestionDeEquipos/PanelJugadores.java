package U8_interfaces_gráficas.GestionDeEquipos;

import javax.swing.*;
import java.awt.*;

public class PanelJugadores extends JPanel {
    public PanelJugadores() {
        setLayout(new GridLayout(0, 2));
        String[] labels = new String[] {"Demarcación:", "Nombre del jugador:", "Año de nacimiento:", "Altura:", "Dorsal:", "Club de pertenencia:"};

        for (String textoLabel : labels) {
            JLabel newLabel = new JLabel(textoLabel);
            add(newLabel);
            JTextField newField = new JTextField();
            add(newField);
        }
    }
}
