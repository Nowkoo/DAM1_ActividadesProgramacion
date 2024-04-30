package U8_interfaces_gráficas.Ejemplos_JTextField.Example2;

import javax.swing.*;
/*
 * Uso JTextField, JLabel, JButton
 * metodos JTextField: getText, setText
 * metodos JLabel: getText, setText
 */
public class TextField2 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("TextField2");
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
        JLabel label1 = new JLabel("Text1 to label2: ");
        add(label1);
        JLabel label2 = new JLabel("");
        JTextField text1 = new JTextField(5);
        add(text1);

        JButton button1 = new JButton("write");
        add(button1);
        add(label2);

        button1.addActionListener((e)-> label2.setText(text1.getText()));
    }
}
