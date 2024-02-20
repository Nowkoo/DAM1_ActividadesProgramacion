package U06.Ejemplos.Example01_enums;

import U6_estructuras_de_datos.Enums.ejemplos_enum.Color;

/**
 * Podemos hacer uso de las constantes de enum como argumentos de método.
 * También pueden ser utilizadas directamente en un bloque switch
 **/

public class Enum03 {
    static Color c;
    public static void main(String[] args) {
        // utilizando enum como argumento
        c = Color.black;
        dameColor(c);

    }
    public static void dameColor(Color c){
        switch (c){
            case none:
                System.out.println("no hay color");
                break;
            case black:
                System.out.println("todo está oscuro");
                break;
            case silver:
                System.out.println("color de segundo");
                break;
            default:
                System.out.println("otros colores");
        }
    }

}
