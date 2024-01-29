package U5_POO.Animales;

public class Tiburon extends Pez implements Jugable {
    public Tiburon(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Arqueo el cuerpo para comunicarme");
    }

    @Override
    public void saltarPorUnAro() {
        System.out.println("Sé jugar a saltar por el aro");
    }

    @Override
    public void perseguirUnObjeto(String objeto) {
        System.out.println("Sé jugar a  perseguir un " + objeto);
    }
}
