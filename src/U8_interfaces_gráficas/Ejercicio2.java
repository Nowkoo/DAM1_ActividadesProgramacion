package U8_interfaces_gráficas;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {
    public Ejercicio2() {
        setTitle("Ventanas en bucle");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String textoVentana = "";

        Container contentpane = getContentPane();
        PanelConTexto panel = new PanelConTexto();
        contentpane.add(panel);

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Input");
            if (input.equals("Fin")) break;
            textoVentana = textoVentana + " " + input;
            panel.paintComponent(panel.getGraphics(), textoVentana);
        }
    }
    public static void main(String[] args) {
        new Ejercicio2();
    }

    class PanelConTexto extends JPanel {
        int posx = 100;
        int posy = 100;
        public void paintComponent(Graphics g, String str){
            super.paintComponent(g);
            g.drawString(str, posx, posy);
        }

    }
}
