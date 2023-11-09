package U3_strings;
import java.util.Scanner;

public class Ejercicio23 {
    static String letters = "abcdefghijklmnopqrstuvwxyzabcdefghijABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJ01234567891234567891";

    public static void main(String[] args) {
        String text;
        int n;
        int choice;
        int exitKey = 0;
        Scanner scanner = new Scanner(System.in);

        while(exitKey != 3) {
            System.out.println("1: ENCRIPTAR, 2: DESENCRIPTAR, 3: SALIR.");
            choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1) {
                System.out.println("Introduzca el texto que quiere criptografiar: ");
                text = scanner.nextLine();
                System.out.println("Introduzca el número de posiciones: ");
                n = scanner.nextInt();

                n = claveValida(n);
                System.out.println("El texto criptografiado es: " + encrypt(text, n));

            } else if(choice == 2) {
                System.out.println("Introduzca el texto criptografiado: ");
                text = scanner.nextLine();
                System.out.println("Introduzca el número de posiciones utilizado para criptografiar: ");
                n = scanner.nextInt();

                n = claveValida(n);
                System.out.println("El texto sin criptografiar es: " + decrypt(text, n) + ".");

            } else if(choice == 3){
                exitKey = 3;
            }
        }
    }
    public static String encrypt(String t, int n) {
        int index;
        String encryptedText = "";

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

    public static String decrypt(String t, int n) {
        int index;
        String decryptText = "";

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

    public static int claveValida(int n) {
        if (n > 10) {
            Scanner scanner = new Scanner(System.in);

            while (n > 10) {
                System.out.println("El número es demasiado grande.");
                System.out.println("Introduzca un número del 1 al 10: ");
                n = scanner.nextInt();
            }
        }
        return n;
    }
}