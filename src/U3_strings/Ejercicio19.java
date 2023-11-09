package U3_strings;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        word = scanner.nextLine();

        System.out.println("La cadena sin vocales es: " + hideVowels(word));
    }

    public static String hideVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i)))
                s = s.replace(s.charAt(i), '.');
        }
        return s;
    }

    private static boolean isVowel(char c){
        String vowels = "aáAÁeéEÉiíIÍoóOÓuúUÚ";
        return vowels.contains(c + "");
    }
}