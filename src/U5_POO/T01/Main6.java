package U5_POO.T01;

public class Main6 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(new Punto(2, 2), new Punto(5, 8));
        System.out.println("Área: " + rectangulo.getArea());
        Rectangulo[] rectangulos = new Rectangulo[10];
        for (int i = 0; i < rectangulos.length; i++) {
            rectangulos[i] = new Rectangulo(new Punto(i, i), 3, 2);
            System.out.println(rectangulos[i].toString());
        }
    }
}
