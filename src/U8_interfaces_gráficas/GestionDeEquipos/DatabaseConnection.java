package U8_interfaces_gráficas.GestionDeEquipos;

public class DatabaseConnection
{
    private static DatabaseConnection dbInstance; //Variable para almacenar la unica instancia de la clase
    private static java.sql.Connection con;

    private DatabaseConnection() {
        // El Constructor es privado!!
    }

    public static DatabaseConnection getInstance(){
        //Si no hay ninguna instancia...
        if(dbInstance==null){
            dbInstance= new DatabaseConnection();
        }
        return dbInstance;
    }

    public static java.sql.Connection getConnection(){

        if(con==null){
            try {
                String host = "jdbc:mysql://192.168.201.114:33060/gestor_de_equipos";
                String username = "marmar";
                String password = "secret";
                con = java.sql.DriverManager.getConnection( host, username, password );
                System.out.println("Conexión realizada");
            } catch (java.sql.SQLException ex) {
                System.out.println("Se ha producido un error al conectar: " + ex.getMessage());
            }
        }

        return con;
    }
}