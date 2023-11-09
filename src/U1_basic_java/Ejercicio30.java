package U1_basic_java;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        String word;
        int length;
        boolean isEqual = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        word = scanner.next();
        length = word.length() - 1;

        for(int i = 0; i < length/2; i++) {
            if(word.charAt(i) == word.charAt(length - i)){
                isEqual = true;
            } else {
                isEqual = false;
                break;
            }
        }

        if(isEqual) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
    }
}
