package U6_estructuras_de_datos.ArrayList.ToArray;

import java.util.ArrayList;

public class ArraylistToArray {
    public String[] convertir(ArrayList<String> arraylist) {
        String[] arrayResultante = new String[arraylist.size()];
        for (int i = 0; i < arrayResultante.length; i++) {
            arrayResultante[i] = arraylist.get(i);
        }
        return arrayResultante;
    }
}
