package U4_ficheros;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Explorador {
    public static void main(String[] args) throws IOException {
        int exitKey = 1;
        Scanner scanner = new Scanner(System.in);
        File f0 = File.listRoots()[0];

        print(f0);

        do {
            System.out.println("Introduce un directorio: ");
            String ent = nombreFichero();
            File f = new File(f0,  ent);
            f0 = f;

            print(f);

        } while (exitKey != -1);

    }

    public static void print(File f) throws IOException {
        if(f.exists()) {
            if(f.isDirectory()) {
                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
                System.out.println("---------------------------------------------------");
                print2(f);
            }
        }
    }

    public static void print2 (File f) {
        int contador = 1;

        for(String e : f.list()) {

            if(f.isDirectory()) {
                System.out.println(contador + "\t" + e + " <Directorio>");

            } else if (f.isFile()) {
                System.out.println(contador + "\t" + e + " " + e.length());
            }

            contador++;
        }
    }

    public static String nombreFichero() {
        String fichero = new Scanner(System.in).nextLine();
        return fichero;
    }
}
