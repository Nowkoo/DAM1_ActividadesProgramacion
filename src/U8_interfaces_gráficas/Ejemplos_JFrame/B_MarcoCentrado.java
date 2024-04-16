package U8_interfaces_gráficas.Ejemplos_JFrame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author malbert
 * Toolkit (C) metodos getDefaultToolkit, getScreenSize
 * Dimension (C)
 * Image (C)
 * JFrame (C) metodos setSize, setLocation, setIconImage
 * ImageIcon (C)
 * JButton
 */
public class B_MarcoCentrado extends JFrame{

    public B_MarcoCentrado(){
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        Dimension dimension = mipantalla.getScreenSize();
        this.setSize(dimension.width/2, dimension.height/2);
        this.setLocation(dimension.width/4, dimension.height/4);
        this.setTitle("Marco Centrado");
        //Image miIcono = mipantalla.getImage("./recursos/icono.png");
        //this.setIconImage(miIcono);
        ImageIcon iconGift = new ImageIcon("./recursos/icono.png");
        // this.add(new JButton("gift", iconGift));
        this.add(new JButton(iconGift));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_MarcoCentrado();
    }

}
