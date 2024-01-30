package U5_POO.T07;

public class PezPayaso extends Pez {
    public PezPayaso(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Me comunico mediante burbujas");
    }
}
