package U6_estructuras_de_datos.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Ej6 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("gato");
        set1.add("perro");
        Set<String> set2 = new HashSet<>();
        set2.add("loro");
        set2.add("perro");
        System.out.println(interseccion(set1, set2));
    }

    public static Set<String> interseccion(Set<String> set1, Set<String> set2) {
        Set<String> combinacion = new HashSet<>(set1);
        combinacion.retainAll(set2);
        return combinacion;
    }
}
