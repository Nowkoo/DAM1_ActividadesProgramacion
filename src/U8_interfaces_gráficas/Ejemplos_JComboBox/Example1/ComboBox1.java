package U8_interfaces_gráficas.Ejemplos_JComboBox.Example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Uso JComboBox,
 * JComboBox: Constructores, metodos(addItem, getSelectedItem, setEditable)
 */
public class ComboBox1 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("ComboBox1");
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
    private JLabel myText;
    private JComboBox myCombo;
    public MainPanel(){
        this.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        myText = new JLabel("Fistro pecador de la pradera");
        myText.setFont(new Font("Arial", Font.PLAIN, 14));
        centerPanel.add(myText);
        JPanel northPanel = new JPanel();
        add(northPanel, BorderLayout.NORTH);
        myCombo = new JComboBox();
        myCombo.addItem("Serif");
        myCombo.addItem("Arial");
        myCombo.addItem("Courier");
        myCombo.addItem("Monospaced");
        //Permite editar un nuevo elemento de selección
        myCombo.setEditable(true);
        northPanel.add(myCombo);
        myCombo.addActionListener(new MyComboListener());

    }

    private class MyComboListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            myText.setFont(new Font((String)myCombo.getSelectedItem(), Font.PLAIN, 14));
        }
    }
}
