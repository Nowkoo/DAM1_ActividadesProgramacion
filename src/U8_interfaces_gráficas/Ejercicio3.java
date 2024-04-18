package U8_interfaces_gráficas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ejercicio3 extends JFrame {
    static private PanelConImagen panelConImagen;

    public Ejercicio3() {
        this.setBounds(750,300,300,200);
        this.setTitle("Imagen en movimiento");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        panelConImagen = new PanelConImagen("./recursos/pluginfile.bmp");
        this.add(panelConImagen);
    }
    public static void main(String[] args) throws InterruptedException {
        Ejercicio3 ventana = new Ejercicio3();
        movimiento();
    }

    public static void movimiento() throws InterruptedException {
        while (true){
            Thread.sleep(20);

            if (panelConImagen.posx<1100){
                panelConImagen.posx+=1;
            } else {
                panelConImagen.posx = 0;
            }

            if (panelConImagen.posy<400){
                panelConImagen.posy+=1;
            } else {
                panelConImagen.posy = 0;
            }
            panelConImagen.repaint();
        }
    }
}

class PanelConImagen extends JPanel {
    int posx = 0;
    int posy = 0;
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
        super.paintComponent(g);
        g.drawImage(imagen, posx, posy, null);
    }
}
