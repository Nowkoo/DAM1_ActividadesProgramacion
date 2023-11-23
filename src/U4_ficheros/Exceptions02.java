package U4_ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
/**
 * Ejemplo básico 2 de uso de excepciones.
 * En la apertura de un fichero:
 * - Ejecutamos código de forma controlada dentro del try (existencia de fichero)
 * - En caso de error (Exception) se captura en el catch para su tratamiento.
 * El ejemplo también muestra el uso de argumentos de entrada en la llamada al
 * programa. Requiere modificar la configuración de ejecución del programa en
 * el IDE para que cargue estos argumentos o bien la ejecución directa con:
 * "java nombre_programa args0 args1 ... argsN"
 */
public class Exceptions02 {
    private static void leerFichero(File ficheroEntrada) {
        BufferedReader flujoEntrada = null;
        try {
            flujoEntrada = new BufferedReader(new FileReader(ficheroEntrada));
            String linea = flujoEntrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = flujoEntrada.readLine();
            }
            flujoEntrada.close();
        } catch (java.io.IOException e) {
            System.out.println("No se encuentra el fichero.");
        }
    }
    public static void main(String[] args){
        //File ficheroEntrada = new File("./recursos/foo_buffer1.txt");
        File ficheroEntrada = new File(args[0]);
        leerFichero(ficheroEntrada);
    }
}
