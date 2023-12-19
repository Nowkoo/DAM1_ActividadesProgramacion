package U5_POO.T01;

public class Main {
    public static void main(String[] args) {
        Punto punto = new Punto(4, 3);
        System.out.println(punto.toString());
        punto.posiciona(-3, 1);
        System.out.println(punto.toString());
    }
}
