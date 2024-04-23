package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Clases/Interfaces de trabajo:
 * KeyListener(I): Métodos keyTyped, keyPressed...
 * KeyAdapter(C): Clase adaptadora de KeyListener
 * KeyEvent (C): Métodos getKeyChar, getKeyCode ...
 * Component (C super de JFrame): Método addKeyListener
 */
public class H_EventosTeclado {

    public static void main(String[] args){
        MarcoEventosTeclado1 miMarco = new MarcoEventosTeclado1();
        miMarco.setTitle("Eventos de teclado");
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setBounds(750,300,300,200);

    }


}


class MarcoEventosTeclado1 extends JFrame{

    public MarcoEventosTeclado1(){

        this.addKeyListener(new EventosTeclado1());
        this.setVisible(true);

    }
}

/*
class EventosTeclado1 extends KeyAdapter{

    @Override
    public void keyTyped(KeyEvent ke) {

    }

}
*/

class EventosTeclado1 implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println(ke.getKeyChar() +": " + ke.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}