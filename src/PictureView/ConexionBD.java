package PictureView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con = null;

    public ConexionBD(){}

    public static Connection getConexion(){
        try {
            if (con == null) {

                /*ResourceBundle rc = ResourceBundle.getBundle("BD");*/
                String usuario = "root";
                String pass = "12345678";
                String driver = "com.mysql.jdbc.Driver";
                String ruta = "jdbc:mysql://localhost:3306/bd_ejemplo";
                Class.forName(driver);
                con = DriverManager.getConnection(ruta, usuario, pass);
                System.out.println("conectado");
            }
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error en conectar al servidor");
        }
    }

    public static void main(String[] args) {
        getConexion();
    }
}
