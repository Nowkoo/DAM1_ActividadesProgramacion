package U4_ficheros;

import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de lectura con FileReader.
 * A nivel interno Java utiliza UTF-16 (unicode de 16 bits) para la codificación de texto.
 * Los S.O., de forma nativa, utilizan sus propias codificaciones: Linux UTF-8 y
 * MS Windows ISO-8859-1.
 * Por esta razón tanto FileReader como FileWriter se encargan, de forma transparente para
 * el programador, de realizar las correspondientes transformaciones de codificación.
 */
public class CharOriented_01_Lectura {

    public static void main(String[] args) throws IOException {
        FileReader fichero_entrada =   new FileReader("./recursos/foo.txt");
        int lectura = fichero_entrada.read();
        while (lectura != -1){
            System.out.println((char)lectura);
            lectura = fichero_entrada.read();
        }
        fichero_entrada.close();
    }

}