package U4_ficheros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ExploradorArchivos {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int exitKey = -1;
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
                temp = new File(f, Objects.requireNonNull(f.list())[ent - 1]);
                f = accederDirectorio(f, temp);
            }

        } while (exitKey == -1);

    }

    public static void print(File f) throws IOException {
        System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
        System.out.println("---------------------------------------------------");

        if (Objects.requireNonNull(f.list()).length == 0)
            System.out.println("El directorio está vacío.");
        else
            print2(f);
    }

    public static void print2 (File f) {
        int contador = 1;

        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

        for(String e : Objects.requireNonNull(f.list())) {
            File temp = new File(f, e);
            System.out.println(contador + ".- \t" + permisos(temp) + " \t" + String.format("%-15d", e.length()) + formatter.format(temp.lastModified()) + "\t\t" + temp.getName());
            contador++;
        }
    }

    public static String permisos(File f) {
        String perm = "";

        if(f.isDirectory())
            perm += "d";
        else
            perm += "-";

        if(f.canRead())
            perm += "r";
        else
            perm += "-";

        if(f.canWrite())
            perm += "w";
        else
            perm += "-";

        if(f.canExecute())
            perm += "x";
        else
            perm += "-";

        return perm;
    }

    public static int numFichero() {
        int valor;
        try {
            valor = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            return -2;
        }
        return valor;
    }

    public static boolean numValido(File f, int n) {
        if (n >= -1 && n <= Objects.requireNonNull(f.list()).length)
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
            opcionesArchivo();

        } else if (!temp.canRead()) {
            System.out.println("No tiene permisos para acceder a este directorio.");

        } else {
            f = temp;
            print(f);
        }

        return f;
    }

    public static void opcionesArchivo() {
        int opcion = 0;

        System.out.println("1: LEER");
        System.out.println("2: COPIAR");
        System.out.println("3: PEGAR");

        opcion = scanner.nextInt();

        if(opcion == )
    }

    public static void readFile(File f) throws IOException {
        FileInputStream f_in = new FileInputStream(f);

        int c = f_in.read();
        while (c != -1) {
            System.out.print((char) c);
            c = f_in.read();
        }
        f_in.close();
        System.out.println();
    }

    public static void copyFile(File f1, File f2) throws IOException {
        FileInputStream f_in = new FileInputStream(f1);
        FileOutputStream f_out = new FileOutputStream(f2);

        int charAmount = f_in.available();
        int reading = f_in.read();
        while(reading != -1) {
            f_out.write(reading);
            reading = f_in.read();
        }
        f_in.close();
        f_out.close();
        System.out.println("Se han copiado " + charAmount + " carácteres.");
    }

    public static void addFile(File f1, File f2) throws IOException {
        FileInputStream f2_in = new FileInputStream(f2);
        FileOutputStream f1_out = new FileOutputStream(f1, true);

        int reading = f2_in.read();
        while (reading != -1) {
            f1_out.write(reading);
            reading = f2_in.read();
        }

        f2_in.close();
        f1_out.close();
    }
}