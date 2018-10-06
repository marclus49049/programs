  import java.sql.*;

class DatabaseWithOut{
  public static void main(String[] args) {
    Connection con = null;
    con = JdbcUtil.getConnection();
    String query = "{call getsal(?, ?)}";
    try {
      CallableStatement cst = con.prepareStatement(query);
      cst.setInt(1, 5);
      cst.registerOutParameter(2, Types.INTEGER);
      cst.execute();
      int m_sal = cst.getInt(2);
      System.out.println("Salary of empno 5 is "+ m_sal);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      con.close();
    }
  }
}
