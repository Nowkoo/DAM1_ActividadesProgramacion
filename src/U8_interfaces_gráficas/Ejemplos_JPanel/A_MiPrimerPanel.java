package U8_interfaces_gráficas.Ejemplos_JPanel;
import javax.swing.*;

/**
 *
 * @author malbert
 * ImageIcon (C)
 * JButton
 */
public class A_MiPrimerPanel  extends JFrame {

    public A_MiPrimerPanel(){
        this.setVisible(true);
        this.setSize(600, 450);
        this.setLocation(400, 200);
        this.setTitle("Mi primer panel");

        PanelConBoton miPanel = new PanelConBoton();
        this.add(miPanel);
    }

    public static void main(String[] args) {
        A_MiPrimerPanel miMarco = new A_MiPrimerPanel();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }

}

class PanelConBoton extends JPanel {

    public PanelConBoton(){
        ImageIcon iconGift = new ImageIcon("./recursos/icono.png");
        // this.add(new JButton("gift", iconGift));
        this.add(new JButton(iconGift));
        this.add(new JButton("Hola!"));
    }
}

