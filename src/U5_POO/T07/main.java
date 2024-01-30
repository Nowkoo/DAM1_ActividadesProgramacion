package U5_POO.T07;

public class main {
    static Gato gato = new Gato("Palito");
    static Perro perro = new Perro("Gruñón");
    static PezPayaso pezPayaso = new PezPayaso("Pez");
    static Tiburon tiburon = new Tiburon("Peligro");
    static Entrenador entrenador = new Entrenador("Pedro");

    public static void main(String[] args) {
        gato.comunicarse();
        gato.saltarPorUnAro();
        gato.jugarConOvillos();
        gato.perseguirUnObjeto("ratón");
        gato.mamar();

        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();
        perro.moverse();

        tiburon.comunicarse();
        tiburon.saltarPorUnAro();
        tiburon.respirar();
        tiburon.moverse();

        pezPayaso.comunicarse();
        pezPayaso.moverse();
        pezPayaso.respirar();
    }
}
