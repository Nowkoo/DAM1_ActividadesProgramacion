package U8_interfaces_gráficas.Ejemplos_MenuBar.Example1;

import javax.swing.*;
import java.awt.*;

/*
 * Uso JMenuBar, JMenu, JMenuItem
 * JMenuBar. Barra de menú que contiene elementos JMenu
 * JMenu. Elemento desplegable que contiene JMenuItem y JMenu
 * JMenuItem. Elementos que realizan acciones (actionListener).
 * Métodos: addSeparator
 */
public class MenuBar1 {
    public static void main(String[] args) {
        MainFrame myApp = new MainFrame();
        myApp.setTitle("MenuBar1");
        myApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MainFrame extends JFrame {
    public MainFrame(){
        this.setBounds(300,300,600,300);
        MainPanel myPanel = new MainPanel();
        this.add(myPanel);
        this.setVisible(true);
        //this.pack();
    }
}

class MainPanel extends JPanel {
    public MainPanel(){
        this.setLayout(new BorderLayout());
        JMenuBar myBar = new JMenuBar();
        JMenu menuArchive = new JMenu("Archivo");
        JMenuItem itemSave = new JMenuItem("Guardar");
        JMenuItem itemNew = new JMenuItem("Nuevo");
        itemNew.setEnabled(false);
        menuArchive.add(itemSave);
        menuArchive.add(itemNew);

        JMenu menuEdit = new JMenu("Editar");

        JMenu menuView = new JMenu("Vista");
        JMenuItem itemDark = new JMenuItem("Nocturno");
        JMenu menuBackground = new JMenu("Color de fondo");
        menuView.add(itemDark);
        menuView.addSeparator();
        menuView.add(menuBackground);
        JMenuItem itemRed = new JMenuItem("Rojo");
        JMenuItem itemBlue = new JMenuItem("Azul");
        JMenuItem itemWhite = new JMenuItem("Blanco");
        itemRed.addActionListener((e)->setBackground(Color.RED));
        itemBlue.addActionListener((e)->setBackground(Color.BLUE));
        itemWhite.addActionListener((e)->setBackground(Color.WHITE));
        menuBackground.add(itemBlue);
        menuBackground.add(itemRed);
        menuBackground.add(itemWhite);

        myBar.add(menuArchive);
        myBar.add(menuEdit);
        myBar.add(menuView);

        add(myBar, BorderLayout.NORTH);
        //pack();
    }

}
