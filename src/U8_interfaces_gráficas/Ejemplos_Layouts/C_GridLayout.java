package U8_interfaces_gráficas.Ejemplos_Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GridLayout: Reparte los componentes en espacios de igual tamaño a
 * partir de la configuración de filas y columnas establecida.
 * @author malbert
 */
public class C_GridLayout {

    public static void main(String[] args){
        MarcoGridLayout mimarco = new MarcoGridLayout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoGridLayout extends JFrame{

    public MarcoGridLayout(){

        this.setTitle("Botones en un GridLayout");
        this.setBounds(750,300,500,500);

        LaminaGridLayout miLamina = new LaminaGridLayout();
        this.add(miLamina);

    }
}

class LaminaGridLayout extends JPanel implements ActionListener{

    JButton botonAzul = new JButton("Azul");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonVerde = new JButton("Verde");
    public LaminaGridLayout(){
        setLayout(new GridLayout(2,2));
        add(botonAzul);
        add(botonBlanco);
        add(botonRojo);
        add(botonAmarillo);
        add(botonVerde);
        botonAzul.addActionListener(this);
        botonBlanco.addActionListener(this);
        botonRojo.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonVerde.addActionListener(this);
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
        }else if(ae.getSource()==botonVerde){
            colorfondo = Color.green;
        }
        this.setBackground(colorfondo);
    }


}