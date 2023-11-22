package U4_ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Uso de BufferedReader decorador de FileReader para facilitar la lectura de líneas
 */
public class LineOriented_01_BufferedReader {
    public static void main(String[] args) throws IOException {
        File ficheroEntrada = new File("./recursos/foo_buffer.txt");
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(ficheroEntrada));
        String linea = flujoEntrada.readLine();
        while (linea != null){
            System.out.println(linea);
            linea = flujoEntrada.readLine();
        }
        flujoEntrada.close();
    }
}
