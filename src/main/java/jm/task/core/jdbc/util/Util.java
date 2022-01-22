package jm.task.core.jdbc.util;




import java.sql.*;

public class Util {
  private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "1234";
  private Connection connection;



  public Util(){
    try {

      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }


  public Connection getConnection() {
    return connection;
  }

}