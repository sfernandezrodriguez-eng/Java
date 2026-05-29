import java.sql.DriverManager;
import java.sql.*;

public class DAO_Usuario {
    private static Connection conectaDB(String ip, int port, String nomebd, String usuario, String contraseña) {
        Connection con = null;
         String url = "jdbc:postgresql://"+ ip.strip()+":" + port + "/"+nomebd;
         try {
             con = DriverManager.getConnection(url, usuario, contraseña);
         } catch (SQLException e) {
             System.out.println("Erro o conectar co servidor" + ip + ":" + port);
         }
         return con;


    }

    public static void crearUsuarioBD(Persoa3 usuario){
        if (usuario != null) {
            Connection conexion = conectaDB("1.0.8.159", 5432,"usuarios","postgres","postgres");
            String sql = "INSERT INTO Usuarios(nome, dni, edade) VALUES (?,?,?)";
            try{
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setString(1,usuario.getNome());
                sentencia.setString(2,usuario.getDni());
                sentencia.setInt(3,usuario.getEdade());
            } catch (SQLException e) {
                System.out.println("Erro o insertar o usuario");
            }
        }



    }


    void main() {
    }

}