package U5_POO.T01;

import U5_POO.T01.Punto;

public class Segmento {
    Punto inicio;
    Punto fin;

    Segmento() {
        inicio = new Punto (0,0);
        fin = new Punto (0, 0);
    }

    Segmento(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public double longitud() {
        int x = inicio.getX() - fin.getX();
        int y = inicio.getY() - fin.getY();
        return Math.sqrt((x * x) + (y * y));
    }

    public String toString() {
        return inicio.toString() + " - " + fin.toString();
    }

    public void desplaza(int despX, int despY) {
        inicio.desplaza(despX, despY);
        fin.desplaza(despX, despY);
    }

    public void desplaza(Punto p) {
        inicio.desplaza(p.getX(), p.getY());
        fin.desplaza(p.getX(), p.getY());
    }

    public Punto getInicio() {
        return inicio;
    }

    public Punto getFin() {
        return fin;
    }

    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }
}
