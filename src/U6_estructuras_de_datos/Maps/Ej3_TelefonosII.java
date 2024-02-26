package U6_estructuras_de_datos.Maps;

import java.util.*;

public class Ej3_TelefonosII {
    public static void main(String[] args) {
        Map<String, List<String>> contactos = new HashMap<>();
        contactos.put("Mamá", Arrays.asList("644787544", "964577636"));
        contactos.put("Universidad", Arrays.asList("978233674", "978442563"));
        contactos.put("Mariam", Arrays.asList("660238571", "956877323"));

        System.out.println("¿A quién quieres llamar?");
        for (String contacto : contactos.keySet()) {
            System.out.println(contacto);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> resultados = contactos.get(input);
        if (resultados == null) {
            System.out.println("El contacto seleccionado no existe");
        } else {
            System.out.println("¿Qué número de " + input + " quieres marcar?");
            for (String numeroDeTelefono : resultados) {
                System.out.println(numeroDeTelefono);
            }
            input = scanner.nextLine();
            if (resultados.contains(input)) {
                System.out.println("Llamando a... " + input);
            } else {
                System.out.println("El número seleccionado no existe");
            }
        }
    }
}
