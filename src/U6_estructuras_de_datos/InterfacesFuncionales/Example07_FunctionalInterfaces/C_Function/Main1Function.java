package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.C_Function;

import java.util.function.BiFunction;
import java.util.function.Function;
/**
 * Interfaz funcional Function:
 * recibe un parámetro del tipo definido T y genera un
 * resultado del tipo R. T y R podrían ser el mismo tipo.
 * Su función abstracta es "apply" y su firma es del tipo:
 * <R> apply(<T> t)
 * La interfaz funcional BiFunction tiene dos parámetros de
 * entrada y uno de salida <T,U,R>
 * Su firma es del tipo:
 * <R> apply(<T> t, <U> u)
 */
public class Main1Function {
    static Function<String, Integer> extractLength = s -> s.length();

    public static void main(String[] args) {
        System.out.println(extractLength.apply("Hola mundo"));

        BiFunction <Integer, Integer, Boolean> multiple = (num, den) -> num % den == 0;
        System.out.println(multiple.apply(27, 9));
        System.out.println(multiple.apply(27, 8));
    }
}
