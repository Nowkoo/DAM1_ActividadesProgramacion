package U3_strings;import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        String text;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el texto criptografiado: ");
        text = scanner.nextLine();
        System.out.println("Introduzca el número de posiciones utilizado para criptografiar: ");
        n = scanner.nextInt();

        if (n > 10) {
            System.out.println("El número es demasiado grande.");
            return;
        }

        System.out.println("El texto sin criptografiar es: " + decrypt(text, n) + ".");
    }

    public static String decrypt(String t, int n) {
        int index;
        String decryptText = "";
        String lettedrs = "";
        String letters = "abcdefghijklmnopqrstuvwxyzabcdefghijABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJ01234567891234567891";

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == ' ') {
                decryptText += t.charAt(i);
            } else {
                index = letters.lastIndexOf(t.charAt(i));
                decryptText += letters.charAt(index - n);
            }
        }
        return decryptText;
    }
}