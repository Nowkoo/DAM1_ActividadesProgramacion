package U8_interfaces_gráficas.Ejemplos_JFrame;

import javax.swing.*;

/**
 * @author malbert
 * JFrame (C) métodos básicos: setSize, setLocation, setBounds, setTitle...
 * Especial atención a los métodos setDefaultCloseOperation y setVisible.
 */

class A_MiPrimerMarco extends JFrame{

    public A_MiPrimerMarco(){
        this.setSize(500,300);
        this.setLocation(500,300);
        //this.setBounds(500, 300, 550, 250);
        this.setResizable(false);
        //this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setTitle("Hola mi primera ventana");
    }

        public static void main(String[] args){
        A_MiPrimerMarco marco1=new A_MiPrimerMarco();
        marco1.setVisible(true);
        //marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerramos la aplicación completa
        //marco1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Inhabilitamos el botón de cierre
        marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerramos el contenedor y liberamos sus recursos
    }

}