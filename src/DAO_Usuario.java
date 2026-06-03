import java.sql.*;
import java.util.Scanner;

public class DAO_Usuario {

    // 1. Corregimos el método de conexión con la IP y datos correctos por si acaso
    private static Connection conectaDB(String ip, int port, String nomebd, String usuario, String contraseña) {
        Connection con = null;
        // Usamos la IP correcta "10.0.8.159"
        String url = "jdbc:postgresql://" + ip.strip() + ":" + port + "/" + nomebd;
        try {
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Erro o conectar co servidor " + ip + ":" + port);
        }
        return con;
    }

    // 2. RECOMENDADO: Este método recibe la conexión que YA abriste en tu otra clase.
    // Además, cambia "usuarios" por "persoas" en el INSERT.
    public static void crearUsuarioBD(Persoa3 usuario, Connection conexion){

        if (usuario != null && conexion != null) {
            // Apuntamos a la tabla 'persoas'
            String sql = "INSERT INTO usuarios(nome, dni, edade) VALUES (?, ?, ?)";
            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setString(1, usuario.getNome());
                sentencia.setString(2, usuario.getDni());
                sentencia.setInt(3, usuario.getEdade());

                sentencia.executeUpdate();
                System.out.println("¡Usuario insertado con éxito desde el DAO en 'persoas'!");

                // NOTA: No cerramos la conexión aquí porque la maneja el código principal.
            } catch (SQLException e) {
                System.out.println("Erro o insertar o usuario na táboa: " + e.getMessage());
            }
        } else {
            System.out.println("Erro: O usuario ou la conexión son nulos.");
        }
    }

    public static Persoa3 obterUsuarioBD(String dni) {
        String sql = "SELECT nome, dni, edade FROM usuarios WHERE dni = ?";
        Persoa3 p = null;
        if (dni != null && dni.length() != 0) {
            Connection conexion = conectaDB("10.0.8.159", 5432, "postgres", "postgres", "postgres");
            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setString(1, dni);
                ResultSet consulta = sentencia.executeQuery();
                if (consulta.next()) {
                    System.out.println("hello");
                    String nome = consulta.getString("nome");
                    String dni2 = consulta.getString("dni");
                    int edade = consulta.getInt("edade");
                    p = new Persoa3(nome, dni2, edade);
                    System.out.println("Usuario encontrado: " + p.getNome() + ", " + p.getDni() + ", " + p.getEdade());
                } else {
                    System.out.println("No se encontró ningún usuario con el DNI: " + dni);
                }
                conexion.close();
                return p;

            } catch (SQLException e) {
                System.out.println("Erro o obter usuario: " + e);
            }
        } else {
            System.out.println("El DNI introducido no es válido (es nulo o está vacío).");
        }
        return p;
    }


    public static void modificarUsuarioBD(String dni, String novoNome,int novaedade) {
        String sql = "SELECT nome, dni, edade FROM usuarios WHERE dni = ?";
        if (dni != null && dni.length() != 0) {
            Connection conexion = conectaDB("10.0.8.159", 5432, "postgres", "postgres", "postgres");

            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setString(1, dni);
                ResultSet consulta = sentencia.executeQuery();
                if (consulta.first()) {
                    consulta.updateString("nome", novoNome);
                    consulta.updateInt("edade", novaedade);
                    consulta.updateRow();
                    System.out.println("modificado");

                } else {
                    System.out.println("No se encontró ningún usuario con el DNI: " + dni);
                }
                conexion.close();


            } catch (SQLException e) {
                System.out.println("Erro o obter usuario: " + e);
            }
        } else {
            System.out.println("El DNI introducido no es válido (es nulo o está vacío).");
        }

    }

    public static void eliminarUsuario(String dni) {
        if (dni != null && !dni.strip().isEmpty()) {
            Connection conexion = conectaDB("10.0.8.159", 5432, "postgres", "postgres", "postgres");
            if (conexion == null) return;


            String sql = "DELETE FROM usuarios WHERE dni = ?";


            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setString(1, dni.strip());


                int filasAfectadas = sentencia.executeUpdate();


                if (filasAfectadas > 0) {
                    System.out.println("Usuario con DNI " + dni + " eliminado correctamente.");
                } else {
                    System.out.println("Non se atopou ningún usuario con DNI: " + dni);
                }


                sentencia.close();
                conexion.close();
            } catch (SQLException erro) {
                System.out.println("Erro o eliminar o usuario: " + erro.toString());
            }
        } else {
            System.out.println("O DNI proporcionado non é válido.");
        }
    }


}