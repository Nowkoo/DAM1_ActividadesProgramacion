package U4_ficheros.G1_File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClassFile05 {
    public static void main(String[] args) {
        System.out.println("Introduce un directorio:");
        try {
            String ent = nombreDeFichero();
            File f = new File(ent);
            imprimirDirectorio(f);
        } catch(IOException e) {
            System.out.println("No existe el directorio");
        }
    }
    private static String nombreDeFichero() throws IOException {
        String fichero = new Scanner(System.in).nextLine();
        return fichero;
    }
    private static void imprimirDirectorio(File f) throws IOException {
        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
                System.out.println("---------------------------------------------------");
                for (File e : f.listFiles()){
                    imprimirFichero(e);
                }
            } else {
                System.out.println("No es un directorio");
            }
        } else {
            System.out.println("No existe el directorio");
        }
    }
    private static void imprimirFichero(File e) {
        //No imprime los ficheros/directorios ocultos
        if (!e.isHidden()) {
            if (e.isFile()) {
                System.out.println(e.getName() + " " + e.length());
            }
            if (e.isDirectory()){
                System.out.println(e.getName() + " <Directorio>");
            }
        }
    }
}