
/*package DataServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBanco {

    private Connection conexao;
    private final String URL = "jdbc:mysql://localhost:3306/redwings";
    private final String USER = "root";
    private final String PASSWORD = "abcde";
    private final String TPCONEXAO = "com.mysql.jdbc.Driver";

    public Connection abrirConexao() {
        try {
            Class.forName(TPCONEXAO);
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Abriu conexÃ£o");

        } catch (ClassNotFoundException | SQLException ex) {

            ex.printStackTrace();
        }

        return conexao;
    }

    public void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("Fechou ConexÃ£o");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
*/