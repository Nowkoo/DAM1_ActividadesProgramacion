package U8_interfaces_gráficas.Ejemplos_Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ejemplo de combinación de distintos tipos de layouts en estructura
 * jerarquica.
 * @author malbert
 */
public class D_MultiPanel {

    public static void main(String[] args){
        MarcoMultiPanel mimarco = new MarcoMultiPanel();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoMultiPanel extends JFrame{

    public MarcoMultiPanel(){

        this.setTitle("Botones en un multipanel");
        this.setBounds(750,300,300,200);

        LaminaMultiPanel miLamina = new LaminaMultiPanel();
        this.add(miLamina);

    }
}

class LaminaMultiPanel extends JPanel implements ActionListener{

    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAmarillo = new JButton("Amarillo");
    public LaminaMultiPanel(){
        setLayout(new BorderLayout());
        JPanel miFlow = new JPanel();
        miFlow.setLayout(new FlowLayout());
        miFlow.add(botonAzul);

        JPanel miGrid = new JPanel();
        miGrid.setLayout(new GridLayout(3,2));
        miGrid.add(botonBlanco);
        miGrid.add(botonRojo);
        miGrid.add(botonAmarillo);


        add(miFlow, BorderLayout.NORTH);
        add(miGrid, BorderLayout.WEST);

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