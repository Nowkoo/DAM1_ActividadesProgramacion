package U6_estructuras_de_datos.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej1_PaisCapital {
    public static void main(String[] args) {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");
        capitales.put("Alemania", "Berlín");

        System.out.println("¿De qué país quieres saber la capital?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String resultado = capitales.get(input);
        if (resultado == null) {
            System.out.println("No conozco la capital de " + input);
        } else {
            System.out.println("La capital de " + input + " es " + resultado);
        }
    }
}
