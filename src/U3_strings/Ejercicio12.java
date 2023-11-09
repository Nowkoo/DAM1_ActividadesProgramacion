package U3_strings;
import Librerias.Utilidades;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int number;

        System.out.println("Introduzca una cadena de carácteres: ");
        string = scanner.nextLine();
        System.out.println("Introduzca un número entero: ");
        number = scanner.nextInt();

        if(!contarLongitud(string, number))
            System.out.println("Todas las cadenas son cortas.");
        else
            System.out.println("Hay alguna palabra larga.");
    }

    public static boolean contarLongitud(String s, int n) {
        boolean sameLength = false;
        String[] words = Utilidades.dividirEnPalabras(s);

        for(String string : words) {
            if (n >= string.length()) {
                sameLength = true;
                break;
            }
        }
        return sameLength;
    }
}