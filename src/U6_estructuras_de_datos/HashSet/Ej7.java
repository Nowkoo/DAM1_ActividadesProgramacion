package U6_estructuras_de_datos.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Ej7 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("gato");
        set1.add("perro");
        Set<String> set2 = new HashSet<>();
        set2.add("loro");
        set2.add("perro");
        System.out.println(diferencia(set1, set2));
    }

    public static Set<String> diferencia(Set<String> set1, Set<String> set2) {
        Set<String> resultado = new HashSet<>(set1);
        resultado.removeAll(set2);

        return resultado;
    }
}
