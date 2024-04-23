package U8_interfaces_gráficas.Ejemplos_Eventos;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Control del cambion de estado de la ventana a partir de la interfaz WindowStateListener
 * metodos getOldState y getNewState de la clase WindowEvent
 */
public class G_EventosVentana {

    public static void main(String[] args){
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setTitle("Control de estado");
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setBounds(750,300,300,200);

    }


}

class MarcoEstado extends JFrame{

    public MarcoEstado(){

        addWindowStateListener(new EventosCambioEstado());
        // Alternativamente como función lambda
        //addWindowStateListener((we)-> System.out.println("Ha cambiado el estado: " + we.getNewState()));
        this.setVisible(true);

    }
}

class EventosCambioEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent we) {
        System.out.println("Ha cambiado el estado: " + we.getNewState());

        //if(we.getNewState()==JFrame.MAXIMIZED_BOTH){
        //    System.out.println("Estado maximizado.");
        //}
    }
}

