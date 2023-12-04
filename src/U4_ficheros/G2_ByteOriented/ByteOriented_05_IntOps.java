package U4_ficheros.G2_ByteOriented;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ByteOriented_05_IntOps {

    public static void main(String[] args) throws IOException {
        FileOutputStream fichero_salida = new FileOutputStream("./recursos/foo_enteros.bin");
        int[] intArray = {23,56,-100,99};
        BigInteger bigInt;

        for (int i=0;i<intArray.length;i++){
            ByteBuffer bb_escritura = ByteBuffer.allocate(4); // tamaño de int
            bb_escritura.putInt(intArray[i]);
            byte[] bytesOut = bb_escritura.array();
            fichero_salida.write(bytesOut);
        }

        fichero_salida.close();

        FileInputStream fichero_entrada = new FileInputStream("./recursos/foo_enteros.bin");
        byte[] byteArray = {0x00, 0x00, 0x00, 0x00};
        int lectura = fichero_entrada.read(byteArray);
        while (lectura != -1){
            ByteBuffer bb_leido = ByteBuffer.wrap(byteArray);
            int valor = bb_leido.getInt();
            System.out.println(valor);
            lectura = fichero_entrada.read(byteArray);
        }
        fichero_entrada.close();

    }
}
