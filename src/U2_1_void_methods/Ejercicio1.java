package U2_1_void_methods;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age:");
        age = scanner.nextInt();

        legalAge(age);
    }

    public static void legalAge(int age) {
        if(age >= 18){
            System.out.println("You have the legal age");
        } else {
            System.out.println("You are under the legal age");
        }
    }
}
