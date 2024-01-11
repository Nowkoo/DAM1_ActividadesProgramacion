package U5_POO.T04;

public class Libro {
    private String nombre;
    private Autor autor;
    private double precio;
    private int stock;

    Libro(String nombre, Autor autor, double precio, int stock) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return nombre + ". " + autor.toString();
    }

    public String getAutorNombre() {
        return autor.getNombre();
    }
}
