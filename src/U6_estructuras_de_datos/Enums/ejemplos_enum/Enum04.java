package U06.Ejemplos.Example01_enums;

import U6_estructuras_de_datos.Enums.ejemplos_enum.Color;

/**
 * Los elementos del enum al ser constantes no pueden ser instanciados con new
 * Si podemos hacer referencia múltiple al mismo elemento
 **/

public class Enum04 {

    static Color c, d;
    public static void main(String[] args) {
        // Error de compilación
        //Color c = new Color(silver);
        c = Color.silver;
        d = Color.silver;
        System.out.println(c.equals(d));
    }

}
