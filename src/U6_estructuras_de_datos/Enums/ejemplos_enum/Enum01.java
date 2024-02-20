package U06.Ejemplos.Example01_enums;

import U6_estructuras_de_datos.Enums.ejemplos_enum.Color;

/**
 * enum en Java es un tipo especial de clase que representa un conjunto de
 * elementos constantes.
 * Los elementos los llamamos constantes porque son public static final (por defecto) no modificable.
 * Estas constantes son realmente objetos pero no son instanciables dado su caracter "constante"
 **/

public class Enum01 {

    static Color c,d,e,f;
    public static void main(String[] args) {
        c = Color.black;
        d = Color.none;
        e = Color.silver;
        f = Color.black;
        // utilizando las funciones tipicas de object
        usingEquals();
        usingToSring();
    }
    public static void usingEquals(){
        if (c.equals(Color.black)  && c == Color.black){
            System.out.println("Verificado equals() y ==");
        }
    }
    public static void usingToSring(){
        System.out.println("Verificando toString()");
        System.out.println(c.toString() + " = " + c + " ordinal=" + c.ordinal());
    }
}
