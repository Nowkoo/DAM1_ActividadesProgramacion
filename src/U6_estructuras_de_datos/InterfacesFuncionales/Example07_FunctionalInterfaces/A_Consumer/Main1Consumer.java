package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.A_Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/**
 * Interfaz funcional Consumer:
 * recibe un parámetro del tipo definido y no genera resultado.
 * Su función abstracta es "accept" y su firma es del tipo:
 * void accept(<T> t)
 */
public class Main1Consumer {
    public static void main(String[] args) {
        //implementación mediante clase anónima
        Consumer<String> printer = new Consumer<>(){
            public void accept(String message){
                System.out.println(message);
            }
        };
        printer.accept("Hola con clase anónima");

        //implementación mediante clase ad-hoc
        printer = new ConsumerPrinter();
        //printer.accept("Hola con clase ad-hoc");

        //implementación de función lambda compatible con la IF consumer
        printer = message -> System.out.println(message);
        ///printer.accept("Hola con lambda");

        //Ejemplo de uso de funciones definidas en interfaz consumer: uso andThen
        Consumer<String> hello = message-> System.out.println("Hello " + message); //lambda tipo consumer
        Consumer<String> bye = message-> System.out.println("Bye bye " + message); //lambda tipo consumer
        printer = hello.andThen(bye); //composición de lambdas tipo consumer con andThen
        //printer.accept("Peter");

        //Aplicación forEach
        List<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Mary");
        names.add("Anne");
        names.add("Claude");
        //names.forEach(name -> System.out.println(name));
        names.forEach(printer);
        // Versión clásica con bucle
        //for (String name : names) {System.out.println(name);}
    }
}
