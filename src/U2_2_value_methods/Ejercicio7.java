package U2_2_value_methods;

public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i = 3; i < 100; i++) {
            if(Ejercicio6.esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
