package U6_estructuras_de_datos.Maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ej7_Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, String> diccionario = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("./recursos/spanish-dict.txt"));
        String line;
        while ((line = reader.readLine())!=null) {
            diccionario.put(ordenarAlfabeticamente(line) , line);
        }
        reader.close();
    }

    public static String ordenarAlfabeticamente(String palabra) {
        palabra = palabra.toLowerCase();
        String palabraOrdenada;
        char temp;
        for (int i = 0; i < palabra.length() - 1; i++) {
            for (int j = i + 1; j < palabra.length(); j++) {
                if (palabra.charAt(i) < palabra.charAt(j)) {
                    temp = palabra.charAt(i);

                }
            }
            palabraOrdenada = palabraOrdenada + temp;
        }
        return "";
    }
}
