package com.databases.D01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class D01_SQL {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //����     JDBC=java���ݿ�����
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://119.45.38.67:3306/test",
        "root", "passok@passok");
    Statement st = connection.createStatement();

    String sql = "insert into student values(null,'�ƴ�ү',22)";
    int row = st.executeUpdate(sql);
    System.out.println(row);
  }
}
