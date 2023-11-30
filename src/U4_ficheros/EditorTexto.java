package U4_ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class EditorTexto {
    static File original;
    static File modificado;
    static int exitKey = 0;
    static boolean hayCambios = false;
    static ArrayList<String> lines = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 1;

        while (option != exitKey) {
            System.out.println("0: Cerrar programa");
            System.out.println("1: Abrir archivo");
            System.out.println("Introduce tu opción de trabajo: ");
            option = menuInput();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Introduzca la ruta del archivo que quiere abrir: ");
                original = new File(scanner.nextLine());
                if (original.exists())
                    abrirArchivo();
                else
                    System.out.println("El archivo no existe.");
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
                lines.add(line);
                line = f_ent.readLine();
            }
            f_ent.close();
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
            option = menuInput();
            scanner.nextLine();

            if (option == 1) {
                eliminarLinea();
            } else if (option == 2) {
                insertarLinea();
            } else if (option == 3) {
                guardar();
            } else if (option == 0) {
                if (hayCambios) {
                    System.out.println("¿Guardar cambios antes de salir? S/N");
                    String input = scanner.nextLine().toUpperCase();
                    if(input.equals("S"))
                        guardar();
                }
                hayCambios = false;
                break;
            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        }
    }

    static void eliminarLinea() {
        int num;
        System.out.println("Introduzca el número de la línea que quiere eliminar: ");
        num = menuInput();
        num--;

        if (num >= 0 && num < lines.size()) {
            lines.remove(num);
            hayCambios = true;
        } else {
            System.out.println("La posición seleccionada no existe.");
        }
    }

    static void insertarLinea() {
        int num;
        System.out.println("¿En qué posición quiere insertar línea? ");
        num = menuInput();
        num--;
        scanner.nextLine();

        if (num >= 0 && num < lines.size()) {
            String texto;
            System.out.println("Introduzca el contenido de la nueva línea: ");
            texto = scanner.nextLine();
            lines.add(num, texto);
            hayCambios = true;
        } else {
            System.out.println("La posición seleccionada no existe.");
        }
    }

    static void guardar() {
        if (!hayCambios)
            System.out.println("No hay cambios que guardar.");
        else {
            menuGuardado();
            try {
                PrintWriter f_sal = new PrintWriter(new FileWriter(modificado));
                for (String line : lines) {
                    f_sal.println(line);
                }
                hayCambios = false;
                f_sal.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void menuGuardado() {
        int option;
        System.out.println("1: Guardar\t2: Copiar");
        option = menuInput();
        scanner.nextLine();

        if (option == 1) {
            modificado = original;
        } else if (option == 2) {
            System.out.println("Introduzca la ruta en la que desea guardar la copia: ");
            modificado = new File(scanner.nextLine());
        } else {
            System.out.println("La opción seleccionada no existe.");
            menuGuardado();
        }
    }

    static int menuInput() {
        int input;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            input = -10;
        }
        return input;
    }
}
