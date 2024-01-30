package U5_POO.T07;

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
