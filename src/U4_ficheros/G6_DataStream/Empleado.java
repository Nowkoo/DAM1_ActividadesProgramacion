package U4_ficheros.G6_DataStream;

public class Empleado {
    public int id;
    public int edad;
    public int departamento;
    public double sueldo;
    public String nombre;
    public Empleado(int id, String nombre, int departamento, int edad, double sueldo){
        this.id = id;
        this.edad = edad;
        this.departamento = departamento;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}
