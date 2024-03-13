package U6_estructuras_de_datos.HashSet;

import java.util.HashSet;

public class Ej1 {
    public static void main(String[] args) {
        HashSet<Integer> enteros = new HashSet<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(2);

        for (int entero : enteros) {
            System.out.println(entero);
        }
    }
}
