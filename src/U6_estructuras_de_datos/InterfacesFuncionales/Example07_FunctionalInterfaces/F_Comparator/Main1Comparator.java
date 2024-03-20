package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.F_Comparator;

import java.util.Comparator;
/**
 * Interfaz funcional Comparator:
 * recibe dos parámetros del mismo tipo definido y genera
 * un resultado entero.
 * Su función abstracta es "compare" y su firma es del tipo:
 * int compare(<T> t1, <T> t2)
 * El resultado debería ser >0 si t1 se considera mayor que t2
 * <0 si se considera menor y ==0 si se consideran equivalentes
 */
public class Main1Comparator {
    public static void main(String[] args) {
        Comparator<Double> comp1 = (d1, d2) -> d1.compareTo(d2);

        System.out.println(comp1.compare(10.0, 5.0));
        System.out.println(comp1.compare(10.0, 10.0));
        System.out.println(comp1.compare(10.0, 15.0));

        Product product1 = new Product("1", "Pantalón", 9.99, false);
        Product product2 = new Product("2", "Camiseta", 12.0, false);

        Comparator<Product> priceComparator = (p1,p2) -> p1.getPrice().compareTo(p2.getPrice());
        Comparator<Product> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        System.out.println("Comparando productos");
        System.out.println(priceComparator.compare(product1, product2));
        System.out.println(nameComparator.compare(product1, product2));
        //Equivalentemente
        Comparator<Product> priceComparatorAlt = Comparator.comparing(Product::getPrice);
        Comparator<Product> nameComparatorAlt = Comparator.comparing(Product::getName);
        System.out.println(priceComparatorAlt.compare(product1, product2));
        System.out.println(nameComparatorAlt.compare(product2, product1));

    }
}
