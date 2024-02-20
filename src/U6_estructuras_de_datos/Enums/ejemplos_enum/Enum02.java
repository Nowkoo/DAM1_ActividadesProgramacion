package U06.Ejemplos.Example01_enums;

import U6_estructuras_de_datos.Enums.ejemplos_enum.Color;

/**
 * Algunas funciones específicas relacionada con enum
 * values() genera un array con las constantes del enum
 * valueOf(String) devuelve la constante identificada por el valor de String
 * ordinal() funcion de las constantes que nos muestra su posición
 **/

public class Enum02 {
    static Color c;
    public static void main(String[] args) {
        // utilizando las funciones tipicas de enum
        for (Color color:Color.values()){
            System.out.println(color.ordinal());
        }
        c = Color.valueOf("silver");
        System.out.println(c);
        System.out.println(c.ordinal());
        //c = Color.valueOf("red");
        //System.out.println(c);
        //System.out.println(c.ordinal());

    }

}
