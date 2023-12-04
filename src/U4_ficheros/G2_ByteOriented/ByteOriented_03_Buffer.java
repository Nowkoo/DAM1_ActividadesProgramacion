package U4_ficheros.G2_ByteOriented;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteOriented_03_Buffer {
    public static void main(String[] args) throws IOException{
        FileInputStream fichero_entrada = new FileInputStream("./recursos/foo_buffer.txt");
        byte[] buffer = new byte[30];
        int lectura = fichero_entrada.read(buffer);
        while (lectura!=-1){
            for (int i=0; i<lectura; i++){
                System.out.print((char)buffer[i]);
            }
            System.out.println("");
            lectura = fichero_entrada.read(buffer);
        }
        fichero_entrada.close();
    }
}
