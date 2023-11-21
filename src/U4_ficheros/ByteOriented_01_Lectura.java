package U4_ficheros;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteOriented_01_Lectura {

    public static void main(String[] args) throws IOException {
        FileInputStream fichero_entrada =   new FileInputStream("./recursos/foo.txt");
        int lectura = fichero_entrada.read();
        while (lectura != -1){
            System.out.println((char)lectura);
            lectura = fichero_entrada.read();
        }
        fichero_entrada.close();
    }

}
