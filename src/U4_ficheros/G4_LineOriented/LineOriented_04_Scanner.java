package U4_ficheros.G4_LineOriented;

import java.io.*;
import java.util.Scanner;

/**
 * Uso de Scanner para facilitar la lectura de líneas
 */
public class LineOriented_04_Scanner {
    public static void main(String[] args) throws IOException {
        File ficheroEntrada = new File("./recursos/foo_buffer.txt");
        File ficheroSalida = new File("./recursos/foo_buffer_copia.txt");
        Scanner flujoEntrada = new Scanner(new FileReader(ficheroEntrada));
        PrintWriter flujoSalida = new PrintWriter(new FileWriter(ficheroSalida));
        String linea;
        int i = 0;

        while (flujoEntrada.hasNextLine()){
            i++;
            linea = flujoEntrada.nextLine();
            System.out.println(linea);
            flujoSalida.println(i + ".- " + linea);
        }
        flujoEntrada.close();
        flujoSalida.close();
    }
}
