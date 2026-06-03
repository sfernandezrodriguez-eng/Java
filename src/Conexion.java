
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
            //String crearTaboasql = " CREATE TABLE persoas(nome VARCHAR (50),"
              //      +"dni VARCHAR (9), edade INTEGER);";
            //sentencia = conexion.createStatement();
            //sentencia.execute((crearTaboasql));
            //sentencia.executeUpdate("INSERT INTO persoas (nome, dni, edade)"+"VALUES ('Pepe','1234J', 18)");
            //sentencia.executeUpdate("INSERT INTO persoas (nome, dni, edade)"+"VALUES ('Juan','1276O', 24)");
            //sentencia.executeUpdate("INSERT INTO persoas (nome, dni, edade)"+"VALUES ('Aaron','2398P', 89)");
            sql = "INSERT INTO persoas(nomp, dni, edade) VALUES (?,?,?)";
            /**
            sentenciaP = conexion.prepareStatement(sql);
            sentenciaP.setString(1,"Roque3");
            sentenciaP.setString(2,"123452");
            sentenciaP.setInt(3,28);
            //sentenciaP.executeUpdate(); Para que se haga lo de arriba de sql y eso
            sql = "SELECT nomp, dni, edade FROM persoas";
            sentenciaP = conexion.prepareStatement(sql);
            resultados = sentenciaP.executeQuery();
            while(resultados.next()){
                String n = resultados.getString("nome");
                String d = resultados.getString("dni");
                int e = resultados.getInt("edade");
                System.out.println("Nombre: "+n+", dni: "+d+", edade: "+e);
            }**/

            //DAO_Usuario.crearUsuarioBD(new Persoa3("Noel","aaaa",17),conexion);
            //resultados.close();
            //sentenciaP.close();
            DAO_Usuario.modificarUsuarioBD("aaaa","Freni",45);
            conexion.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}