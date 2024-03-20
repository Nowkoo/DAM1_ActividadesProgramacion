package U6_estructuras_de_datos.InterfacesFuncionales.Example08_Ordering_Collections.B_LambdaFunction;

public class Person {

    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String toString(){
        return birthYear + "  " + name;
    }
}
