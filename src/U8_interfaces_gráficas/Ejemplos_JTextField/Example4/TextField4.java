package U8_interfaces_gráficas.Ejemplos_JTextField.Example4;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/*
 * Uso de clases JTextField, JPasswordField
 * metodos JPasswordField
 */
public class TextField4 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("TextField4");
        myApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MainFrame extends JFrame {
    public MainFrame(){
        this.setBounds(300,300,300,100);
        MainPanel myPanel = new MainPanel();
        this.add(myPanel);
        this.setVisible(true);
        this.pack();
    }
}

class MainPanel extends JPanel {
    JLabel user;
    JTextField userText;
    JLabel password;
    JPasswordField passwText;
    public MainPanel(){
        this.setLayout(new BorderLayout());
        JPanel upper = new JPanel();
        upper.setLayout(new GridLayout(2,2));
        this.add(upper, BorderLayout.NORTH);

        user = new JLabel("User: ");
        userText = new JTextField(12);
        password = new JLabel("Password: ");
        passwText = new JPasswordField(12);
        upper.add(user);
        upper.add(userText);
        upper.add(password);
        upper.add(passwText);
        passwText.getDocument().addDocumentListener(new TextValidation());
        JButton button1 = new JButton("OK");
        add(button1,BorderLayout.SOUTH);
    }
    class TextValidation implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent de) {
            validatePasswordLength();
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            validatePasswordLength();
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            //System.out.println("Update");
        }
        private void validatePasswordLength(){
            char [] passwd = passwText.getPassword();
            if(passwd.length<8){
                passwText.setBackground(Color.red);
            }else{
                passwText.setBackground(Color.white);
            }
        }
    }
}

