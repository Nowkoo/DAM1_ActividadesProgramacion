package U8_interfaces_gráficas.Ejemplos_Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * FlowLayout: Es el tipo de layout por defecto. Trata de ubicar los componentes
 * en una linea horizontal iniciando nuevas líneas si no existe suficiente espacio.
 * @author malbert
 */
public class A_FlowLayout {

    public static void main(String[] args){
        MarcoFlowLayout mimarco = new MarcoFlowLayout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoFlowLayout extends JFrame{

    public MarcoFlowLayout(){

        this.setTitle("Botones en un FlowLayout");
        this.setBounds(750,300,300,200);

        LaminaFlowLayout miLamina = new LaminaFlowLayout();
        this.add(miLamina);

    }
}

class LaminaFlowLayout extends JPanel implements ActionListener{

    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAmarillo = new JButton("Amarillo");
    public LaminaFlowLayout(){
        setLayout(new FlowLayout());
        add(botonAzul);
        add(botonBlanco);
        add(botonRojo);
        add(botonAmarillo);
        botonAzul.addActionListener(this);
        botonBlanco.addActionListener(this);
        botonRojo.addActionListener(this);
        botonAmarillo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Color colorfondo=Color.white;
        Object objetoFuente = ae.getSource();
        if(objetoFuente == botonAzul){
            colorfondo = Color.BLUE;
        }else if (objetoFuente==botonBlanco){
            colorfondo = Color.WHITE;
        }else if(ae.getSource()==botonRojo){
            colorfondo = Color.red;
        }else if(ae.getSource()==botonAmarillo){
            colorfondo = Color.yellow;
        }
        this.setBackground(colorfondo);
    }


}