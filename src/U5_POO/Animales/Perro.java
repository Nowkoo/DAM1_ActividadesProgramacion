package U5_POO.Animales;

import java.sql.SQLOutput;

public class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Guau");
    }

    public void traerZapatillas() {
        System.out.println("Toma tus zapatillas, amo");
    }
}
