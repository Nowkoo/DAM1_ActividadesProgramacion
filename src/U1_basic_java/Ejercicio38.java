package U1_basic_java;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args){

        String string;
        int contador = 0;
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una oración: ");
        string = scanner.next();

        for(int i = 0; i < string.length(); i++){
            for(int b : vowels) {
                if(b == string.charAt(i)) {
                    contador++;
                }
            }
        }

        System.out.println("La oración tiene " + contador + " vocales, sin contar vocales acentuadas.");
    }
}
