package U4_ficheros;

import java.io.*;
import java.util.Scanner;

public class EditorTexto {
    static File original;
    static int exitKey = 0;
    static File modificado;
    static Scanner scanner = new Scanner(System.in);
    //PrintWriter y BufferedReader
    public static void main(String[] args) {
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
            while (line != null && i < 22) {
                i++;
                System.out.println(i + ".- " + line);
                line = f_ent.readLine();
            }
            opcionesArchivo();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void opcionesArchivo() {
        int option = 1;

        while (option != exitKey) {
            System.out.println("0: Cerrar archivo\t1: Eliminar línea\t2: Insertar línea\t3: Guardar");
            System.out.println("¿Qué acción desea realizar? ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                eliminarLinea();
            } else if (option == 2) {
                insertarLinea();
            } else if (option == 3) {
                guardar();
            } else if (option == 0) {
                break;
            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        }
    }

    static void eliminarLinea() {

    }

    static void insertarLinea() {}

    static void guardar() {}
}
