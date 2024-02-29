package U6_estructuras_de_datos.Maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej9_LastNameFrequency {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un apellido: ");
        String input = scanner.nextLine();

        Map<String, String> frecuenciaApellidos = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("./recursos/LastnameFrequencies.csv"));
        String line;
        while ((line = reader.readLine())!= null) {
            String[] palabrasLinea = line.split(",");
            frecuenciaApellidos.put(palabrasLinea[0], palabrasLinea[1]);
        }
        reader.close();
    }
}
