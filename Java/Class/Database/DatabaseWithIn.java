import java.java.sql.CallableStatement;

class DatabaseWithIn{
  public static void main(String[] args) {
    Connection con = null;
    con = JdbcUtil.getConnection();
    String query = "{call inserttemp(?, ?, ?)}";
    try {
      CallableStatement cst = con.prepareStatement(query);
      cst.setInt(1, 8);
      cst.setString(2, "Leena");
      cst.setInt(3, 4500);
      cst.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      con.close();
    }
  }
}
