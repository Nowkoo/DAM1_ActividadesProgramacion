package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author malbert
 * Hacemos uso de AbstractAction que permite definir una serie de elementos asociados
 * a una acción (NAME, SHORT_DESCRIPTION, ACTION_COMMAND_KEY, SMALL_ICON..) además de
 * otros definidos en función de nuestras necesidadades y que incorpora la obligación
 * de implementar el actionPerformed asociado a la acción.
 */
public class L_EventoBoton {

    public static void main(String[] args){
        MarcoBotones3 mimarco = new MarcoBotones3();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoBotones3 extends JFrame{

    public MarcoBotones3(){

        this.setTitle("Botones y eventos");
        this.setBounds(750,300,300,200);

        LaminaBotones3 miLamina = new LaminaBotones3();
        this.add(miLamina);

    }
}

class LaminaBotones3 extends JPanel{

    JButton botonAzul = new JButton(new AccionColor("azul", Color.blue));
    JButton botonBlanco = new JButton(new AccionColor("blanco", Color.white));
    JButton botonRojo = new JButton(new AccionColor("rojo", Color.red));

    public LaminaBotones3() {
        add(botonAzul);
        add(botonBlanco);
        add(botonRojo);
    }
    class AccionColor extends AbstractAction{
        public AccionColor(String nombre, Color color){
            putValue(Action.NAME, nombre);
            putValue("color", color);
            putValue(Action.SHORT_DESCRIPTION, "Convertir a color " + nombre);
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            setBackground((Color)this.getValue("color"));
        }
    }
}

