package U3_strings;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String string1, string2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la primera cadena de texto: ");
        string1 = scanner.next();
        System.out.println("Introduzca la segunda cadena de texto: ");
        string2 = scanner.next();

        compareResult(string1, string2);
    }

    public static void compareResult(String s1, String s2) {
        if(s1.compareToIgnoreCase(s2) < 0)
            System.out.println("La primera cadena es más pequeña que la segunda.");
        else if(s1.compareToIgnoreCase(s2) == 0)
            System.out.println("Las cadenas son iguales.");
        else
            System.out.println("La primera cadena es más grande que la segunda.");
    }
}
