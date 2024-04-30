package U8_interfaces_gráficas.Ejemplos_JTextField.Example1;

import javax.swing.*;
/*
 * Uso JTextField, JButton
 * JTextField: Constructores, metodos(getText)
 */
public class TextField1 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("TextField1");
        myApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MainFrame extends JFrame {
    public MainFrame(){
        this.setBounds(300,300,600,300);
        MainPanel myPanel = new MainPanel();
        this.add(myPanel);
        this.setVisible(true);
    }
}

class MainPanel extends JPanel {
    public MainPanel(){
        //Constructor por defecto genera JTextField sin espacio
        JTextField text1 = new JTextField();
        add(text1);
        //Constructor con texto inicializado, ajusta tamaño a texto.
        JTextField text2 = new JTextField("Hola caracola");
        add(text2);
        //Constructor con definicion de tamaño inicial
        JTextField text3 = new JTextField(3);
        add(text3);
        //Constructor con texto inicializado y tamaño de caja definido
        JTextField text4 = new JTextField("Write here", 3);
        add(text4);

        // Incorporo boton y compruebo la obtencion del contenido de text4
        JButton button1 = new JButton("write");
        add(button1);
        button1.addActionListener((e)-> System.out.println(text4.getText()));
    }
}
