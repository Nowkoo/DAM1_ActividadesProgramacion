package U6_estructuras_de_datos.Iteradores.Ej3_ToArray;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArraylistToArray conversor = new ArraylistToArray();
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Manzana");
        arraylist.add("Cebolla");
        String[] arraySimple = conversor.convertir(arraylist);
        //Los arrays primitivos no pueden proporcionar iterators
        for (String cadena : arraySimple) {
            System.out.println(cadena);
        }
    }
}
