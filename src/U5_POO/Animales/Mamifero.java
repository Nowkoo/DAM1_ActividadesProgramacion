package U5_POO.Animales;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }

    public void mamar() {
        System.out.println("Cuando soy pequeña mamo");
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo a cuatro patas");
    }

    public void respirar() {
        System.out.println("Respiro aire por los pulmones");
    }
}
