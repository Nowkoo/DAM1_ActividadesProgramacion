package U5_POO.T01;

public class Main4 {
    public static void main(String[] args) {
        Poligono poligono1 = new Poligono(new Punto[] {new Punto(2, 0), new Punto(0, 4), new Punto(-2, 0)});
        System.out.println(poligono1.toString());
        System.out.println("Perímetro: " + poligono1.perimetro());
        poligono1.desplaza(1, 2);
        System.out.println(poligono1.toString());
        System.out.println("Perímetro: " + poligono1.perimetro());

        Segmento segmento1 = new Segmento(new Punto(2, 1), new Punto(2, 4));
        Segmento segmento2 = new Segmento(new Punto(2, 4), new Punto(-1, 4));
        Segmento segmento3 = new Segmento(new Punto(-1, 4), new Punto(-1, 1));
        Segmento segmento4 = new Segmento(new Punto(-1, 1), new Punto(2, 1));
        Poligono poligono2 = new Poligono(new Segmento[] {segmento1, segmento2, segmento3, segmento4});
        System.out.println(poligono2.toString());
        System.out.println("Perímetro: " + poligono2.perimetro());
    }
}
