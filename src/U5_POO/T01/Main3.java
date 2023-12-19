package U5_POO.T01;

public class Main3 {
    public static void main(String[] args) {
        Segmento segmento = new Segmento(new Punto(4, 5), new Punto(6, 8));
        System.out.println(segmento.toString());
        System.out.println("longitud: " + segmento.longitud());
        segmento.desplaza(4, 3);
        System.out.println(segmento.toString());
        System.out.println("longitud: " + segmento.longitud());
    }
}
