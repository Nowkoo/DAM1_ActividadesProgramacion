package U8_interfaces_gráficas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ejercicio3 extends JFrame {
    public static void main(String[] args) {

    }

    class PanelConImagen extends JPanel {
        private Image imagen = null;

        public PanelConImagen(String rutaImagen) {
            try {
                imagen = ImageIO.read(new File(rutaImagen));
            } catch (IOException e) {
                System.out.println("Imagen no encontrada");
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawImage(imagen, 5, 5, null);
        }
    }
}
