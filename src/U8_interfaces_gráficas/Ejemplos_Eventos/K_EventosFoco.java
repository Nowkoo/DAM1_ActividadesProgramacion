package U8_interfaces_gráficas.Ejemplos_Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author malbert
 * Clases/Interfaces de trabajo:
 * FocusListener(I): métodos focusGained, focusLost...
 * FocusAdapter(C): Clase adaptadora de FocusListener
 * Jpanel (C): método setLayout(JPanel.LayoutType)
 * JTextField (C): Componente para cuadros de texto.
 * Ejemplo de validación de texto (email) a la perdida de foco
 */
public class K_EventosFoco {

    public static void main(String[] args){
        MarcoFoco2 miMarco = new MarcoFoco2();
        miMarco.setTitle("Eventos de foco");
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setBounds(750,300,300,200);
        miMarco.setVisible(true);

    }
}

class MarcoFoco2 extends JFrame{
    LaminaFoco2 miLamina;
    public MarcoFoco2(){
        miLamina = new LaminaFoco2();
        miLamina.setVisible(true);
        this.add(miLamina);
    }
}

class LaminaFoco2 extends JPanel{
    JTextField cuadroTexto1;
    JTextField cuadroTexto2;

    public LaminaFoco2(){
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
    class EventosFoco1 implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            //System.out.println("Foco ganado por mi componente con FocusListener.");
        }

        @Override
        public void focusLost(FocusEvent e) {
            //System.out.println("Foco perdido por mi componente con FocusListener.");
            if (compruebaEmail(cuadroTexto1.getText())){
                System.out.println("valor correcto");
            } else {
                System.out.println("valor incorrecto");
            }
        }
    }
    class EventosFoco2 extends FocusAdapter{

        @Override
        public void focusGained(FocusEvent e) {
            //System.out.println("Foco ganado por mi componente con FocusAdapter.");
        }

        @Override
        public void focusLost(FocusEvent e) {
            //System.out.println("Foco perdido por mi componente con FocusAdapter.");
        }
    }

    private boolean compruebaEmail(String email){
        boolean emailValido = false;
        //Validación básica email
        for (int i=0;i<email.length();i++){
            if(email.charAt(i)=='@') emailValido = true;
        }
        return emailValido;
    }
}



