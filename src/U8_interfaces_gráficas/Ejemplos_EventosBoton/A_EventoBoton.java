package U8_interfaces_gráficas.Ejemplos_EventosBoton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author malbert
 * Para tratar eventos hay que tener en cuenta los diferentes elementos que participan:
 * - El origen del evento. Es el elemento (componente, ventana..) en el que se origina el evento.
 * - El evento generado. Es un objeto que se genera cuando se produce una determinada acción en el origen
 * del evento: Por ejemplo la activación o pulsación (evento) de un objeto botón (origen del evento).
 * - El manejador del evento. Es la clase que implementa la interfaz correspondiente al tipo de evento que
 * hemos relacionado o asignado al origen del evento. Esta clase contendrá la implementación de la función a
 * ejecutar cuando se genera el evento sobre el objeto asociado.
 */
public class A_EventoBoton {

    public static void main(String[] args){
        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoBotones extends JFrame{

    public MarcoBotones(){

        this.setTitle("Botones y eventos");
        this.setBounds(750,300,300,200);

        LaminaBotones miLamina = new LaminaBotones();
        this.add(miLamina);

    }
}

class LaminaBotones extends JPanel implements ActionListener{

    // Creamos tres objetos JButton como origen de eventos.
    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");
    public LaminaBotones(){
        add(botonAzul);
        add(botonBlanco);
        add(botonRojo);
        // Asignamos este mismo objeto como manejador del evento asociado a la
        // pulsación de los objetos JButton instanciados anteriormente.
        botonAzul.addActionListener(this);
        botonBlanco.addActionListener(this);
        botonRojo.addActionListener(this);
    }

    // Función correspondiente a la interfaz que pemite la implementación de la respuesta
    // a la generación de eventos generados en objetos (origen de evento) asociados con
    // instancias de esta clase.
    @Override
    public void actionPerformed(ActionEvent ae) {
        Color colorfondo=Color.white;
        // A partir del objeto evento podemos distinguir el objeto origen.
        Object objetoFuente = ae.getSource();
        if(objetoFuente == botonAzul){
            colorfondo = Color.BLUE;
        }else if (objetoFuente==botonBlanco){
            colorfondo = Color.WHITE;
        }else if(ae.getSource()==botonRojo){
            colorfondo = Color.red;
        }
        this.setBackground(colorfondo);
    }

}