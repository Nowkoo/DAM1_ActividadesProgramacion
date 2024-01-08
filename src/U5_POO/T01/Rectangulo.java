package U5_POO.T01;

public class Rectangulo extends Punto {
    int ancho;
    int alto;

    Rectangulo() {
        super.setX(1);
        super.setY(2);
        ancho = 0;
        alto = 0;
    }

    Rectangulo(Punto punto, int ancho, int alto) {
        super.setX(punto.getX());
        super.setY(punto.getY());
        this.ancho = ancho;
        this.alto = alto;
    }

    Rectangulo(Punto punto1, Punto punto2) {
        super.setX(punto1.getX());
        super.setY(punto2.getY());
        ancho = punto2.getX() - punto1.getX();
        alto = punto2.getY() - punto1.getY();
    }

    Rectangulo(Segmento segmento) {
        super.setX(segmento.getInicio().getX());
        super.setY(segmento.getInicio().getY());
        ancho = segmento.getFin().getX() - segmento.getInicio().getX();
        alto = segmento.getFin().getY() - segmento.getInicio().getY();
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ") anchura: " + ancho + " altura: " + alto;
    }

    public int getArea() {
        return ancho * alto;
    }

    public Punto getPunto() {
        return new Punto(super.getX(), super.getY());
    }

    public Punto getSuperiorIzquierdo() {
        int x = super.getX();
        int y = super.getY() + alto;
        return new Punto(x, y);
    }

    public Punto getSuperiorDerecho() {
        int x = getInferiorDerecho().getX();
        int y = getSuperiorIzquierdo().getY();
        return new Punto(x, y);
    }

    public Punto getInferiorDerecho() {
        int x = super.getX() + ancho;
        int y = super.getY();
        return new Punto(x, y);
    }

    public Punto getInferiorIzquierdo() {
        return new Punto(super.getX(), super.getY());
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
