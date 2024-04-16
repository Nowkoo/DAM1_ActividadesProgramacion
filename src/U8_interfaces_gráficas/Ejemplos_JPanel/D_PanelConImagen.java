package U8_interfaces_gráficas.Ejemplos_JPanel;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

/**
 *
 * @author malbert
 */
public class D_PanelConImagen {

    public static void main(String[] args){
        MarcoImagen mimarco = new MarcoImagen();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoImagen extends JFrame{

    public MarcoImagen(){

        this.setTitle("Marco con Imagen");
        this.setBounds(750,300,300,200);

        PanelConImagen miPanel = new PanelConImagen();
        this.add(miPanel);

    }
}

class PanelConImagen extends JPanel {
    private Image image=null;
    public PanelConImagen(){
        try{
            image = ImageIO.read(new File("./recursos/icono.png"));
        }catch (IOException e){
            System.out.println("imagen no encontrada");
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 5, 5, null);
    }
}
