package U6_estructuras_de_datos.ArrayList.ToArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArraylistToArray conversor = new ArraylistToArray();
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Manzana");
        arraylist.add("Cebolla");
        String[] arraySimple = conversor.convertir(arraylist);
        for (String cadena : arraySimple) {
            System.out.println(cadena);
        }
    }
}
