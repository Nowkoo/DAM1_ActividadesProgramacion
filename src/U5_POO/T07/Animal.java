package U5_POO.T07;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comunicarse() {
        System.out.println("Mi nombre es " + nombre);
    }

    public abstract void respirar();

    public abstract void moverse();

    public String toString() {
        return "Animal: " + nombre;
    }
}
