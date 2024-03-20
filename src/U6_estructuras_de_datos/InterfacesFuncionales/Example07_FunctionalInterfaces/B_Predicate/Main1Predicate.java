package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.B_Predicate;

import java.util.List;
import java.util.function.Predicate;
/**
 * Interfaz funcional Predicate:
 * recibe un parámetro del tipo definido y genera un
 * resultado de tipo boolean.
 * Su función abstracta es "test" y su firma es del tipo:
 * boolean test(<T> t)
 */
public class Main1Predicate {
    static Predicate<String> validateName = name -> name.length()>5;

    public static void main(String[] args) {
        System.out.println("Michael: " + validateName.test("Michael"));
        System.out.println("John: " + validateName.test("John"));

        List<String> names = List.of("Michael", "Alan", "Mary", "Patricia");
        //versión clásica
        for (String name:names){
            if(validateName.test(name))
                System.out.println(name);
        }
        //versión programación funcional con función clásica
        names.stream().filter(validateName).forEach(System.out::println);
        //o también con función Lambda
        names.stream()
                .filter(streams)
                .forEach(name -> System.out.println(name));

    }
}
