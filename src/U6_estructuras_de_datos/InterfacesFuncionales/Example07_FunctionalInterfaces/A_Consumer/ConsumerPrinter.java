package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.A_Consumer;

import java.util.function.Consumer;

public class ConsumerPrinter implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
