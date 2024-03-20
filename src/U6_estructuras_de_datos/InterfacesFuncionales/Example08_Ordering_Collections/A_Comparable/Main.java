package U6_estructuras_de_datos.InterfacesFuncionales.Example08_Ordering_Collections.A_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * La interfaz Comparable nos ofrece la forma "natural" de ordenación para la clase.
 * La definimos como natural porque esta debe quedar implementada en la propia clase
 * (ver Member) y permite que lo elementos de esta clase sean ordenados.
 * El inconveniente de esta opción es que esta forma de ordenación queda fijada y no
 * es alterable.
 */
public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("mikael", 182));
        members.add(new Member("matti", 187));
        members.add(new Member("ada", 184));

        System.out.println("-Original data (unordered list):");
        members.stream().forEach(m -> System.out.println(m));
        System.out.println();
        // sorting the stream that is to be printed using the sorted method
        System.out.println("-Ordered List using 'stream().sorted()':");
        members.stream().sorted().forEach(m -> System.out.println(m));
        System.out.println();
        System.out.println("-Remember, original data remains unchanged.");
        members.stream().forEach(m -> System.out.println(m));
        System.out.println();
        // sorting a list with the sort-method of the Collections class
        System.out.println("-Ordered List using previously 'Collections.sort(members)':");
        System.out.println("(in this case original data is reordered)");
        Collections.sort(members);
        members.stream().forEach(m -> System.out.println(m));

    }
}
