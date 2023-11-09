package U2_1_void_methods;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        int number1, number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        number1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        number2 = scanner.nextInt();

        order(number1, number2);
    }

    public static void order(int number1, int number2) {
        int min, max;
        if(number1 >= number2){
            min = number2;
            max = number1;
        } else {
            min = number1;
            max = number2;
        }

        System.out.println(min + ", " + max);
    }


}
