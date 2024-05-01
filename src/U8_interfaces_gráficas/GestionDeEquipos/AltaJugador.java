package U8_interfaces_gráficas.GestionDeEquipos;

public class AltaJugador {
    private String demarcacion;
    private String nombre;
    private String fechaNacimiento;
    private String altura;
    private String dorsal;
    private String club;

    public AltaJugador(String demarcacion, String nombre, String fechaNacimiento, String altura, String dorsal, String club) {
        this.demarcacion = demarcacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.dorsal = dorsal;
        this.club = club;
    }
}
