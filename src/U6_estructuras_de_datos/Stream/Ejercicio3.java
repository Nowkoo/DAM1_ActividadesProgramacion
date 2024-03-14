package U6_estructuras_de_datos.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Patricia", "Pérez", 1963));
        personas.add(new Persona("Manolo", "Méndez", 1986));
        personas.add(new Persona("Alicia", "Álvarez", 1971));
        personas.add(new Persona("Manolo", "Martínez", 1971));

        List<String> nombresUnicos = personas.stream()
                .map(persona -> persona.getFirstName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Nombres únicos: " + nombresUnicos);
    }
}
