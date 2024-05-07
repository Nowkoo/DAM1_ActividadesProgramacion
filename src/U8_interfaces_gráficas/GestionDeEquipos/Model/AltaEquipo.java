package U8_interfaces_gráficas.GestionDeEquipos.Model;

public class AltaEquipo {
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

    private String nombreEquipo;
    private String paisCompeticion;
    private String nombreCompeticion;
    private String entrenador;

    public AltaEquipo(String nombreEquipo, String paisCompeticion, String nombreCompeticion, String entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.paisCompeticion = paisCompeticion;
        this.nombreCompeticion = nombreCompeticion;
        this.entrenador = entrenador;
    }
}
