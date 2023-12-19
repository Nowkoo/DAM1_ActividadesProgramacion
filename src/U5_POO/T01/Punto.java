package U5_POO.T01;

import java.security.cert.X509CertSelector;

public class Punto {
    private int x;
    private int y;

    Punto() {
        x = 0;
        y = 0;
    }

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void posiciona(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int despX, int despY) {
        x += despX;
        y += despY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
