package U6_estructuras_de_datos.Iteradores.Ej4_Existe;

import java.util.ArrayList;

//No hay bucles que transformar
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
