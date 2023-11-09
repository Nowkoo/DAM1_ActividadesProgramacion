package U3_strings;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main (String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        sentence = scanner.nextLine();
        System.out.println("La cadena tiene " + countWords(sentence) + " palabras.");
    }

    public static int countWords(String s) {
        int wordsNumber = 0;

        if(isLetter(s.charAt(0)))
            wordsNumber++;

        for (int i = 1; i < s.length(); i++) {
            if (isLetter(s.charAt(i)) && !isLetter(s.charAt(i - 1))) {
                wordsNumber++;
            }
        }
        return wordsNumber;
    }

    public static boolean isLetter(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
}