package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.D_Supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Interfaz funcional Supplier:
 * no recibe parámetros y genera un resultado del tipo definido.
 * Su función abstracta es "generate" y su firma es del tipo:
 * <T> generate()
 */
public class Main1Supplier {
    static Supplier<Double> generator = ()->Math.random();
    static Supplier<Integer> generateInteger = () -> new Random().nextInt();

    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.println(generator.get());
            System.out.println(generateInteger.get());
            System.out.println();
        }
    }
}
