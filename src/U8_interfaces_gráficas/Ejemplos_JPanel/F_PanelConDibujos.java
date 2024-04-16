package U8_interfaces_gráficas.Ejemplos_JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author malbert
 */
public class F_PanelConDibujos extends JFrame {

    public static void main(String[] args){
        F_PanelConDibujos mimarco = new F_PanelConDibujos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
    public F_PanelConDibujos(){
        this.setTitle("Marco con Dibujos");
        this.setSize(400,400);

        PanelConColores miPanel = new PanelConColores();
        miPanel.setBackground(SystemColor.window);
        this.add(miPanel);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

class PanelConColores extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        //Dibujo rectángulo
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);

        g2.setPaint(Color.MAGENTA);
        g2.fill(rectangulo);
        g2.setPaint(Color.BLACK);
        g2.draw(rectangulo);

        //Dibujo elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(new Color(217, 108, 117));
        g2.fill(elipse);
    }
}
