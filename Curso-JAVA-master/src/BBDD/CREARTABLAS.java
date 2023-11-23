package BBDD;
import java.sql.*;
import java.util.Properties;

public class CREARTABLAS {
    public static void main(String[] args) {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306/GESTIONDECLIENTES";

        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "root");

        try {
            con = DriverManager.getConnection(Url, prop);
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error " + e.toString());
        } finally {
            try {
                PreparedStatement stmt = null;
                String sentencia = "CREATE TABLE clientes ("
                        + " id INT PRIMARY KEY AUTO_INCREMENT,"
                        + " nombre CHAR(20),"
                        + " apellido CHAR(20),"
                        + " edad INT(10))";
                stmt = con.prepareStatement(sentencia);
                stmt.execute();
                stmt.close();

            } catch (SQLException e) {
                System.out.println("Error en la ejecución "
                        +e.getErrorCode()+" "+e.getMessage());
            }
        }
    }
}