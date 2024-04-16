package U8_interfaces_gráficas.Ejemplos_JPanel;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author malbert
 */
public class B_PanelConTexto  extends JFrame {
    static private PanelConTexto miPanel;
    public B_PanelConTexto(){
        this.setVisible(true);
        this.setSize(600, 450);
        this.setLocation(400, 200);
        this.setTitle("Panel con Texto");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

         miPanel = new PanelConTexto();
        this.add(miPanel);
    }

    public static void main(String[] args) throws InterruptedException {
       //PanelConTexto
       B_PanelConTexto mimarco = new B_PanelConTexto();
       //Moviendo el texto.
       for (int i=0;i<1000;i++){
           Thread.sleep(20);
;
           if (miPanel.posx<300){
               miPanel.posx+=1;
           }else{
               miPanel.posx = 100;
           }
           if (miPanel.posy<300){
               miPanel.posy+=1;
           }else{
               miPanel.posy = 100;
           }
           miPanel.paintComponent(miPanel.getGraphics());
       }

    }
}

class PanelConTexto extends JPanel {
    int posx = 100;
    int posy = 100;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hola Caracola", posx, posy);
    }

}

