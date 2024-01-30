package U5_POO.T07;

public class Gato extends Mamifero implements Jugable {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        super.comunicarse();
        System.out.println("Miau");
    }

    public void jugarConOvillos() {
        System.out.println("Me gusta jugar con ovillos");
    }

    @Override
    public void saltarPorUnAro() {
        System.out.println("Sé jugar a saltar por el aro");
    }

    @Override
    public void perseguirUnObjeto(String objeto) {
        System.out.println("Sé jugar a perseguir un " + objeto);
    }
}
