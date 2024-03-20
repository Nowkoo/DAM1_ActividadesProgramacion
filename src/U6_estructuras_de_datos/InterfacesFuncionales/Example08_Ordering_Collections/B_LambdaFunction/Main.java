package U6_estructuras_de_datos.InterfacesFuncionales.Example08_Ordering_Collections.B_LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Otra opción para la ordenación es definir mediante funciones lambda como queremos
 * que se ejecute la ordenación.
 * La ordenación puede ser simple mediante una expresión o todo lo compleja que queramos
 * codificando el bloque de código.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Grace Hopper", 1906));
        persons.add(new Person("Ada Lovelace", 1815));
        persons.add(new Person("Mary Coombs", 1929));
        persons.add(new Person("Irma Wyman", 1928));


        persons.stream().sorted((p1, p2) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(p -> System.out.println(p.getName()));

        System.out.println();

        persons.stream().forEach(p -> System.out.println(p));

        System.out.println();

        System.out.println("Ordered by birthyear:");
        Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
        persons.stream().forEach(p -> System.out.println(p));

        System.out.println();

        System.out.println("Ordered alphabetically (reverse):");
        Collections.sort(persons, (p1, p2) -> p2.getName().compareTo(p1.getName()));

        persons.stream().forEach(p -> System.out.println(p));

    }
}
