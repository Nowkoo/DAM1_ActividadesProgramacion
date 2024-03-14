package U6_estructuras_de_datos.Stream;

public class Persona {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Persona(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
}