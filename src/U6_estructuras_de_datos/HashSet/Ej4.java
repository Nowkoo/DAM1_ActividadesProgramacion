package U6_estructuras_de_datos.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Ej4 {
    public static void main(String[] args) {
        String[] palabras = new String[] {"gato", "gato", "perro"};
        imprimeDuplicados(palabras);
    }

    public static void imprimeDuplicados(String[] conDuplicados) {
        HashSet<String> sinDuplicados = new HashSet<>();
        HashSet<String> duplicados = new HashSet<>();

        for (String cadena : conDuplicados) {
            if (sinDuplicados.contains(cadena)) {
                duplicados.add(cadena);
            }
            sinDuplicados.add(cadena);
        }

        for (String cadena : duplicados) {
            System.out.println(cadena);
        }
    }
}
