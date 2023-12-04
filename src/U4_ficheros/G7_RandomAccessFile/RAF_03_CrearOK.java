package U4_ficheros.G7_RandomAccessFile;

import U4_ficheros.G6_DataStream.Empleado;

import java.io.*;

/**
 * Solución propuesta haciendo uso de writechars que garantiza la escritura de caracteres en longitud fija.
 */
public class RAF_03_CrearOK {
    private static RandomAccessFile flujoIO;
    private static Empleado[] empleados = new Empleado[4];
    private static void leeEmpleado (int posicion)throws IOException{
        char[] nombre = new char[10];
        flujoIO.seek(40*posicion);
        System.out.print("Id=" + flujoIO.readInt());
        System.out.print(" Nombre=" + leeCadenaCaracteres(10));
        System.out.print(" Departamento=" + flujoIO.readInt());
        System.out.print(" Edad=" + flujoIO.readInt());
        System.out.print(" Sueldo=" + flujoIO.readDouble());
        System.out.println();
    }
    private static String leeCadenaCaracteres(int longitud) throws IOException{
        char[] cadena = new char[longitud];
        for (int i=0;i<longitud;i++){
            cadena[i] = flujoIO.readChar();
        }
        return new String(cadena);
    }
    public static void main(String[] args) throws IOException {
        flujoIO = new RandomAccessFile(new File("recursos/empleados3.dat"), "rw");


        empleados[0] = new Empleado(1, "Manuel    ", 20, 31, 1100.0);
        empleados[1] = new Empleado(2, "Bernat    ", 20, 28, 1200.0);
        empleados[2] = new Empleado(3, "Damián    ", 10, 26, 1400.0);
        empleados[3] = new Empleado(4, "Claudia   ", 10, 40, 1300.0);

        for (int i=0;i< empleados.length;i++){
            flujoIO.writeInt(i+1); //4byte
            flujoIO.writeChars(empleados[i].nombre); //20byte
            flujoIO.writeInt(empleados[i].departamento); //4byte
            flujoIO.writeInt(empleados[i].edad); //4byte
            flujoIO.writeDouble(empleados[i].sueldo); //8byte
            //Total 4+20+4+4+8=40
        }

        int posicion = 0;
        try{
            leeEmpleado(2);
            for(int i=0;i<4;i++) {
                leeEmpleado(i);
                posicion++;

            }
        }
        catch (IOException e){
            System.out.println();
            System.out.println("ERROR en posicion " + posicion);
        }

        flujoIO.close();
    }
}

