package app;

import java.sql.Date;


public class App {
    public static void main(String[] args) throws Exception {
       // create a new connection from Connections
    //    String sql = "SELECT first_name, last_name, email " +
    //                  "FROM candidates";
    // String sql = "INSERT INTO candidates(first_name,last_name,dob,phone,email) "
    //         + "VALUES(?,?,?,?,?)";
    
    //  String sqlUpdate = "UPDATE candidates "
    //             + "SET last_name = ? "
    //             + "WHERE id = ?";
    //    try (Connection conn = Connections.getConnection();
    //    Statement stmt  = conn.createStatement();
    //    ResultSet rs    = stmt.executeQuery(sql);
    // conn.setAutoCommit(false);
    //    PreparedStatement pstmt = conn.prepareStatement(sql,
    //    Statement.RETURN_GENERATED_KEYS)) {
            
    //     String lastName = "William";
    //     int id = 100;
 
    //     pstmt.setString(1, lastName);
    //     pstmt.setInt(2, id);
    //     int rowAffected = pstmt.executeUpdate();
    //     System.out.println(String.format("Row affected %d", rowAffected));
 
    //         // reuse the prepared statement
    //         lastName = "Grohe";
    //         id = 101;
    //         pstmt.setString(1, lastName);
    //         pstmt.setInt(2, id);
 
    //         rowAffected = pstmt.executeUpdate();
    //         System.out.println(String.format("Row affected %d", rowAffected));

    //     // print out a message
    //     // System.out.println(String.format("Connected to database %s "
    //     //         + "successfully.", conn.getCatalog()));
    //     //         while (rs.next()) {
    //     //             System.out.println(rs.getString("first_name") + "\t" + 
    //     //                                rs.getString("last_name")  + "\t" +
    //     //                                rs.getString("email"));
                        
    //             // }
    // } catch (SQLException ex) {
    //     System.out.println(ex.getMessage());
    // }

    int id = Insert.insertCandidate("Bush", "Lily", Date.valueOf("1980-01-04"), 
                        "bush.l@yahoo.com", "(408) 898-6666");

    System.out.println(String.format("A new candidate with id %d has been inserted.",id));
    }
}