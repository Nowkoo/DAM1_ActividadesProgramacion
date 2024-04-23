package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author malbert
 * Clases/Interfaces de trabajo:
 * FocusListener(I): métodos focusGained, focusLost...
 * FocusAdapter(C): Clase adaptadora de FocusListener
 * Jpanel (C): método setLayout(JPanel.LayoutType)
 * JTextField (C): Componente para cuadros de texto.
 */
public class J_EventosFoco {

    public static void main(String[] args){
        MarcoFoco1 miMarco = new MarcoFoco1();
        miMarco.setTitle("Eventos de foco");
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setBounds(750,300,300,200);
        miMarco.setVisible(true);

    }
}

class MarcoFoco1 extends JFrame{
    LaminaFoco1 miLamina;
    public MarcoFoco1(){
        miLamina = new LaminaFoco1();
        miLamina.setVisible(true);
        this.add(miLamina);
    }
}

class LaminaFoco1 extends JPanel{
    JTextField cuadroTexto1;
    JTextField cuadroTexto2;

    public LaminaFoco1(){
        // Invalidamos el layout por defecto.
        setLayout(null);

        cuadroTexto1 = new JTextField();
        cuadroTexto1.setBounds(120, 10, 150, 20);
        cuadroTexto2 = new JTextField();
        cuadroTexto2.setBounds(120, 50, 150, 20);

        this.add(cuadroTexto1);
        this.add(cuadroTexto2);

        cuadroTexto1.addFocusListener(new EventosFoco1());
        cuadroTexto2.addFocusListener(new EventosFoco2());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    class EventosFoco1 implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Foco ganado por mi componente con FocusListener.");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Foco perdido por mi componente con FocusListener.");
        }
    }
    class EventosFoco2 extends FocusAdapter{

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Foco ganado por mi componente con FocusAdapter.");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Foco perdido por mi componente con FocusAdapter.");
        }
    }
}



