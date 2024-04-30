package U8_interfaces_gráficas.Ejemplos_JComboBox.Example3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Combinamos el uso de combobox y botones sobre un mismo objetivo.
 *
 */
public class ComboBox3 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("ComboBox3");
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
    JButton button1, button2;
    public MainPanel(){
        this.setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        add(northPanel, BorderLayout.NORTH);
        myCombo = new JComboBox();

        myCombo.addItem("Panel1");
        myCombo.addItem("Panel2");
        northPanel.add(myCombo);
        //myCombo.addActionListener(new MyComboListener());

        panel1 = new Panel1();
        panel2 = new Panel2();
        myCombo.setAction(new ActionPanel("Combo"));
        add(panel1, BorderLayout.CENTER);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        //button1 = new JButton("Panel1");
        button1 = new JButton(new ActionPanel("Panel1"));
        //button2 = new JButton("Panel2");
        button2 = new JButton(new ActionPanel("Panel2"));
        //button1.addActionListener(new MyComboListener());
        //button2.addActionListener(new MyComboListener());
        westPanel.add(button1);
        westPanel.add(button2);
        add(westPanel, BorderLayout.WEST);
    }


    class ActionPanel extends AbstractAction{
        public ActionPanel(String idPanel){
            putValue(Action.NAME, idPanel);
            putValue(Action.SHORT_DESCRIPTION, "Activate " + idPanel);
            putValue("panel", idPanel);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String value = (String)this.getValue("panel");
            if (value.contains("Combo")){
                value = (String)myCombo.getSelectedItem();
            }
            if (value.contains("Panel1")){
                remove(panel2);
                add(panel1, BorderLayout.CENTER);
                panel1.revalidate();
                panel1.repaint();
            }else{
                remove(panel1);
                add(panel2, BorderLayout.CENTER);
                panel2.revalidate();
                panel2.repaint();
            }
        }
    }
    /**
    private class MyComboListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String panelActivo = (String)myCombo.getSelectedItem();
            if (panelActivo.contains("Panel1")){
                remove(panel2);
                add(panel1, BorderLayout.CENTER);
                panel1.revalidate();
                panel1.repaint();
            }else{
                remove(panel1);
                add(panel2, BorderLayout.CENTER);
                panel2.revalidate();
                panel2.repaint();
            }
        }
    }*/
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
