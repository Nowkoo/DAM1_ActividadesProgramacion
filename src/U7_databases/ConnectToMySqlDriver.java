package U7_databases;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectToMySqlDriver {

    public static void main(String[] args)  {
        //bbdd casa
        String url="jdbc:mysql://172.23.176.1:33060/1dam_programacio";
        String username = "mar";
        String password = "secret";

        //bbdd clase
        /*String url="jdbc:mysql://localhost:33060/programacio";
        String username = "mar";
        String password = "secret";*/

        //bbdd bbdd
        /*String url="jdbc:postgresql://89.36.214.106:5432/factura";
        String username = "factura_alu";
        String password = "factura_alu";*/

        try{
            Driver driver = DriverManager.getDriver(url);

            Properties properties = new Properties();
            properties.setProperty("user", username);
            properties.setProperty("password", password);

            Connection con = driver.connect(url, properties);
            System.out.println("Conexión completada a través de Driver");
            con.close();
        } catch (SQLException ex) {
            System.out.println("Se ha producido un error al conectar: " + ex.getMessage());
        }
    }
}

