package U8_interfaces_gráficas;

import javax.swing.*;

public class Ejercicio1 {
    static class VentanaPrincipal extends JFrame {
        public VentanaPrincipal() {
            setTitle("VENTANA PRINCIPAL");
            setVisible(true);
            setSize(300, 200);
            setResizable(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    static class VentanaSecundaria extends JFrame {
        public VentanaSecundaria() {
            setTitle("VENTANA SECUNDARIA");
            setVisible(true);
            setSize(300, 200);
            setResizable(true);
            setLocationRelativeTo(null);
        }
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
        new VentanaSecundaria();
    }
}
