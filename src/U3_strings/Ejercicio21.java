package U3_strings;import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        String text;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el texto que quiere criptografiar: ");
        text = scanner.nextLine();
        System.out.println("Introduzca el número de posiciones: ");
        n = scanner.nextInt();

        if (n > 10) {
            while (n > 10) {
                System.out.println("El número es demasiado grande.");
                System.out.println("Introduzca un número del 1 al 10: ");
                n = scanner.nextInt();
            }
        }

        System.out.println("El texto criptografiado es: " + encrypt(text, n));
    }

    public static String encrypt(String t, int n) {
        int index;
        String encryptedText = "";
        String letters = "abcdefghijklmnopqrstuvwxyzabcdefghijABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJ01234567891234567891";

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == ' ') {
                encryptedText += t.charAt(i);
            } else {
                index = letters.indexOf(t.charAt(i));
                encryptedText += letters.charAt(index + n);
            }
        }
        return encryptedText;
    }
}