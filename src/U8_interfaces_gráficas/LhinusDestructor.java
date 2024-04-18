package U8_interfaces_gráficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class LhinusDestructor extends JFrame {
    public LhinusDestructor() {
        setTitle("Lhinus el Destructor");
        this.setBounds(750,300,600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelConBotones botones = new PanelConBotones();
        this.add(botones);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LhinusDestructor();
    }
}

class PanelConBotones extends JPanel {
    JButton botonCrear = new JButton("Crear");
    JButton botonDestruir = new JButton("Destruir");

    public PanelConBotones() {
        setBackground(Color.DARK_GRAY);
        add(botonCrear);
        add(botonDestruir);
        botonCrear.addActionListener(new CrearVentana());
        botonDestruir.addActionListener(new DestruirVentana());
    }
}

class CrearVentana implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new Windows();
    }
}

class DestruirVentana implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            Windows ultimaVentana = Windows.getVentanas().pop();
            ultimaVentana.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡¡Ya has destruido todas las ventanas!!");
        }
    }
}

class Windows extends JFrame {
    static int contador = 0;
    static Stack<Windows> ventanas = new Stack<>();
    public Windows() {
        ventanas.push(this);
        setTitle("Windows " + ventanas.size());
        this.setBounds(750,300,400,300);
        setVisible(true);
        JButton botonAutodestruccion = new JButton("AUTODESTRUCCIÓN COLECTIVA");
        add(botonAutodestruccion);
        botonAutodestruccion.addActionListener(new AutodestruccionColectiva());
    }

    public static Stack<Windows> getVentanas() {
        return ventanas;
    }

    class AutodestruccionColectiva implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            while (!Windows.getVentanas().isEmpty()) {
                Windows.getVentanas().pop().dispose();
            }
        }
    }
}