package U4_ficheros.G7_RandomAccessFile;

import U4_ficheros.G6_DataStream.Empleado;

import java.io.*;

/**
 * Mostramos el uso de seek para el acceso "aleatorio" a fichero.
 * Se fuerza error de lectura para mostrar la incapacidad con este método de controlar la escritura de caracteres
 * de longitud variable.
 */
public class RAF_02_Leer {
    private static RandomAccessFile flujoEntrada;
    private static Empleado[] empleados = new Empleado[4];

    private static void leeEmpleado (int posicion)throws IOException{
        flujoEntrada.seek(32*posicion);
        System.out.print("Id=" + flujoEntrada.readInt());
        System.out.print(" Nombre=" + flujoEntrada.readUTF());
        System.out.print(" Departamento=" + flujoEntrada.readInt());
        System.out.print(" Edad=" + flujoEntrada.readInt());
        System.out.print(" Sueldo=" + flujoEntrada.readDouble());
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        flujoEntrada = new RandomAccessFile(new File("recursos/empleados2.dat"), "r");
        int posicion = 0;
//        try{
            leeEmpleado(2);
            for(int i=0;i<4;i++) {
                leeEmpleado(i);
                posicion++;

            }
 //       }
 /*       catch (IOException e){
            System.out.println();
            System.out.println("ERROR en posicion " + posicion);
        }*/

        flujoEntrada.close();
    }
}
