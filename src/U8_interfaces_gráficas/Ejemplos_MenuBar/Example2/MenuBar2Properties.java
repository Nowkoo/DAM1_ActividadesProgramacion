package U8_interfaces_gráficas.Ejemplos_MenuBar.Example2;

import javax.swing.*;
import java.awt.*;

/*
 * Uso JMenuBar, JMenu, JMenuItem, Properties
 */
public class MenuBar2Properties {
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
    }
}

class MainPanel extends JPanel {

    JMenu menuArchive, menuEdit, menuView, menuLanguage;
    JMenuItem itemSave, itemNew, itemDark, itemEs, itemEn;
    public MainPanel(){
        Language language =new Language(Language.spanish);
        this.setLayout(new BorderLayout());
        JMenuBar myBar = new JMenuBar();
        menuArchive = new JMenu(language.getProperty("menuArchive"));
        itemSave = new JMenuItem(language.getProperty("itemSave"));
        itemNew = new JMenuItem(language.getProperty("itemNew"));
        itemNew.setEnabled(false);
        menuArchive.add(itemSave);
        menuArchive.add(itemNew);

        menuEdit = new JMenu(language.getProperty("menuEdit"));

        menuView = new JMenu(language.getProperty("menuView"));
        itemDark = new JMenuItem(language.getProperty("itemDark"));
        menuLanguage = new JMenu(language.getProperty("menuLanguage"));
        menuView.add(itemDark);
        menuView.addSeparator();
        menuView.add(menuLanguage);
        itemEs = new JMenuItem(language.getProperty("itemEs"));
        itemEn = new JMenuItem(language.getProperty("itemEn"));
        itemEs.addActionListener((e)-> changeLanguage(Language.spanish));
        itemEn.addActionListener((e)-> changeLanguage(Language.english));
        menuLanguage.add(itemEn);
        menuLanguage.add(itemEs);

        myBar.add(menuArchive);
        myBar.add(menuEdit);
        myBar.add(menuView);

        add(myBar, BorderLayout.NORTH);
    }
    public void changeLanguage(int newLang){
        Language language = new Language(newLang);
        menuArchive.setText(language.getProperty("menuArchive"));
        itemNew.setText(language.getProperty("itemNew"));
        itemSave.setText(language.getProperty("itemSave"));
        menuEdit.setText(language.getProperty("menuEdit"));
        menuView.setText(language.getProperty("menuView"));
        itemDark.setText(language.getProperty("itemDark"));
        menuLanguage.setText(language.getProperty("menuLanguage"));
        itemEn.setText(language.getProperty("itemEn"));
        itemEs.setText(language.getProperty("itemEs"));
    }
}
