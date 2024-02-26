package U6_estructuras_de_datos.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej2_Telefonos {
    public static void main(String[] args) {
        Map<String, String> paginasAmarillas = new HashMap<>();
        paginasAmarillas.put("Electricista", "664874562");
        paginasAmarillas.put("Peluquero", "964763345");
        paginasAmarillas.put("Carpintero", "692474557");

        System.out.println("¿A quién quieres llamar?");
        for (String contacto : paginasAmarillas.keySet()) {
            System.out.println(contacto);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String resultado = paginasAmarillas.getOrDefault(input, " ¿Qué contacto es ese?");
        System.out.println("Llamando a..." + resultado);
    }
}
