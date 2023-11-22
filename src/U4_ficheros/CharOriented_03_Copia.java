package U4_ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Introducimos la clase File que hace referencia al fichero con el que vamos a trabajar.
 */
public class CharOriented_03_Copia {
    public static void main(String[] args) throws IOException {
        File ficheroEntrada = new File("./recursos/boo.txt");
        File ficheroSalida = new File("./recursos/boo_copia.txt");
        FileReader flujoEntrada = new FileReader(ficheroEntrada);
        FileWriter flujoSalida = new FileWriter(ficheroSalida);

        char[] intercambio = new char[(int)ficheroEntrada.length()-1];
        flujoEntrada.read(intercambio);
        flujoSalida.write(new String(intercambio));

        flujoEntrada.close();
        flujoSalida.close();
    }
}
