package U8_interfaces_gráficas.Ejemplos_Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * BorderLayout: Utiliza cinco areas diferentes: NORTH, EAST, SOUTH, WEST y CENTER
 * @author malbert
 */
public class B_BorderLayout {

    public static void main(String[] args){
        //MarcoGridBagLayout mimarco = new MarcoGridBagLayout();
        MarcoBorderLayout mimarco = new MarcoBorderLayout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoBorderLayout extends JFrame{

    public MarcoBorderLayout(){

        this.setTitle("Botones en un BorderLayout");
        this.setBounds(750,300,300,200);

        //LaminaGridBagLayout miLamina = new LaminaGridBagLayout();
        LaminaBorderLayout miLamina = new LaminaBorderLayout();
        this.add(miLamina);

    }
}

class LaminaBorderLayout extends JPanel implements ActionListener{

    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAmarillo = new JButton("Amarillo");
    public LaminaBorderLayout(){
        setLayout(new BorderLayout());
        add(botonAzul, BorderLayout.NORTH);
        add(botonBlanco, BorderLayout.EAST);
        add(botonRojo, BorderLayout.WEST);
        add(botonAmarillo, BorderLayout.SOUTH);
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