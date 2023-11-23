package U4_ficheros;
import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner scanner = new Scanner(System.in);
    static String dir;
    static File file1 = new File("./recursos/foo.txt");
    static File file2 = new File("./recursos/foo_copy.txt");

    public static void main(String[] args) throws IOException {
        int option = 1;
        boolean sobreescribir;

        while (option != 0) {
            System.out.println("0: Salir");
            System.out.println("1: Leer un fichero");
            System.out.println("2: Copiar el contenido de un fichero a otro");
            System.out.println("3: Añadir el contenido de un fichero a otro");

            System.out.println("Introduce tu opción de trabajo: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                menuLectura();
            } else if (option == 2) {
                sobreescribir = false;
                menuCopiado(sobreescribir);
            } else if (option == 3) {
                sobreescribir = true;
                menuCopiado(sobreescribir);
            } else if (option == 0) {
                break;
            } else {
                System.out.println("La opción seleccionada no existe.");
            }

        }
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

    public static void copyFile(File f1, File f2, boolean sobreescribir) throws IOException {
        FileInputStream f_in = new FileInputStream(f1);
        FileOutputStream f_out = new FileOutputStream(f2, sobreescribir);

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

    public static void menuLectura() throws IOException {
        System.out.println("Introduzca la ruta absoluta del archivo que quiere leer:");
        dir = scanner.nextLine();
        if (new File(dir).exists()) {
            file1 = new File(dir);
            readFile(file1);
        }
        else
            System.out.println("El fichero no existe o no se puede leer.");
    }

    public static void menuCopiado(boolean sobreescribir) throws IOException {
        System.out.println("Introduzca la ruta absoluta del archivo que quiere copiar:");
        dir = scanner.nextLine();
        if (new File(dir).exists()) {
            file1 = new File(dir);

            System.out.println("Introduzca la ruta absoluta del archivo donde quiere pegar el contenido:");
            dir = scanner.nextLine();
            if (new File(dir).exists()) {
                file2 = new File(dir);
                copyFile(file1, file2, sobreescribir);
            } else
                System.out.println("El fichero no existe o no se puede leer.");
        } else
            System.out.println("El fichero no existe o no se puede leer.");
    }
}
