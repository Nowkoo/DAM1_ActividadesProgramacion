package U3_strings;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        String result;
        int pos1, pos2;

        System.out.println("Introduzca una cadena de carácteres: ");
        string = scanner.next();
        System.out.println("Introduzca la primera posición: ");
        pos1 = scanner.nextInt();
        System.out.println("Introduzca la última posición: ");
        pos2 = scanner.nextInt();

        result = cutString(string, pos1, pos2);
        if(result == null)
            System.out.println("Alguna de las posiciones excede el tamaño de la cadena.");
        else
            System.out.println("La cadena recortada es: " + result);

    }

    public static String cutString(String s, int p1, int p2) {
        if(p2 > s.length() || p1 < 0) {
            return null;
        } else
            return s.substring(p1, p2);
    }
}
