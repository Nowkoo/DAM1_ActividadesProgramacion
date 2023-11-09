package U1_basic_java;

import java.util.Scanner;

public class Ejercicio47 {

    public static void main(String[] args) {

        String[] strings = new String[5];
        Scanner scanner = new Scanner(System.in);
        String longestString;

        System.out.println("Introduzca 5 cadenas de texto: ");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }

        longestString = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if(longestString.length() < strings[i].length()) {
                longestString = strings[i];
            }
        }

        for (int i = 0; i < longestString.length() + 4; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print("\n" + "* " + strings[i]);
            for (int a = 0; a < longestString.length() - strings[i].length(); a++) {
                System.out.print(" ");
            }
            System.out.print(" *");
        }

        System.out.println("");

        for (int i = 0; i < longestString.length() + 4; i++) {
            System.out.print("*");
        }
    }
}
