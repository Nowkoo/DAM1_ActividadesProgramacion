package U1_basic_java;

public class Ejercicio40 {
    public static void main(String[] args) {

        int n1;
        int n2;
        int aux;
        int[] numbers = new int[40];

        n1 = 0;
        n2 = 1;

        System.out.println(n1);

        for(int i = 0; i < 40; i++) {
            aux = n1 + n2;
            System.out.println(aux);
            n2 = n1;
            n1 = aux;
        }

        // VERSIÓN 2
        /*
        numbers[0] = 0;
        numbers[1] = 1;

        /*for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
    }
}
