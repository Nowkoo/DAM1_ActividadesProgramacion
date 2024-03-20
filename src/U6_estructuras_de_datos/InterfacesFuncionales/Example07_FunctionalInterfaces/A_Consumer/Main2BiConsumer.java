package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.A_Consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
/**
 * Interfaz funcional BiConsumer:
 * recibe dos parámetros de los tipos definidos y no genera resultado.
 * Su función abstracta es "accept" y su firma es del tipo:
 * void accept(<T> t, <U> u)
 */
public class Main2BiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> print2 = (x,y)-> System.out.println(x + " + " + y);
        print2.accept(4,5);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Lucy");
        map.put(2, "Carla");
        map.put(3, "John");
        map.put(4, "Lara");
        map.forEach((key, value)->{
            System.out.print("key: " + key);
            System.out.println(" value: " + value);
        });
    }
}
