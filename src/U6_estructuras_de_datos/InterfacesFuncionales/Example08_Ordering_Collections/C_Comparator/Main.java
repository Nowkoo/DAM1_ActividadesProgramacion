package U6_estructuras_de_datos.InterfacesFuncionales.Example08_Ordering_Collections.C_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *La interfaz Comparator nos ofrece la solución más completa y legible para implementar
 * distintos tipos de ordenaciones y combinaciones de estas.
 * Nos ofrece la flexibilidad de las funciones lambda pero permite implementar soluciones
 * más complejas de forma más facilmente legible.
 */
public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        System.out.println("Films unordered:");
        for (Film e: films) {
            System.out.println(e);
        }
        System.out.println();

        //Ordering collection
        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);
        System.out.println("Films ordered:");
        for (Film e: films) {
            System.out.println(e);
        }
        //Ordering Stream
        Comparator<Film> nameCompare = Comparator.comparing(Film::getName);
        Comparator<Film> releaseCompare = (r1,r2)-> r1.getReleaseYear().compareTo(r2.getReleaseYear());

        comparator = releaseCompare.reversed().thenComparing(nameCompare);
        System.out.println("Films ordered:");
        films.stream().sorted(comparator).forEach(System.out::println);

    }
}
