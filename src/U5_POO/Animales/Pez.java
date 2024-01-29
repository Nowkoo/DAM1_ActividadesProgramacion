package U5_POO.Animales;

public class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por branquias");
    }

    @Override
    public void moverse() {
        System.out.println("Nado con aletas");
    }
}
