package U8_interfaces_gráficas.Ejemplos_JTextField.Example3;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/*
 * Uso de clases JTextField, JLabel, JButton
 * Uso de interfaz Document, DocumentListener (Gestion de eventos del contenido de JTextField)
 */
public class TextField3 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("TextField3");
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
        JLabel label1 = new JLabel("Text1: ");
        add(label1);
        JTextField text1 = new JTextField(5);
        add(text1);
        JButton button1 = new JButton("delete");
        add(button1);

        button1.addActionListener((e)-> text1.setText(""));
        //Objeto asociado al texto como objeto/documento
        Document myDoc = text1.getDocument();
        //Listener para eventos sobre el objeto/documento
        myDoc.addDocumentListener(new DocumentEventDispatcher());
    }
}
class DocumentEventDispatcher implements DocumentListener {

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        System.out.println("Insert");
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        System.out.println("Remove");
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        System.out.println("Update");
    }
}
