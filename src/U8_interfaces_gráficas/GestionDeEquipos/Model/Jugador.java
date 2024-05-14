package U8_interfaces_gráficas.GestionDeEquipos.Model;

public class Jugador {
    private int id;
    private String demarcacion;
    private String nombre;
    private String fechaNacimiento;
    private float altura;
    private float dorsal;
    private String club;

    public Jugador(String demarcacion, String nombre, String fechaNacimiento, float altura, float dorsal, String club) {
        this.demarcacion = demarcacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.dorsal = dorsal;
        this.club = club;
    }

    public Jugador(int id, String demarcacion, String nombre, String fechaNacimiento, float altura, float dorsal, String club) {
        this.id = id;
        this.demarcacion = demarcacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.dorsal = dorsal;
        this.club = club;
    }

    public int getId() { return id; }

    public String getDemarcacion() {
        return demarcacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public float getDorsal() {
        return dorsal;
    }

    public String getClub() {
        return club;
    }
}
