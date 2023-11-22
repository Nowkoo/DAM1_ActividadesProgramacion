package U4_ficheros;

import java.io.*;
/**
 * Uso de PrintWriter decorador de FileWriter para facilitar la escritura de líneas
 */
public class LineOriented_03_PrintWriter {
    public static void main(String[] args) throws IOException {
        File ficheroEntrada = new File("./recursos/foo_buffer.txt");
        File ficheroSalida = new File("./recursos/foo_buffer_copia.txt");
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(ficheroEntrada));
        PrintWriter flujoSalida = new PrintWriter(new FileWriter(ficheroSalida));
        String linea = flujoEntrada.readLine();
        int i = 0;
        while (linea != null){
            i++;
            System.out.println(linea);
            flujoSalida.println(i + ".- " + linea);
            linea = flujoEntrada.readLine();

        }
        flujoEntrada.close();
        flujoSalida.close();
    }
}
