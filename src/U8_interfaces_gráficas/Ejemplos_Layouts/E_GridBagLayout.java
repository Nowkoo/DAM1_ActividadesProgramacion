package U8_interfaces_gráficas.Ejemplos_Layouts;

import javax.swing.*;
import java.awt.*;

/**
 * GridBagLayout: Permite gestionar de forma flexible el espacio ocupado por los
 * componentes permitiendo que estos ocupen más de una celda.
 */

public class E_GridBagLayout {

    public static void main(String[] args){
        MarcoGridBagLayout mimarco = new MarcoGridBagLayout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }


}

class MarcoGridBagLayout extends JFrame{

    public MarcoGridBagLayout(){

        this.setTitle("Ejemplo GridBagLayout");
        this.setBounds(750,300,300,200);

        LaminaGridBagLayout miLamina = new LaminaGridBagLayout();
        this.add(miLamina);
        //pack();

    }
}

class LaminaGridBagLayout extends JPanel {
    JTextArea areaTexto;
    JTextField campoTexto;
    JButton boton1, boton2, boton3, boton4;
    GridBagConstraints constraints;
    public LaminaGridBagLayout(){
        setLayout(new GridBagLayout());
        createComponents();
        //initComponents0();
        //initComponents1();
        initComponents2();

    }
    public void createComponents(){
        areaTexto = new JTextArea ("Area texto");
        boton1 = new JButton ("Boton 1");
        boton2 = new JButton ("Boton 2");
        boton3 = new JButton ("Boton 3");
        boton4 = new JButton ("Boton 4");
        campoTexto = new JTextField ("Campo texto");
        constraints = new GridBagConstraints();
    }
    public void initComponents0(){
        //areaTexto
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 2; // El área de texto ocupa 2 filas.
        add (areaTexto, constraints);
        //boton1
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton1, constraints);
        //boton2
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton2, constraints);
        //boton3
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton3, constraints);
        //boton4
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton4, constraints);
        //campoTexto
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (campoTexto, constraints);
    }
    public void initComponents1(){

        constraints.gridx = 0; // Columna 0. No necesita estirarse, no ponemos weightx
        constraints.gridy = 0; // Fila 0. Necesita estirarse, hay que poner weighty
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.weighty = 1.0; // La fila 0 debe estirarse, le ponemos un 1.0
        add (areaTexto, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        constraints.gridx = 2; // Columna 2. No necesita estirarse, no ponemos weightx
        constraints.gridy = 0; // Fila 0. Necesita estirarse, hay que poner weighty
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; /* La fila 0 debe estirarse, le ponemos un 1.0. Ya lo hicimos en el area de texto, pero aquí debemos ser coherentes y poner lo mismo.*/
        add (boton1, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        constraints.gridx = 2; // Columna 2, no necesita estirarse, no ponemos weigthx
        constraints.gridy = 1; // Fila 1, necesita estirarse, hay que poner weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; // La fila 1 debe estirarse, le ponemos 1.0
        add (boton2, constraints);
        constraints.weighty = 0.0; // Restauramos el valor por defecto.

        constraints.gridx = 0; // Columna 0, no necesita estirarse, no ponemos weigthx
        constraints.gridy = 2; // Fila 2, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton3, constraints);

        constraints.gridx = 2; // Columna 2, no necesita estirarse, no ponemos weightx
        constraints.gridy = 2; // Fila 2, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton4, constraints);

        constraints.gridx = 1; // Columna 1, debe estirarse, le ponemos el weigthx
        constraints.gridy = 2; // Fila 2, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; // La columna 1 debe estirarse, ponemos el 1.0 en weigthx
        add (campoTexto, constraints);
    }
    public void initComponents2(){

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        // El area de texto debe estirarse en ambos sentidos. Ponemos el campo fill.
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 8.0;
        add (areaTexto, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 5.0;
        // El botón 1 debe ocupar la posición NORTH de su celda
        constraints.anchor = GridBagConstraints.NORTH;
        // El botón 1 no debe estirarse. Habíamos cambiado este valor en el
        // area de texto, asi que lo restauramos.
        constraints.fill = GridBagConstraints.NONE;
        add (boton1, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 3.0;
        // El boton 2 debe ocupar la posición NORTH de su celda.
        constraints.anchor = GridBagConstraints.NORTH;
        add (boton2, constraints);
        // Restauramos valores por defecto.
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton3, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        add (boton4, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        // El campo de texto debe estirarse sólo en horizontal.
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add (campoTexto, constraints);
    }
}