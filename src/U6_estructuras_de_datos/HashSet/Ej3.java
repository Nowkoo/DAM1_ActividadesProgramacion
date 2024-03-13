package U6_estructuras_de_datos.HashSet;

import java.util.HashSet;

public class Ej3 {
    public static void main(String[] args) {
        String[] palabras = new String[] {"gato", "gato", "perro"};
        imprimeSinDuplicados(palabras);
    }

    public static void imprimeSinDuplicados(String[] conDuplicados) {
        HashSet<String> sinDuplicados = new HashSet();
        for (String cadena : conDuplicados) {
            sinDuplicados.add(cadena);
        }

        for (String cadena : sinDuplicados) {
            System.out.println(cadena);
        }
    }
}
