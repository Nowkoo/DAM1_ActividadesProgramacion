package U6_estructuras_de_datos.ArrayList.Existe;

import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("manzana");
        System.out.println(existe(arraylist, "manzana"));
        System.out.println(existe(arraylist, "cebolla"));
    }

    public static boolean existe(ArrayList<String> arraylist, String stringAEncontrar) {
        return arraylist.contains(stringAEncontrar);
    }
}
