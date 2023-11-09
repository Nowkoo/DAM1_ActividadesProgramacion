package U2_1_void_methods;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduzca el número " + (i + 1));
            numbers[i] = scanner.nextInt();
        }

        biggestNumber(numbers[0], numbers[1], numbers[2]);
    }

    public static void biggestNumber(int number1, int number2, int number3){
        int result;

        if(number1 > number2 && number1 > number3) {
            result = number1;
        } else if (number2 > number1 && number2 > number3) {
            result = number2;
        } else {
            result = number3;
        }

        System.out.println(result + " es el número mayor.");
    }
}
