package Librerias;

import java.io.File;

/**
 *
 */
public class ClassFile01 {

    public static void main(String[] args) {

        //Abre el directorio actual '.'
        // Metodo 1: File(String directorio_y_fichero);
        // File f1 = new File("/home/INFORMATICA//malbert/IdeaProjects/DAM1Programacion/recursos"); // para sistemas GNU-Linux
        // File f1 = new File("c:\home\malbert\IdeaProjects\Programacion_2223\recursos"); // para sistemas MS-Windows

        // Metodo 2: File(String directorio, String archivo)
        // File f1 = new File("/home/INFORMATICA//malbert/IdeaProjects/DAM1Programacion", "recursos"); // para sistemas GNU-Linux
        // File f1 = new File("c:\home\malbert\IdeaProjects\Programacion_2223", "recursos"); // para sistemas MS-Windows

        // Metodo 3: File(File directorio, String archivo)
          File f0 = new File(".");
          File f1 = new File(f0, "recursos");
        //File f1 = new File(".");
        //File f2 = new File(new File(new File(File.listRoots()[0], "home"), "INFORMATICA"), "malbert");
        System.out.println("Lista de ficheros y directorios del directorio actual");

        System.out.println("---------------------------------------------------");

        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)

        for (String e : f1.list()){

            System.out.println(e);

        }

    }

}
