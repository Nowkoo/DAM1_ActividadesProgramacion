package U3_strings;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1, string2;
        int result;

        System.out.println("Introduzca la primera cadena: ");
        string1 = scanner.next();
        System.out.println("Introduzca la segunda cadena: ");
        string2 = scanner.next();

        result = primeraOcurrencia(string1, string2);

        if(result == -1)
            System.out.println("No hay ocurrencias.");
        else
            System.out.println("La posición de la primera ocurrencia es " + result);
    }

    public static int primeraOcurrencia(String s1, String s2){
        return s1.indexOf(s2);
    }
}
