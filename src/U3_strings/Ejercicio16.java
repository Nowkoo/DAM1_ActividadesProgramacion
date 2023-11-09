package U3_strings;
import java.util.Scanner;
import Librerias.Utilidades;

public class Ejercicio16 {
    public static void main(String[] args) {

        String words;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena de carácteres: ");
        words = scanner.nextLine();

        System.out.println(" La cadena invertida es: " + revertWordSequence(words));
    }

    public static String revertWordSequence(String s) {
        String[] words = Utilidades.dividirEnPalabras(s);
        String reverse = "";
        //String placeholder;

        for (int i = words.length - 1; i >= 0; i--) {
            reverse = reverse + words[i] + " ";
        }

        /*
        for (int i = 0 ; i < words.length/2; i++) {
            placeholder = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = placeholder;
        }

        for (int i = 0; i < words.length; i++) {
            reverse = reverse + words[i] + " ";
        }
        */

        return reverse;
    }
}
