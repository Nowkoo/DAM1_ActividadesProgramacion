package U8_interfaces_gráficas.Ejemplos_JComboBox.Example2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Uso JComboBox,
 * JComboBox: Constructores, metodos(addItem, getSelectedItem, setEditable)
 * JPanel: revalidate, repaint
 * Ejemplo de aplicación con un combobox seleccionando el contenido de un area.
 */
public class ComboBox2 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("ComboBox2");
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
    private JComboBox myCombo;
    JPanel panel1 ;
    JPanel panel2 ;
    public MainPanel(){
        this.setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        add(northPanel, BorderLayout.NORTH);
        myCombo = new JComboBox();
        myCombo.addItem("Panel1");
        myCombo.addItem("Panel2");
        northPanel.add(myCombo);
        myCombo.addActionListener(new MyComboListener());

        panel1 = new Panel1();
        panel2 = new Panel2();

        add(panel1, BorderLayout.CENTER);
    }

    private class MyComboListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String panelActivo = (String)myCombo.getSelectedItem();
            if (panelActivo.contains("Panel1")){
                remove(panel2);
                add(panel1, BorderLayout.CENTER);
                panel1.revalidate(); //Necesario cuando hemos hecho remove
                panel1.repaint(); //Redibuja incorporando los nuevos componentes
            }else{
                remove(panel1);
                add(panel2, BorderLayout.CENTER);
                panel2.revalidate();
                panel2.repaint();
            }
        }
    }
}

class Panel1 extends JPanel{
    public Panel1(){
        JLabel label = new JLabel("Introduce tu nombre: ");
        JTextField text = new JTextField(8);
        this.add(label);
        this.add(text);
    }
}
class Panel2 extends JPanel{
    public Panel2(){
        this.setLayout(new GridLayout(3,3));
        for (Integer i=0; i<9;i++){
            JButton button = new JButton(i.toString());
            this.add(button);
        }
    }
}
