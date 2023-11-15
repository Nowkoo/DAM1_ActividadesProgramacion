package U4_ficheros;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Explorador {
    public static void main(String[] args) throws IOException {
        int exitKey = -1;
        Scanner scanner = new Scanner(System.in);
        File f = File.listRoots()[0];
        File temp;

        print(f);

        do {
            System.out.println("Introduzca un número de directorio: ");
            int ent = numFichero();

            if (ent == exitKey) {
                break;

            } else if (ent == 0) {
                f = abandonarDirectorio(f);

            } else if(numValido(f, ent)) {
                temp = new File(f, f.list()[ent - 1]);
                f = accederDirectorio(f, temp);
            }

        } while (exitKey == -1);

    }

    public static void print(File f) throws IOException {
        System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
        System.out.println("---------------------------------------------------");

        if (f.list().length == 0)
            System.out.println("El directorio está vacío.");
        else
            print2(f);
    }

    public static void print2 (File f) {
        int contador = 1;

        for(String e : f.list()) {

            if(new File(f, e).isDirectory()) {
                System.out.println(contador + "\t" + e + " <Directorio>");

            } else {
                System.out.println(contador + "\t" + e + " " + e.length() + " bytes");
            }

            contador++;
        }
    }

    public static int numFichero() {
        int fichero = new Scanner(System.in).nextInt();
        return fichero;
    }

    public static boolean numValido(File f, int n) {
        if (n >= -1 && n <= f.list().length)
            return true;
        return false;
    }

    public static File abandonarDirectorio(File f) throws IOException {
        if(f.getParent() != null) {
            f = new File(f.getParent());
            print(f);
        } else
            System.out.println("El directorio al que intenta acceder no existe.");

        return f;
    }

    public static File accederDirectorio(File f, File temp) throws IOException {
        if (!temp.isDirectory()) {
            System.out.println("El archivo seleccionado no es un directorio.");

        } else if (!temp.canRead()) {
            System.out.println("No tiene permisos para acceder a este directorio.");

        } else {
            f = temp;
            print(f);
        }

        return f;
    }
}
