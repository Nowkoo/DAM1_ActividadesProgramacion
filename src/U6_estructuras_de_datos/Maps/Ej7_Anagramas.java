package U6_estructuras_de_datos.Maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ej7_Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, List<String>> diccionario = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("./recursos/spanish-dict.txt"));
        String line;
        while ((line = reader.readLine())!=null) {
            String palabraOrdenada = ordenarAlfabeticamente(line);
            List<String> palabras = diccionario.get(palabraOrdenada);
            if (palabras == null) {
                diccionario.put(palabraOrdenada, palabras = new ArrayList<>());
            }
            palabras.add(line);
        }
        reader.close();

        imprimir(diccionario, 0);
    }

    public static String ordenarAlfabeticamente(String palabra) {
        char[] charArray = palabra.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void imprimir(Map<String, List<String>> diccionario, int minSize) {
        for (List<String> palabras : diccionario.values()) {
            if (palabras.size() > minSize) {
                System.out.println(palabras.size());
            }
        }
    }
}
