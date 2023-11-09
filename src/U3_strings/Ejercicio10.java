package U3_strings;
import Librerias.Utilidades;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int number;
        int contador;

        System.out.println("Introduzca una cadena de carácteres: ");
        string = scanner.nextLine();
        System.out.println("Introduzca un número entero: ");
        number = scanner.nextInt();

        contador = contarLongitud(string, number);
        System.out.println("Hay " + contador + " palabras de " + number + " de longitud.");
    }

    public static int contarLongitud(String s, int n) {
        int contador = 0;
        String[] words = Utilidades.dividirEnPalabras(s);

        for(String string : words) {
            if (string.length() == n)
                contador++;
        }
        return contador;
    }
}
