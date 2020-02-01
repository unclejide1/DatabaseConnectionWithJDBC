package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class App {
    public static void main(String[] args) throws Exception {
       // create a new connection from Connections
       String sql = "SELECT first_name, last_name, email " +
                     "FROM candidates";
       try (Connection conn = Connections.getConnection();
       Statement stmt  = conn.createStatement();
       ResultSet rs    = stmt.executeQuery(sql)) {
            
        // print out a message
        System.out.println(String.format("Connected to database %s "
                + "successfully.", conn.getCatalog()));
                while (rs.next()) {
                    System.out.println(rs.getString("first_name") + "\t" + 
                                       rs.getString("last_name")  + "\t" +
                                       rs.getString("email"));
                        
                }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }

    }
}