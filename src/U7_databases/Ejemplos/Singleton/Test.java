package U7_databases.Ejemplos.Singleton;
import java.sql.*;
public class Test
{
    //static java.sql.Connection con = DatabaseConnection.getInstance().getConnection();
    public static java.sql.Connection con;
    public Test(){
        con = U07.Ejemplos.A_Conexion.Singleton.DatabaseConnection.getInstance().getConnection();

    }
    public Test(String url, String user, String password){
        con = DBConnection.getConnection(url, user, password);
    }

    public static void main(String[] args) {
        // Comprobamos el funcionamiento de Connection::close() para una conexión no establecida
        Test myTest1 = new Test("jdbc:mysql://localhost:33060/testing", "xesting", "secret");
        try {
            Test.con.close();
        }catch(Exception e){
            System.out.println("Error forzado de usuario");
        }
        // Establecemos conexión correcta y comprobamos efecto singleton
        Test myTest2 = new Test("jdbc:mysql://localhost:33060/testing", "testing1", "secret");
        myTest1 = new Test("jdbc:mysql://localhost:33060/testing", "testing1", "secret");
        // Cerramos conexión y comprobamos reconexión
        try {
            Test.con.close();
            System.out.println("Conexion cerrada");
        }catch(Exception e){
            System.out.println("E1");
        }
        Test myTest3 = new Test("jdbc:mysql://localhost:33060/testing", "testing1", "secret");
        // Conexión con clase alternativa. Se crea otra conexión al ser otro tipo de clase.
        myTest1 = new Test();
    }
}

