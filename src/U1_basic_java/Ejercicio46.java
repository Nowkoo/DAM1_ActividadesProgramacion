package U1_basic_java;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio46 {
    public static void main(String[] args){

        int randomNumber;
        int guess;

        Random random = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);

        randomNumber = random.nextInt(100);

        System.out.println("Introduce un número del 0 al 99: ");

        do {
            guess = scanner.nextInt();

            if (guess == -1){
                break;
            } else if(guess > 99 || guess < 0) {
                System.out.println("Introduce un número del 0 al 99: ");
            } else if(guess > randomNumber) {
                System.out.println( guess + " es demasiado grande.");
                System.out.println("Prueba otra vez: ");
            } else if(guess < randomNumber) {
                System.out.println( guess + " es demasiado pequeño.");
                System.out.println("Prueba otra vez: ");
            } else{
                System.out.println("¡Has acertado! " + "El número era " + randomNumber + ".");
            }

        } while(guess != randomNumber);
    }
}
