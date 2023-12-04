package U4_ficheros.G7_RandomAccessFile;

import U4_ficheros.G6_DataStream.Empleado;

import java.io.*;

/**
 * Ejemplo de uso de RandomAccessFile para acceso "aleatorio".
 * Clase de ejemplo para ver los problemas del acceso aleatorio con los tipos de longitud variable (Strings)
 * En esta clase se da una primera aproximanción de la solución estableciendo un tamaño fijo de String.
 * Pendiente de resolver el problema de las codificaciones que contemplan caracteres de longitud varible
 */
public class RAF_01_Crear {
    private static RandomAccessFile flujoIO;
    private static Empleado[] empleados = new Empleado[4];

    public static void main(String[] args) throws IOException {
        flujoIO = new RandomAccessFile(new File("recursos/empleados2.dat"), "rw");


        empleados[0] = new Empleado(1, "Manuel    ", 20, 31, 1100.0);
        empleados[1] = new Empleado(2, "Bernat    ", 20, 28, 1200.0);
        empleados[2] = new Empleado(3, "Damián    ", 10, 26, 1400.0);
        empleados[3] = new Empleado(4, "Claudia   ", 10, 40, 1300.0);

        for (int i=0;i< empleados.length;i++){
            flujoIO.writeInt(empleados[i].id); //4byte
            flujoIO.writeUTF(empleados[i].nombre); //10+2byte
            flujoIO.writeInt(empleados[i].departamento); //4byte
            flujoIO.writeInt(empleados[i].edad); //4byte
            flujoIO.writeDouble(empleados[i].sueldo); //8byte
        }
        flujoIO.close();
    }
}
