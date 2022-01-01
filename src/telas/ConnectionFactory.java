package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1520598
 */
public class ConnectionFactory {
    
    // private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL ="jdbc:postgresql://localhost:5432/Vector";
    private static final String USER = "postgres";
    private static final String PASS = "postgres"; // alterar senha.
    
    private static Connection con = null;
    private static Statement stm = null;
    
    public ConnectionFactory() {
        con = null;
        stm = null;
    }
    
    public static Connection getConnection() {
    try {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    } catch (ClassNotFoundException | SQLException ex) {
        throw new RuntimeException("Erro na conexão", ex);
    }
    }
    
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
            con.close();
        }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stm) {
        closeConnection(con);
        try {
        if (stm != null) {
            stm.close();
        }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stm, ResultSet rs) {
        closeConnection(con, stm);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    public static ResultSet consulta(String consulta){
        System.out.println("Consulta: "+consulta);
        ResultSet rs = null;
        
        con = getConnection();
        
        try{
            stm = con.createStatement();
            rs = stm.executeQuery(consulta);
        }
        catch(SQLException ex){
            System.out.println("Exceção: " + ex.toString());
        }
        finally{
            return rs;
        }
    }
    
    


    
}
