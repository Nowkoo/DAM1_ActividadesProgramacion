package U6_estructuras_de_datos.Iteradores.ejemplos_iteradores;

public class Persona {
    String name;
    String shortName;
    public Persona(String newName, String newShortName ){
        this.name = newName;
        this.shortName = newShortName;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
    public String toString(){
        return name + " aka " + shortName;
    }
}
