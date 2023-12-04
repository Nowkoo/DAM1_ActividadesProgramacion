package U4_ficheros.G6_DataStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Mostramos el uso de DataOutputStream, clase decoradora de FileOutputStream que facilita métodos
 * para el acceso a todo tipo de datos primitivos de Java.
 */
public class BA_02_Crear {
    public static void main(String[] args) throws IOException {
        DataOutputStream flujoSalida = new DataOutputStream(new FileOutputStream(new File("recursos/empleados.dat")));
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado(1, "Manuel", 20, 31, 1100.0);
        empleados[1] = new Empleado(2, "Bernat", 20, 28, 1200.0);
        empleados[2] = new Empleado(3, "Claudia", 10, 26, 1400.0);
        empleados[3] = new Empleado(4, "Damián", 10, 40, 1300.0);

        for (int i=0;i< empleados.length;i++){
            flujoSalida.writeInt(empleados[i].id);
            flujoSalida.writeUTF(empleados[i].nombre);
            flujoSalida.writeInt(empleados[i].departamento);
            flujoSalida.writeInt(empleados[i].edad);
            flujoSalida.writeDouble(empleados[i].sueldo);
        }
        flujoSalida.close();
    }
}

