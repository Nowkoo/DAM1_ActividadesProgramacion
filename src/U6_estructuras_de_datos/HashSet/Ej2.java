package U6_estructuras_de_datos.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ej2 {
    public static void main(String[] args) {
        HashSet<Integer> enteros = new HashSet<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros = incrementar(enteros, 1);
        System.out.println(enteros);
    }

    public static HashSet<Integer> incrementar(HashSet<Integer> enteros, int incremento) {
        Iterator<Integer> it = enteros.iterator();
        HashSet<Integer> newSet = new HashSet<Integer>();
        while (it.hasNext()) {

            int actual = it.next();
            newSet.add(++actual);
        }
        return newSet;
    }
}


