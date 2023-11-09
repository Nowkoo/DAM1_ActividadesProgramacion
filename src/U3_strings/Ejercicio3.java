package U3_strings;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String string1, string2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la primera cadena de texto: ");
        string1 = scanner.next();
        System.out.println("Introduzca la segunda cadena de texto: ");
        string2 = scanner.next();

        //System.out.println(string1.concat(string2));
        System.out.println(concatenar(string1, string2));

    }

    public static String concatenar(String s1, String s2) {

        return s1.concat(s2);
    }
}
