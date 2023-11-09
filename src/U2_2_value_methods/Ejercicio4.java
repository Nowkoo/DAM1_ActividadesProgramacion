package U2_2_value_methods;

public class Ejercicio4{

    public static void main(String[] args) {

        int[] numbers = new int[] {-1, -1, -1, 1, 1, 1};
        int positiveAmount;

        positiveAmount = positivos(numbers);
        System.out.println("Hay " + positiveAmount + " numeros positivos");

    }

    public static int positivos(int[] n) {
        int contador = 0;

        for (int i = 0; i < n.length; i++) {
            if(n[i] > 0)
                contador++;
        }

        return contador;
    }
}