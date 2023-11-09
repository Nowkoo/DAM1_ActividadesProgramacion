package U1_basic_java;

public class Ejercicio29 {
    public static void main(String[] args) {

        boolean esPrimo = false;

        for(int number = 3; number <= 100; number++) {
            if(number == 3 || number == 5) {
                esPrimo = true;
            } else if(number % 2 == 0) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= (number/2); i++) {
                    if(i % 2 == 1) {
                        if((number % i) == 0) {
                            esPrimo = false;
                            break;
                        } else {
                            esPrimo = true;
                        }
                    }
                }
            }

            if(esPrimo == true) {
                System.out.println(number);
            }
        }
    }
}