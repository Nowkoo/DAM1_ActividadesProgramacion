package U8_interfaces_gráficas.Ejemplos_EventosBoton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author malbert
 * Evitamos la implementación de la interfaz ActionListener mediante el uso de clases anónimas y funciones lambda.
 * Notar las ventajas de las funciones lambda en cuanto a simplificación del código.
 */
public class C_EventoBoton {

    public static void main(String[] args){
        MarcoBotones2 mimarco = new MarcoBotones2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoBotones2 extends JFrame{

    public MarcoBotones2(){

        this.setTitle("Botones y eventos");
        this.setBounds(750,300,300,200);

        LaminaBotones2 miLamina = new LaminaBotones2();
        this.add(miLamina);

    }
}

class LaminaBotones2 extends JPanel{

    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones2(){
        add(botonAzul);
        add(botonBlanco);
        add(botonRojo);
        // Manejo de eventos usando clases anonimas
        botonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setBackground(Color.BLUE);
            }
        });
        // Manejo de eventos usando funciones lambda (únicamente aplicable para interfaces funcionales)
        botonBlanco.addActionListener((e)->{
            setBackground(Color.WHITE);
        });
        botonRojo.addActionListener((e)->{
            setBackground(Color.RED);
        });
    }

}