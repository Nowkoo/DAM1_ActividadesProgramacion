package U8_interfaces_gráficas.Ejemplos_JPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author malbert
 * Trabajando con fuentes.
 */
public class C_PanelConTexto {

    public static void main(String[] args){
        MarcoConFuentes mimarco = new MarcoConFuentes();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

        /*
        String[] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String fuente:nombresDeFuentes)
            System.out.println(fuente);
        */
    }


}

class MarcoConFuentes extends JFrame{

    public MarcoConFuentes(){


        this.setTitle("Marco con Fuentes");
        this.setSize(400,400);

        PanelConFuentes miPanel = new PanelConFuentes();
        this.add(miPanel);

    }
}

class PanelConFuentes extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);// me aseguro que el componente original no se pinta sobre el nuevo.
        //Graphics2D g2 = (Graphics2D)g;
        Graphics g2 =g;

        Font miFuente = new Font("Courier", Font.BOLD, 20);
        g2.setFont(miFuente);
        g2.setColor(Color.BLACK);
        g2.drawString("Hola Caracola", 100, 100);
        //super.paintComponent(g);

    }
}
