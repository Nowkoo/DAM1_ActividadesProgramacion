package U4_ficheros.G6_DataStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * Mostramos el uso de DataInputStream, clase decoradora de FileInputStream que facilita métodos
 * para el acceso a todo tipo de datos primitivos de Java.
 */
public class BA_03_Leer {
    public static void main(String[] args) throws IOException {
        DataInputStream flujoEntrada = new DataInputStream(new FileInputStream(new File("recursos/empleados.dat")));

        // Para finalizar la lectura utilizamos "available" que indica la cantidad de bytes pendientes de lectura.
        while (flujoEntrada.available()>0){
            System.out.print("Id=" + flujoEntrada.readInt());
            System.out.print(" Nombre=" + flujoEntrada.readUTF());
            System.out.print(" Departamento=" + flujoEntrada.readInt());
            System.out.print(" Edad=" + flujoEntrada.readInt());
            System.out.print(" Sueldo=" + flujoEntrada.readDouble());
            System.out.println();
        }
        flujoEntrada.close();

        flujoEntrada = new DataInputStream(new FileInputStream(new File("recursos/empleados.dat")));

        // Para finalizar la lectura utilizamos "available" que indica la cantidad de bytes pendientes de lectura.
            while (flujoEntrada.available()>0){
                Empleado empleado = new Empleado(flujoEntrada.readInt(), flujoEntrada.readUTF(), flujoEntrada.readInt(), flujoEntrada.readInt(), flujoEntrada.readDouble());
                System.out.print("Id=" + empleado.id);
                System.out.print(" Nombre=" + empleado.nombre);
                System.out.print(" Departamento=" + empleado.departamento);
                System.out.print(" Edad=" + empleado.edad);
                System.out.println();
        }
            flujoEntrada.close();
    }
}
