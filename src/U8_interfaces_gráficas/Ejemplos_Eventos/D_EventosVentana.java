package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Gestión de eventos de ventana
 */
public class D_EventosVentana {

    public static void main(String[] args){
        MarcoVentana1 mimarco1 = new MarcoVentana1();
        mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco1.setVisible(true);
    }
}

class MarcoVentana1 extends JFrame{
    public MarcoVentana1(){

        this.setTitle("Eventos de ventana");
        this.setBounds(750,300,300,200);

        LaminaVentana1 miLamina = new LaminaVentana1();
        this.add(miLamina);

        EventosVentana eventosVentana = new EventosVentana();
        addWindowListener(eventosVentana);

    }
}

class LaminaVentana1 extends JPanel {


}

class EventosVentana implements WindowListener{

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