package U4_ficheros;
import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("./recursos/foo.txt");
        File file2 = new File("./recursos/foo_copy.txt");
        Scanner scanner = new Scanner(System.in);

        int option = 1;

        while (option != 0) {
            System.out.println("0: Salir");
            System.out.println("1: Leer un fichero");
            System.out.println("2: Copiar el contenido de un fichero a otro");
            System.out.println("3: Añadir el contenido de un fichero a otro");

            System.out.println("Introduce tu opción de trabajo: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Introduzca la ruta absoluta del archivo que ");
                readFile(file1);
            } else if (option == 2) {
                copyFile(file1, file2);
            } else if (option == 3) {
                addFile(file1, file2);
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
