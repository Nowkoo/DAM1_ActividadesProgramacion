package U8_interfaces_gráficas.Ejemplos_JFrame;

import javax.swing.*;

public class C_MarcoComoThread extends JFrame {
    // el constructor
    public C_MarcoComoThread() {
        super("Hola!!!"); // Pone un título a la ventana
        //o this.setTitle("Hola!!!");
        setSize(300, 200);// método heredado que le da un tamaño a la ventana
        setResizable(true); //Se puede cambiar el tamaño
        setLocationRelativeTo(null); //Posición relativa al componente especificado (en este caso no lo hay)
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        //El programa main es siempre igual
        //https://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new C_MarcoComoThread();
            }
        });
        /*
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new C_MarcoComoThread();
            }
        });
        */

        /*
         * También se podría hacer
         * new C_MarcoComoThread();
         * new C_MarcoComoThread();
         * Pero esta otra forma es la indicada porque trabaja con threads
         */
    }
}