package U4_ficheros.G6_DataStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Mostramos el uso de DataOutputStream, clase decoradora de FileOutputStream que facilita métodos
 * para el acceso a todo tipo de datos primitivos de Java.
 */
public class BA_01_Crear {
    public static void main(String[] args) throws IOException {
        DataOutputStream flujoSalida = new DataOutputStream(new FileOutputStream(new File("recursos/empleados.dat")));

        String [] nombres = {"Andreu", "Bernat", "Claudia", "Damián"};
        int [] departamentos = {10, 20, 10, 10};
        int [] edades = {23, 28, 26, 40};
        double [] sueldos = {1000.0, 1200.0, 1400.0, 1300.0};

        for (int i=0;i< nombres.length;i++){
            flujoSalida.writeInt(i+1);
            flujoSalida.writeUTF(nombres[i]);
            flujoSalida.writeInt(departamentos[i]);
            flujoSalida.writeInt(edades[i]);
            flujoSalida.writeDouble(sueldos[i]);
        }
        flujoSalida.close();
    }
}
