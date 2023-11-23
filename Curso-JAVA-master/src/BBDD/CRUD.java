package BBDD;
import java.sql.*;
import java.util.Properties;

public class CRUD {
    public static void main(String[] args) {

        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306/GESTIONDECLIENTES";

        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "root");

        //INSERT
        try {
            con = DriverManager.getConnection(Url,prop);

        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error " + e.toString());
        } finally {
            try {
                PreparedStatement stmt = null;
                String sentencia = "INSERT INTO clientes "
                        + "(nombre, apellido, edad) "
                        + "VALUES ('Laura','Lopez',22);";
                stmt = con.prepareStatement(sentencia);
                stmt.execute();
                System.out.println("El cliente ha sido creado con éxito.");
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Error en la ejecución " +e.getErrorCode()+" "+e.getMessage());
            }
            //SELECT
            try {
                con = DriverManager.getConnection(Url, prop);
            } catch (SQLException e) {
                System.out.println("Ha ocurrido un error " + e.toString());
            } finally {
                try {
                    PreparedStatement stmt = null;
                    String sentencia = "SELECT * FROM clientes";
                    stmt = con.prepareStatement(sentencia);
                    stmt.execute();
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        String nombre = rs.getString(1);
                        String apellido = rs.getString(2);
                        int edad = rs.getInt(3);
                        System.out.println(nombre + " " + apellido + " " + edad);
                    }
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Error en la ejecución " +e.getErrorCode()+" "+e.getMessage());
                }
            }
            // UPDATE
            try {
                PreparedStatement stmt = null;
                String sentencia = "UPDATE clientes SET nombre='Javier'"
                        + " WHERE id = DEFAULT";
                stmt = con.prepareStatement(sentencia);
                stmt.execute();
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Error en la ejecución "
                        +e.getErrorCode()+" "+e.getMessage());
            }
            // DELETE
            try {
                PreparedStatement stmt = null;
                String sentencia = "DELETE FROM clientes"
                        + " WHERE nombre='Christopher'";
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