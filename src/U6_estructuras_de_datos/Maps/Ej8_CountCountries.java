package U6_estructuras_de_datos.Maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ej8_CountCountries {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> frecuenciaPais = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("./recursos/Colfuturo-Seleccionados.csv"));
        String line;
        while ((line = reader.readLine())!= null) {
            String[] palabrasLinea = line.split(",");
            String pais = palabrasLinea[6];
            frecuenciaPais.put(pais, frecuenciaPais.getOrDefault(pais, 0) + 1);
        }
        reader.close();

        for (String pais : frecuenciaPais.keySet()) {
            System.out.println(pais + " tiene " + frecuenciaPais.get(pais) + " alumnos");
        }
    }
}
