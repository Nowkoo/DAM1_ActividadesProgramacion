package U5_POO;

public class Punto {
    int x;
    int y;

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
}
