import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DatabaseDelete{
  public static void main(String[] args) {

    Connection con = null;
    con = JdbcUtil.getConnection();
    con.getAutoCommit();
    String query = "Delete from employes where empno = ?";
    String usr_confirm;
    try {
      PreparedStatement pst = con.prepareStatement(query);
      pst.setInt(1, 3);
      int rec = pst.executeUpdate();
      if (usr_confirm.equalsIgnoreCase("Y")){
        System.out.println("Data Deleted");
        con.commit();
      } else {
        System.out.println("Data not Deleted");
        con.rollback();
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      con.close();
    }
  }
}
