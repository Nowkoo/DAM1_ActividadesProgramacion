package U3_strings;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main (String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        sentence = scanner.nextLine();
        System.out.println("La cadena tiene " + countWords(sentence) + " palabras.");
    }

    public static int countWords(String s) {
        String[] words;
        int wordsNumber = 0;

        s = s.trim();
        s = s.replaceAll(",", " ").replaceAll("\\.", " ").replaceAll(";", " ").replaceAll(":", " ");
        s = s.replaceAll(" +", " ");
        words = s.split(" ");
        wordsNumber = words.length;

        return wordsNumber;
    }
}
