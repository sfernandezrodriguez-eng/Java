
import java.sql.*;

public class Conexion {
    public static void main(String[] args){
        Connection conexion;
        Statement sentencia;
        String sql;
        PreparedStatement sentenciaP;
        ResultSet resultados;
        String url = "jdbc:postgresql://10.0.8.159:5432/postgres";
        try{
            conexion = DriverManager.getConnection(url, "postgres", "postgres");
            System.out.println("conectado");
            String crearTaboasql = " CREATE TABLE persoas2(nome VARCHAR (50),"
                    +"dni VARCHAR (9), edade INTEGER);";
            sentencia = conexion.createStatement();
            //sentencia.execute((crearTaboasql));
            //sentencia.executeUpdate("INSERT INTO persoas2 (nome, dni, edade)"+"VALUES ('Pepe','1234J', 18)");
            //sentencia.executeUpdate("INSERT INTO persoas2 (nome, dni, edade)"+"VALUES ('Juan','1276O', 24)");
            //sentencia.executeUpdate("INSERT INTO persoas2 (nome, dni, edade)"+"VALUES ('Aaron','2398P', 89)");
            sql = "INSERT INTO persoas2(nome, dni, edade) VALUES (?,?,?)";
            sentenciaP = conexion.prepareStatement(sql);
            sentenciaP.setString(1,"Roque3");
            sentenciaP.setString(2,"123452");
            sentenciaP.setInt(3,28);
            //sentenciaP.executeUpdate();
            sql = "SELECT nome, dni, edade FROM persoas2";
            sentenciaP = conexion.prepareStatement(sql);
            resultados = sentenciaP.executeQuery();
            while(resultados.next()){
                String n = resultados.getString("nome");
                String d = resultados.getString("dni");
                int e = resultados.getInt("edade");
                System.out.println("Nombre: "+n+", dni: "+d+", edade: "+e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}