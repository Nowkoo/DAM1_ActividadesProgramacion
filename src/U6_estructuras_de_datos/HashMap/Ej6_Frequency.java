package U6_estructuras_de_datos.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej6_Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();
        System.out.println("Introduce una serie de palabras separadas por espacios: ");
        do {
            System.out.println("Introduce una palabra: ");
            input = scanner.nextLine();
            if (input.length() == 0) break;
            frecuenciaPalabras.put(input, frecuenciaPalabras.getOrDefault(input, 0) + 1);
        } while (input.length() != 0);

        for (String palabra : frecuenciaPalabras.keySet()) {
            System.out.println(palabra + " - " + frecuenciaPalabras.get(palabra));
        }
    }
}
