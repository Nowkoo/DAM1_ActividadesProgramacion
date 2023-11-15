package U4_ficheros;

import java.io.File;
import java.util.Scanner;

public class ClassFile02 {
    static Scanner inputValue = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un directorio:");
        String ent = inputValue.nextLine();
        File f = new File(ent);

        System.out.println("Lista de ficheros y directorios del directorio: " + ent);
        System.out.println("---------------------------------------------------");
        for (String e : f.list()) {
            System.out.println(e);
        }
    }
}