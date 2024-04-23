package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Introducción al uso de clases adaptadoras para la simplificación del código.
 * Clase de ejemplo: WindowAdapter (evita tener que implementar todos los métodos de WindowListener
 */
public class F_EventosVentana {

    public static void main(String[] args){
        MarcoVentana3 mimarco1 = new MarcoVentana3("Ventana1");
        mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco1.setBounds(750,300,300,200);

        MarcoVentana3 mimarco2 = new MarcoVentana3("Ventana2");
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco2.setBounds(1150,300,300,200);

    }


}

class MarcoVentana3 extends JFrame{

    public MarcoVentana3(){

        addWindowListener(new EventosVentana3());
        this.setVisible(true);

    }

    public MarcoVentana3 (String title){
        this();
        this.setTitle(title);
    }
}

class EventosVentana3 extends WindowAdapter{

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana minimizada");
    }

}