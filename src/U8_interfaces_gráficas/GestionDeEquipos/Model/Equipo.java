package U8_interfaces_gráficas.GestionDeEquipos.Model;

public class Equipo {
    public int getId() {
        return id;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getPaisCompeticion() {
        return paisCompeticion;
    }

    public String getNombreCompeticion() {
        return nombreCompeticion;
    }

    public String getEntrenador() {
        return entrenador;
    }

    private int id;
    private String nombreEquipo;
    private String paisCompeticion;
    private String nombreCompeticion;
    private String entrenador;

    public Equipo(String nombreEquipo, String paisCompeticion, String nombreCompeticion, String entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.paisCompeticion = paisCompeticion;
        this.nombreCompeticion = nombreCompeticion;
        this.entrenador = entrenador;
    }

    public Equipo(int id, String nombreEquipo, String paisCompeticion, String nombreCompeticion, String entrenador) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.paisCompeticion = paisCompeticion;
        this.nombreCompeticion = nombreCompeticion;
        this.entrenador = entrenador;
    }
}
