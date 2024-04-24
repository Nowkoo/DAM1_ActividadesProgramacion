package U8_interfaces_gráficas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Calculadora {
    private static String operacion = "";
    public static void main(String[] args) {
        new InterfazCalculadora();
    }

    public static void escribir(String nuevo) {
        operacion = operacion + nuevo;
    }

    public static void borrar() {
        operacion = "";
    }

    public static String getOperacion() {
        return operacion;
    }
}
class InterfazCalculadora extends JFrame {
    public InterfazCalculadora() {
        this.setTitle("RPN Calculator");
        this.setBounds(750,300,500,500);

        PlantillaCalculadora plantilla = new PlantillaCalculadora();
        this.add(plantilla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class PlantillaCalculadora extends JPanel {
    public PlantillaCalculadora() {
        setLayout(new BorderLayout());
        JTextArea resultado = new JTextArea();
        resultado.setPreferredSize(new Dimension(100,100));
        JButton bCalcular = new JButton ("Calcular");
        bCalcular.setPreferredSize(new Dimension(100,50));

        add(resultado, BorderLayout.NORTH);
        add(crearGridBotones(resultado), BorderLayout.CENTER);
        add(bCalcular, BorderLayout.SOUTH);
    }

    public JPanel crearGridBotones(JTextArea textArea) {
        String[] textoBotones = new String[] {"7", "8", "9", "/", "4", "5", "6", "X", "1", "2", "3", "-", "ESP", "0", "C", "+"};
        JPanel gridBotones = new JPanel();
        gridBotones.setLayout(new GridLayout(0, 4));

        for (String str : textoBotones) {
            JButton boton = new JButton(str);
            gridBotones.add(boton);
            if (str.equals("C")) {
                boton.addActionListener((e)->{
                    Calculadora.borrar();
                });
            } else if (str.equals("ESP")) {
                boton.addActionListener((e)->{
                    Calculadora.escribir(" ");
                    textArea.append(Calculadora.getOperacion());
                });
            } else {
                boton.addActionListener((e)->{
                    Calculadora.escribir(boton.getText());
                    textArea.append(Calculadora.getOperacion());
                });
            }
        }

        return gridBotones;
    }
}
