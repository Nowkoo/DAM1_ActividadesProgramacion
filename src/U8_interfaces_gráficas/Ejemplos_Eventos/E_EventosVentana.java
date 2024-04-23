package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Gestión de varias ventanas
 */
public class E_EventosVentana {

    public static void main(String[] args){
        MarcoVentana2 mimarco1 = new MarcoVentana2("Ventana1");
        mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco1.setBounds(750,300,300,200);
        mimarco1.setVisible(true);

        MarcoVentana2 mimarco2 = new MarcoVentana2("Ventana2");
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco2.setBounds(1150,300,300,200);
        mimarco2.setVisible(true);
    }
}

class MarcoVentana2 extends JFrame{

    public MarcoVentana2(){

        //this.setTitle("Eventos de ventana");
        //this.setBounds(750,300,300,200);

        LaminaVentana2 miLamina = new LaminaVentana2();
        this.add(miLamina);

        EventosVentana2 eventosVentana = new EventosVentana2();
        addWindowListener(eventosVentana);

    }
    public MarcoVentana2 (String title){
        this();
        this.setTitle(title);
    }
}

class LaminaVentana2 extends JPanel {


}

class EventosVentana2 implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Ventana desactivada");
    }

}
