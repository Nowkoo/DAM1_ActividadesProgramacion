package U6_estructuras_de_datos.ArrayList.Ej5_AddAll;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        lista1.add("Manzana");
        lista2.add("Cebolla");
        lista1.addAll(lista2);
        System.out.println(lista1);
    }
}
