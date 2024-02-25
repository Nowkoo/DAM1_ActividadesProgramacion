package U6_estructuras_de_datos.Iteradores.Ej3_ToArray;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistToArray {
    public String[] convertir(ArrayList<String> arraylist) {
        String[] arrayResultante = new String[arraylist.size()];
        //No conviene transformar este bucle a iterator porque utilizo el iterador
        for (int i = 0; i < arrayResultante.length; i++) {
            arrayResultante[i] = arraylist.get(i);
        }
        return arrayResultante;
    }
}
