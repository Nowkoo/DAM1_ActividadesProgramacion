package U4_ficheros;

import java.io.*;
import java.util.Scanner;

public class EditorTexto {
    static File original;
    static File modificado;
    //PrintWriter y BufferedReader
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exitKey = 0;
        int option = 1;

        while (option != exitKey) {
            System.out.println("0: Cerrar programa");
            System.out.println("1: Abrir archivo");

            System.out.println("Introduce tu opción de trabajo: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Introduzca la ruta del archivo que quiere abrir: ");
                original = new File(scanner.nextLine());
                abrirArchivo();
            } else if (option == 0) {
                break;
            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        }
    }

    static void abrirArchivo() {
        try {
            BufferedReader f_ent = new BufferedReader(new FileReader(original));
            String line = f_ent.readLine();
            int i = 0;
            while (line != null) {
                i++;
                System.out.println(i + ".- " + line);
                line = f_ent.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
