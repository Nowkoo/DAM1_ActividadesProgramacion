package U1_basic_java;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        boolean wasTen = false;
        double sum = 0;
        double grade = 0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca las notas:");

        do {

            if(grade != -1) {

                grade = scanner.nextDouble();
                sum = sum + grade;
                i++;

                if(grade == 10) {
                    wasTen = true;
                }
            }
        } while (grade != -1);

        System.out.println("Nota media: " + (sum/i));

        if(wasTen) {
            System.out.println("Había un 10");
        } else {
            System.out.println("No había un 10");
        }
    }
}