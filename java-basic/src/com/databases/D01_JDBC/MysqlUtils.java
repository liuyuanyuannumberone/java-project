package com.databases.D01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlUtils {
  private static Connection con;

  static {
    try {
      con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8",
          "root", "passok");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() throws SQLException {
    return con;
  }
}
