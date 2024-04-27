package U8_interfaces_gráficas.CalculadoraRPN;


import javax.swing.*;
import java.awt.*;

public class InterfazCalculadora extends JFrame {
    public InterfazCalculadora() {
        this.setTitle("RPN Calculator");
        this.setBounds(750,300,350,500);

        PlantillaCalculadora plantilla = new PlantillaCalculadora();
        this.add(plantilla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class PlantillaCalculadora extends JPanel {
    private JTextField pantallaOperacion;
    public PlantillaCalculadora() {
        setLayout(new BorderLayout());

        pantallaOperacion = new JTextField();
        pantallaOperacion.setEditable(false);
        pantallaOperacion.setPreferredSize(new Dimension(100, 150));
        pantallaOperacion.setText(Calculadora.getOperacion());
        pantallaOperacion.setHorizontalAlignment(JTextField.RIGHT);
        pantallaOperacion.setFont(new Font("Arial", Font.BOLD, 42));

        JButton bCalcular = new JButton ("=");
        bCalcular.setPreferredSize(new Dimension(100,100));
        bCalcular.setFont(new Font("Arial", Font.BOLD, 42));
        bCalcular.addActionListener((e) -> {
            Calculadora.calcular();
            actualizarPantalla();
        });

        add(pantallaOperacion, BorderLayout.NORTH);
        add(crearGridBotones(), BorderLayout.CENTER);
        add(bCalcular, BorderLayout.SOUTH);
    }

    public JPanel crearGridBotones() {
        String[] textoBotones = new String[] {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "SP", "0", "C", "+"};
        JPanel gridBotones = new JPanel();
        gridBotones.setLayout(new GridLayout(0, 4));

        for (String str : textoBotones) {
            JButton boton = new JButton(str);
            boton.setFont(new Font("Arial", Font.PLAIN, 20));
            gridBotones.add(boton);
            boton.addActionListener((e) -> {
                if (str.equals("C")) {
                    Calculadora.borrar();
                } else if (str.equals("SP")) {
                    limpiarOperacion();
                    Calculadora.escribir(" ");
                } else {
                    limpiarOperacion();
                    Calculadora.escribir(boton.getText());
                }
                actualizarPantalla();
            });
        }
        return gridBotones;
    }

    public void actualizarPantalla() {
        pantallaOperacion.setText(Calculadora.getOperacion());
    }

    public void limpiarOperacion() {
        if (Calculadora.getOperacion().equals("0")
                || Calculadora.getOperacion().equals(Calculadora.getMathError())
                || Calculadora.getOperacion().equals(Calculadora.getSyntaxError())) {
            Calculadora.limpiar();
        }
    }
}
