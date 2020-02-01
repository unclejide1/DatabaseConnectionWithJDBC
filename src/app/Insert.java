package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.PreparedStatement;

public class Insert {
      /**
     * Insert a new candidate
     * @param firstName
     * @param lastName
     * @param dob
     * @param email
     * @param phone
     * @return 
     */
    public static int insertCandidate(String firstName,String lastName,Date dob, 
    String email, String phone) {
// for insert a new candidate
ResultSet rs = null;
int candidateId = 0;

String sql = "INSERT INTO candidates(first_name,last_name,dob,phone,email) "
+ "VALUES(?,?,?,?,?)";

try (Connection conn =  Connections.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {

// set parameters for statement
pstmt.setString(1, firstName);
pstmt.setString(2, lastName);
pstmt.setDate(3, dob);
pstmt.setString(4, phone);
pstmt.setString(5, email);

int rowAffected = pstmt.executeUpdate();
if(rowAffected == 1)
{
// get candidate id
rs = pstmt.getGeneratedKeys();
if(rs.next())
candidateId = rs.getInt(1);

}
} catch (SQLException ex) {
System.out.println(ex.getMessage());
} finally {
try {
if(rs != null)  rs.close();
} catch (SQLException e) {
System.out.println(e.getMessage());
}
}

return candidateId;
}
/**
* @param args the command line arguments
*/
}