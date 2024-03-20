package U6_estructuras_de_datos.InterfacesFuncionales.Example08_Ordering_Collections.C_Comparator;

public class Film {
    private String name;
    private Integer releaseYear;

    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public Integer getReleaseYear() {
        return this.releaseYear;
    }

    public String toString() {
        return this.name + " (" + this.releaseYear + ")";
    }
}
