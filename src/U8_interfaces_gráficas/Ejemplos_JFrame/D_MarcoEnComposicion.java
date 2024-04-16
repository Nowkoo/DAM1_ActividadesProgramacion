package U8_interfaces_gráficas.Ejemplos_JFrame;

import javax.swing.*;

public class D_MarcoEnComposicion {
    // el constructor
    static private JFrame master;
    private JFrame frame;
    public D_MarcoEnComposicion() {

        if (master!=null){
            frame = new JFrame();
            frame.setTitle("Slave");
            frame.setSize(60, 40);// método heredado que le da un tamaño a la ventana
            frame.setResizable(true);
            frame.setVisible(true);
            frame.setLocationRelativeTo(master);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }else{
            master = new JFrame();
            master.setTitle("Master");
            master.setSize(300,200);
            master.setVisible(true);
            master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        //El programa main es siempre igual
        //https://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new D_MarcoEnComposicion();
            }
        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new D_MarcoEnComposicion();
            }
        });
    }
}
