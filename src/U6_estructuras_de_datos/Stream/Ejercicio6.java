package U6_estructuras_de_datos.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduce un nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.length() == 0) break;
            System.out.println("Introduce un apellido: ");
            String apellido = scanner.nextLine();
            if (apellido.length() == 0) break;
            System.out.println("Introduce un año de nacimiento: ");
            int fechaNacimiento = scanner.nextInt();
            scanner.nextLine();
            if (fechaNacimiento < 1900) break;
            personas.add(new Persona(nombre, apellido, fechaNacimiento));
        }

        personas.stream()
                .map(persona -> persona.getLastName())
                .distinct()
                .sorted()
                .forEach(cadena -> System.out.println(cadena));
    }
}
