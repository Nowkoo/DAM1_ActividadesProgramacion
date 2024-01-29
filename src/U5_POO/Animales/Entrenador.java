package U5_POO.Animales;

public class Entrenador extends Mamifero {

    public Entrenador(String nombre) {
        super(nombre);
    }

    public void entrenar(Jugable animalQueSabeJugar) {
        animalQueSabeJugar.saltarPorUnAro();
    }

    public void dejarEntrar(Animal animal) {
        if (animal instanceof Jugable) {
            System.out.println("Pasa y te entreno");
        } else {
            System.out.println("Lo siento, pero no sabes jugar");
        }
    }
}
