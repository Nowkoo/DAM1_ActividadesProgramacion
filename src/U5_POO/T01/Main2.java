package U5_POO.T01;

public class Main2 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(4, 5);
        Punto punto2 = new Punto(6, 8);
        punto1.desplaza(3, 4);
        punto2.desplaza(3, 4);
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
    }
}
