package U8_interfaces_gráficas.GestionDeEquipos.View;

import U8_interfaces_gráficas.GestionDeEquipos.Controller.ControladorInterfaz;
import U8_interfaces_gráficas.GestionDeEquipos.Controller.CtrlConsultaEquipos;
import U8_interfaces_gráficas.GestionDeEquipos.Controller.CtrlConsultaJugadores;
import U8_interfaces_gráficas.GestionDeEquipos.Model.Idioma;

import javax.swing.*;
import java.awt.*;

public class VistaInicio extends JPanel {
    private JButton btnEquipos;
    private JButton btnJugadores;

    public VistaInicio(int numIdioma) {
        inicializarPanel(numIdioma);
    }

    private void inicializarPanel(int numIdioma) {
        Idioma idioma = new Idioma(numIdioma);
        this.setLayout(new GridLayout(1, 2, 10, 10)); // 1 fila, 2 columnas, 10 pixels de espacio horizontal y vertical
        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Agregar un borde alrededor del panel
        this.setName("Inicio");

        btnEquipos = new JButton(idioma.getProperty("gestionarEquipos"));
        btnJugadores = new JButton(idioma.getProperty("gestionarJugadores"));

        btnEquipos.setPreferredSize(new Dimension(150, 100));
        btnJugadores.setPreferredSize(new Dimension(150, 100));
        btnEquipos.setFont(new Font("Arial", Font.BOLD, 16));
        btnJugadores.setFont(new Font("Arial", Font.BOLD, 16));

        this.add(btnEquipos);
        this.add(btnJugadores);

        btnEquipos.setBackground(new Color(0, 153, 204));
        btnJugadores.setBackground(new Color(255, 153, 51));
        btnEquipos.setForeground(Color.WHITE);
        btnJugadores.setForeground(Color.WHITE);

        btnEquipos.setBorder(BorderFactory.createRaisedBevelBorder());
        btnJugadores.setBorder(BorderFactory.createRaisedBevelBorder());

        btnEquipos.addActionListener(e -> {
            ControladorInterfaz.cambiarDePanel(CtrlConsultaEquipos.getConsultaEquipos());
        });

        btnJugadores.addActionListener(e -> {
            ControladorInterfaz.cambiarDePanel(CtrlConsultaJugadores.getConsultaJugadores());
        });
    }
}