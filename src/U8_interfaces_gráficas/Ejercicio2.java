package U8_interfaces_gráficas;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {
    private JTextArea texto;
    public Ejercicio2() {
        setTitle("Ventanas en bucle");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        texto = new JTextArea();
        this.add(texto);
        ventanasDeDialogo();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio2::new);
    }

    /*
    class PanelConTexto extends JPanel {
        int posx = 100;
        int posy = 100;
        public void paintComponent(Graphics g, String str){
            super.paintComponent(g);
            g.drawString(str, posx, posy);
        }
    }
    */

    public void ventanasDeDialogo() {
        String input;
        while (true) {
            input = JOptionPane.showInputDialog(null, "Input");
            if (input.equals("Fin")) break;
            texto.append(input + "\n");
        }
    }
}
