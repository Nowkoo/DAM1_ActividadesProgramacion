package Librerias;

// Java program to demonstrate the
// use of getCanonicalFile() function

import java.io.*;

public class ClassFile04 {
    public static void main(String[] args)
    {
        try {
            File f = new File("../var/foo.txt");

            // Obtención del File en versión canónica
            File canonical = f.getCanonicalFile();
            // Obtención del File en versión Absoluta
            File absolute = f.getAbsoluteFile();

            // Mostramos las diferencias
            System.out.println("Ruta original: " + f.getPath());
            System.out.println("Ruta 'canónica': " + canonical.getPath());
            System.out.println("Ruta 'absoluta': " + absolute.getPath());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
