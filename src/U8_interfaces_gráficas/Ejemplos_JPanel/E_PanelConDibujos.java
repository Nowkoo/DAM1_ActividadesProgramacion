package U8_interfaces_gráficas.Ejemplos_JPanel;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author malbert
 */
public class E_PanelConDibujos extends JFrame {
    static private PanelConDibujos miPanel;
    public E_PanelConDibujos(){
        this.setTitle("Panel con Dibujos");
        this.setSize(400,400);
        this.setLocation(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        miPanel = new PanelConDibujos();
        this.add(miPanel);
    }
    public static void main(String[] args) throws InterruptedException {
        //PanelConDibujos
        E_PanelConDibujos miMarco = new E_PanelConDibujos();

        //Sustitución de panel
        PanelConDibujos1 otroPanel = new PanelConDibujos1();
        Thread.sleep(5000);
        miMarco.add(otroPanel);
        miPanel.setVisible(false);

    }
}

class PanelConDibujos extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.drawRect(50, 50, 200, 100);
        g.drawLine(50, 25, 250, 25);

    }
}

class PanelConDibujos1 extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.drawRect(50, 50, 300, 200);

    }
}