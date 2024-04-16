package U8_interfaces_gráficas.Ejemplos_JDialog;

import javax.swing.*;

public class A_EjemploJDialog extends JFrame {
    // el constuctor
    public A_EjemploJDialog() {
        super("Ejemplo ventana con dialog enfrente!");
        setTitle("Ejemplo ventana con dialog enfrente!");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDialog noModal= new JDialog(this, false);// dialog no modal
        noModal.setTitle("No modal");
        noModal.setSize(100,100);
        noModal.setVisible(true);
        JDialog modal= new JDialog(this, true);// dialog modal
        modal.setTitle("Modal");
        modal.setSize(100,100);
        modal.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new A_EjemploJDialog();
            }
        });
    }
}
