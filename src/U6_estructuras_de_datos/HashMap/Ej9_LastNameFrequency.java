package U6_estructuras_de_datos.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej9_LastNameFrequency {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un apellido (sin tildes): ");
        String input = scanner.nextLine().toUpperCase();

        Map<String, String> frecuenciaApellidos = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("./recursos/LastnameFrequencies.csv"));
        String line;
        while ((line = reader.readLine())!= null) {
            String[] palabrasLinea = line.split(",");
            if (line.length() != 0) {
                frecuenciaApellidos.put(palabrasLinea[0], palabrasLinea[1]);
            }
        }
        reader.close();

        if (frecuenciaApellidos.containsKey(input)) {
            System.out.println("Frecuencia de " + input + ": " + frecuenciaApellidos.get(input));
        } else {
            System.out.println("No contengo registros del apellido seleccionado");
        }
    }
}
