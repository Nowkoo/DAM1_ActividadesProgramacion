package U4_ficheros.G3_CharOriented;

import java.io.FileWriter;
import java.io.IOException;

public class CharOriented_02_Escritura {

    public static void main(String[] args) throws IOException {
        //FileWriter fichero_salida = new FileWriter("./recursos/boo.txt");
        FileWriter fichero_salida = new FileWriter("./recursos/boo.txt", true);
        String texto = "Texto a transcribir haciendo uso de la escritura orientada a carácter.";

        for (int i = 0; i < texto.length() ; i++) {
            fichero_salida.write(texto.charAt(i));
        }
        fichero_salida.close();
    }
}

