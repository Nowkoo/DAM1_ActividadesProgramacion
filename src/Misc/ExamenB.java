package Misc;

import java.util.Objects;
import java.util.Scanner;

public class ExamenB {
    static String[] dirs = new String[] {"11:11:11:11:11:11", "22:22:22:22:22:22", "33:33:33:33:33:33", "44:44:44:44:44:44", ""};

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 1;

        //EJERCICIO 1: menú de trabajo.
        while (option != 0) {
            System.out.println("0: Finalizar el programa");
            System.out.println("1: Introducir dirección MAC");
            System.out.println("2: Borrar dirección MAC");
            System.out.println("3: Mostrar direcciones MAC");

            System.out.println("Introduce tu opción de trabajo: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                introducir();
            } else if (option == 2) {
                borrar();
            } else if (option == 3) {
                mostrar();
            } else if (option == 0) {
                break;
            } else {
                System.out.println("La opción seleccionada no existe.");
            }

        }

    }

    //EJERCICIO 2
    public static boolean validar(String dir) {
        boolean esValida = true;

        //Comprobamos que tenga tamaño de MAC
        if(dir.length() != 17) {
            esValida = false;
            return esValida;

        //Comprobamos que cada dos números estén separados por ":"
        } else if (!bienSeparado(dir)) {
            esValida = false;
            return esValida;

        //Comprobamos que contenga solo carácteres válidos
        }  else {
            for (int i = 0; i < dir.length(); i++) {
                String temp = dir.replace(":", "a");
                if (!caracterValido(temp.charAt(i))) {
                    esValida = false;
                    return esValida;
                }
            }
        }

        return  esValida;
    }


    //EJERCICIO 3
    public static void introducir() {
        String dir;

        //Introducimos la MAC
        System.out.println("Introduzca la dirección MAC: ");
        dir = scanner.nextLine();

        //Comprobamos que sea válida
        if(!validar(dir)) {
            System.out.println("La dirección MAC introducida no es válida.");
            return;
        }

        //Si no caben más MACs
        if(!dirs[dirs.length - 1].equals("")) {
            System.out.println("Ha llegado al límite de almacenamiento. Borre una dirección MAC antes de crear nuevas.");
            return;
        }

        //Si caben, guardamos la MAC en la última posición libre del array.
        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i].equals("")) {
                dirs[i] = dir;
                break;
            }
        }
    }

    //EJERCICIO 4
    public static void borrar() {
        int posicion;

        //Pedimos la posición a borrar
        System.out.println("De qué dirección MAC quiere borrar los datos?");
        posicion = scanner.nextInt() - 1;

        //Comprobamos que la posición está dentro de los límites del array
        if (posicion > dirs.length || posicion < 0) {
            System.out.println("La posición excede el límite de almacenamiento.");
            return;
        }

        //Borramos el contenido de la posición
        dirs[posicion] = "";

        //Movemos el contenido del array para que el hueco borrado quede al final.
        for (int i = 0; i < dirs.length; i++) {

            if(dirs[i] == "" && i != dirs.length - 1) {
                dirs[i] = dirs[i + 1];
                dirs[i + 1] = "";
            }
        }
    }

    //EJERCICIO 5: mostramos el contenido del array.
    public static void mostrar() {
        System.out.println("Las direcciones MAC almacenadas actualmente son: ");
        String contenido;

        for (int i = 0; i < dirs.length; i++) {
            if(dirs[i].equals(""))
                contenido = "vacío.";
            else
                contenido = dirs[i];

            System.out.println("Posición " + (i + 1) + ": " + contenido);
        }
    }

    public static boolean caracterValido(char c) {
        return ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') || (c >= '0' && c <= '9'));
    }

    public static boolean bienSeparado(String dir) {
        return ((dir.charAt(2) + "").contains(":") && (dir.charAt(5) + "").contains(":") &&
                (dir.charAt(8) + "").contains(":") && (dir.charAt(11) + "").contains(":") &&
                (dir.charAt(14) + "").contains(":"));
    }
}
