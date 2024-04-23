package U8_interfaces_gráficas;

import javax.swing.*;
import java.awt.*;

class Calculadora {
    private static String operacion = "";

    public static void escribir(char nuevoCaracter) {
        operacion = operacion + nuevoCaracter;
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
        add(crearGridBotones(), BorderLayout.CENTER);
        add(bCalcular, BorderLayout.SOUTH);
    }

    public JPanel crearGridBotones() {
        JPanel gridBotones = new JPanel();
        gridBotones.setLayout(new GridLayout(0, 4));

        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bDividir = new JButton("/");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bMultiplicar = new JButton("X");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bRestar = new JButton("-");
        JButton bDecimal = new JButton(".");
        JButton b0 = new JButton("0");
        JButton bBorrar = new JButton("C");
        JButton bSumar = new JButton("+");

        gridBotones.add(b7);
        gridBotones.add(b8);
        gridBotones.add(b9);
        gridBotones.add(bDividir);
        gridBotones.add(b4);
        gridBotones.add(b5);
        gridBotones.add(b6);
        gridBotones.add(bMultiplicar);
        gridBotones.add(b1);
        gridBotones.add(b2);
        gridBotones.add(b3);
        gridBotones.add(bRestar);
        gridBotones.add(bDecimal);
        gridBotones.add(b0);
        gridBotones.add(bBorrar);
        gridBotones.add(bSumar);

        b7.addActionListener((e)->{
            Calculadora.escribir(b7.);
        });

        return gridBotones;
    }
}
