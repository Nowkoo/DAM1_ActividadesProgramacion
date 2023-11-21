package U4_ficheros;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOriented_02_Copia {

    public static void main(String[] args) throws IOException {
        FileInputStream fichero_entrada = new FileInputStream("./recursos/foo.txt");
        FileOutputStream fichero_salida = new FileOutputStream("./recursos/foo_copia.txt");

        int lectura = fichero_entrada.read();
        while (lectura != -1){
            fichero_salida.write(lectura);

            lectura = fichero_entrada.read();
        }

        fichero_entrada.close();
        fichero_salida.close();
    }

}
