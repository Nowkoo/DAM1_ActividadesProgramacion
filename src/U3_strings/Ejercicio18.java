package U3_strings;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        word = scanner.nextLine();

        if (esAlfabetica(word))
            System.out.println("La palabra es alfabética.");
        else
            System.out.println("La palabra no es alfabética.");
    }

    public static boolean esAlfabetica(String s) {
        s = s.toLowerCase();
        char temp = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (temp > s.charAt(i)) {
                return false;
            } else
                temp = s.charAt(i);
        }
        return true;
    }
}
