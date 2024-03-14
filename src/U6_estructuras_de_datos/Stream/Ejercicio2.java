package U6_estructuras_de_datos.Stream;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Patricia", "Pérez", 1963));
        personas.add(new Persona("Manolo", "Méndez", 1986));
        personas.add(new Persona("Alicia", "Álvarez", 1971));
        personas.add(new Persona("Manolo", "Martínez", 1971));

        long apellidoEmpiezaPorA = personas.stream()
                .map(persona -> persona.getLastName())
                .filter(apellido -> apellido.charAt(0) == 'A' || apellido.charAt(0) == 'Á')
                .count();
        System.out.println("Número de personas el apellido de las cuales empieza por A: " + apellidoEmpiezaPorA);
    }
}
