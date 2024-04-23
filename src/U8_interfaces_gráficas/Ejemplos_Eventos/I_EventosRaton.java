package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Clases/Interfaces de trabajo:
 * MouseListener(I): métodos mouseClicked, mouseEntered...
 * MouseAdapter(C): Clase adaptadora de MouseListener
 * MouseEvent(C): campos estáticos MOUSE_RELEASED... métodos getX, getY, getModifiersEx...
 * MouseMotionListener(I): métodos mouseDragged mouseMoved
 *
 */
public class I_EventosRaton {

    public static void main(String[] args){
        MarcoRaton1 miMarco = new MarcoRaton1();
        miMarco.setTitle("Eventos de teclado");
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setBounds(750,300,300,200);

    }


}

class MarcoRaton1 extends JFrame{

    public MarcoRaton1(){

        this.addMouseListener(new EventosRaton());
        this.addMouseMotionListener(new EventosMovimientoRaton());
        this.setVisible(true);

    }
}


class EventosRaton extends MouseAdapter{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("posicion en elemento: " + me.getX() + " " + me.getY());
        System.out.println("posicion en pantalla: " + me.getXOnScreen() + " " + me.getYOnScreen());

    }
    @Override
    public void mousePressed(MouseEvent me){
        if(me.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Botón izquierdo.");
        }else{
            System.out.println(me.getModifiersEx());
        }
    }
    @Override
    public void mouseEntered(MouseEvent me){
        System.out.println("Dentro");
    }

}

class EventosMovimientoRaton implements MouseMotionListener{
    boolean cambio = true;

    @Override
    public void mouseMoved(MouseEvent me) {
        if (cambio){
            System.out.println("Estas moviendo el ratón con el botón: " + me.getButton());
            cambio =!cambio;
        }
    }
    @Override
    public void mouseDragged(MouseEvent me){
        if (!cambio){
            System.out.println("Estas arrastrando el ratón con el botón: " + me.getButton());
            cambio =!cambio;
        }
    }
}
