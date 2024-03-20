package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.F_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2Comparator {
    static Comparator<Product> priceComparator = Comparator.comparing(Product::getPrice);

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("1", "P1", 9.99, false),
                new Product("2", "P2", 29.99, false),
                new Product("3", "P3", 19.99, false),
                new Product("4", "P4", 5.99, false)
        ));
        System.out.println(products);
        products.sort(priceComparator);
        System.out.println(products);
        products.sort(priceComparator.reversed());
        System.out.println(products);

    }
}
