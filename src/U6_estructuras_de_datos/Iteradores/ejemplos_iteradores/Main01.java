package U06.Example01_Iterators;

public class Main01 {
    public static void main(String[] args) {
        GestorPersonas gestorPersonas = new GestorPersonas();
        gestorPersonas.addSamplePersons();
        System.out.println(gestorPersonas.toString());
        gestorPersonas.removePerson("Maria");
        System.out.println(gestorPersonas.toString());
    }
}
