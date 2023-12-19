package U5_POO.T01;

public class Poligono {
    Punto[] puntos;

    Poligono(Punto[] puntos) {
        this.puntos = puntos;
    }

    Poligono(Segmento[] segmentos) {
        puntos = new Punto[segmentos.length * 2];
        int i = 0;
        for (Segmento segmento : segmentos) {
            puntos[i++] = segmento.getInicio();
            puntos[i++] = segmento.getFin();
        }
    }

    public String toString() {
        String cadena = "";
        for (Punto punto : puntos) {
            if (punto == puntos[puntos.length - 1]) {
                cadena += punto.toString();
            } else {
                cadena += (punto.toString() + " - ");
            }
        }
        return cadena;
    }

    public double perimetro() {
        //El perímetro de un polígono es igual a la suma de todos los lados
        //Hay que calcular la longitud entre cada lado y sumarla.
        double perimetro = 0;
        for (int i = 0; i < puntos.length; i++) {
            if (i == puntos.length -1) {
                perimetro += new Segmento(puntos[i], puntos[0]).longitud();
            } else {
                perimetro += new Segmento(puntos[i], puntos[i + 1]).longitud();
            }
        }

        return perimetro;
    }

    public void desplaza(int x, int y) {
        for (Punto punto : puntos) {
            punto.setX(punto.getX() + x);
            punto.setY(punto.getY() + y);
        }
    }

    public void desplaza(Punto p) {
        for (Punto punto : puntos) {
            punto.setX(punto.getX() + p.getX());
            punto.setY(punto.getY() + p.getY());
        }
    }
}
