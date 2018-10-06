import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

class DatabaseSelect{
  public static void main(String[] args) {

    Connection con = null;
    con = JdbcUtil.getConnection();
    String query = "Select * from employes";
    try {
      PreparedStatement pst = con.prepareStatement(query);
      ResultSet rows = pst.executeQuery();
      ResultSetMetaData meta = rows.getMetaData();
      System.out.print(meta.getColumnCount());
      while(rows.next()){
        System.out.print(row.getString(1)+" "+row.getString(2)+" "+row.getString(3)+" ");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      con.close();
    }
  }
}
