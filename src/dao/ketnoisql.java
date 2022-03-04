package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ketnoisql {

    public static Connection getConnect() {
        final String url = "jdbc:jtds:sqlserver://ADMIN:1433/SACH;instance=SQLEXPRESS";
        String user = "minh2001";
        String password = "minh03062001";
        
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            Logger.getLogger(ketnoisql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ketnoisql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}


