package U8_interfaces_gráficas;

import javax.swing.*;

public class Ejercicio1 {
    static class VentanaPrincipal extends JFrame {
        public VentanaPrincipal() {
            setTitle("VENTANA PRINCIPAL");
            setSize(300, 200);
            setResizable(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

    static class VentanaSecundaria extends JFrame {
        public VentanaSecundaria() {
            setTitle("VENTANA SECUNDARIA");
            setSize(300, 200);
            setResizable(true);
            setLocation(100, 100);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal();
                new VentanaSecundaria();
            }
        });
    }
}
