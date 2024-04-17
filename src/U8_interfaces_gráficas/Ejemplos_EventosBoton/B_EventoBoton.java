package U8_interfaces_gráficas.Ejemplos_EventosBoton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author malbert
 * En este ejemplo mostramos como el objeto manejador de eventos puede ser de
 * una clase generada específicamente para dicha función.
 */
public class B_EventoBoton {

    public static void main(String[] args){
        MarcoBotones1 mimarco = new MarcoBotones1();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoBotones1 extends JFrame{

    public MarcoBotones1(){

        this.setTitle("Botones y eventos");
        this.setBounds(750,300,300,200);

        LaminaBotones1 miLamina = new LaminaBotones1();
        this.add(miLamina);

    }
}

class LaminaBotones1 extends JPanel {

    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones1(){
        add(botonAzul);
        add(botonBlanco);
        add(botonRojo);
        // Instanciamos objetos distintos para el manejo de eventos de cada botón.
        ColorFondo bgRojo = new ColorFondo(Color.red);
        ColorFondo bgAzul = new ColorFondo(Color.blue);
        ColorFondo bgBlanco = new ColorFondo(Color.white);
        // Asignamos los manejadores de eventos de cada botón.
        botonAzul.addActionListener(bgAzul);
        botonBlanco.addActionListener(bgBlanco);
        botonRojo.addActionListener(bgRojo);
    }
    // Clase diseñada ad-hoc para generar instancias de manejo de eventos.
    private class ColorFondo implements ActionListener{
        private Color colorFondo;

        public ColorFondo(Color c){
            this.colorFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            setBackground(colorFondo);
        }


    }
}