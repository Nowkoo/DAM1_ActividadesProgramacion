package U4_ficheros.G5_Exceptions;

import java.io.*;

/**
 * Ejemplo de excepción no gestionada.
 * Ejecutamos código que puede generar una excepción y lo que hacemos
 * es evitar su tratamiento trasladándolo a la función superior.
 */
public class Exceptions00 {
    private static void leerFichero (File ficheroEntrada) throws IOException { //throws eleva la exception
        BufferedReader flujoEntrada = null;
        flujoEntrada = new BufferedReader(new FileReader(ficheroEntrada));
        String linea = flujoEntrada.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = flujoEntrada.readLine();
        }
        flujoEntrada.close();

    }
    public static void main(String[] args) throws IOException { //throws eleva la exception
        File ficheroEntrada = new File("./recursos/foo_buffer1.txt");
        leerFichero(ficheroEntrada);
    }
}
