package U6_estructuras_de_datos.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Patricia", "Pérez", 1963));
        personas.add(new Persona("Manolo", "Méndez", 1986));
        personas.add(new Persona("Alicia", "Álvarez", 1971));
        personas.add(new Persona("Manolo", "Martínez", 1971));

        long antesDe1970 = personas.stream()
                .mapToInt(persona -> persona.getBirthYear())
                .filter(nacimiento -> nacimiento < 1970)
                .count();
        System.out.println("Número de personas que han nacido antes de 1970: " + antesDe1970);
    }
}
