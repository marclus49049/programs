import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DatabaseInsert{
  public static void main(String[] args) {

    Connection con = null;
    con = JdbcUtil.getConnection();
    String query = "insert into employee values (?, ?, ?)";
    try {
      PreparedStatement pst = con.prepareStatement(query);
      pst.setInt(1, 7);
      pst.setString(2, "Beena");
      pst.setInt(3, 5000);
      int rec = pst.executeUpdate();
      if (rec > 0){
        System.out.println("Record Inserted");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      con.close();
    }
  }
}
