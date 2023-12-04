package U4_ficheros.G4_LineOriented;

import java.io.*;
/**
 * Uso de BufferedWriter decorador de FileWriter para facilitar la escritura de líneas
 */
public class LineOriented_02_BufferedWriter {
    public static void main(String[] args) throws IOException {
        File ficheroEntrada = new File("./recursos/foo_buffer.txt");
        File ficheroSalida = new File("./recursos/foo_buffer_copia.txt");
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(ficheroEntrada));
        BufferedWriter flujoSalida = new BufferedWriter((new FileWriter(ficheroSalida)));
        String linea = flujoEntrada.readLine();
        while (linea != null){
            System.out.println(linea);
            flujoSalida.write(linea);
            flujoSalida.newLine();
            linea = flujoEntrada.readLine();

        }
        flujoEntrada.close();
        flujoSalida.close();
    }
}
