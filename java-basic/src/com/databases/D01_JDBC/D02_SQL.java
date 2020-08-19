package com.databases.D01_JDBC;

import java.sql.*;

public class D02_SQL {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //DriverManager 加载驱动类    JDBC=java数据库连接
    Connection con = MysqlUtils.getConnection();
    Statement st = con.createStatement();

    select(st);
    //delete(st);
    //update(st);
    //insert(st);
    st.close();
    con.close();
  }

  public static void select(Statement st) throws SQLException {
    String sql1 = "select * from student";
    ResultSet resultSet = st.executeQuery(sql1);
    while (resultSet.next()) {
      System.out.println(resultSet.getInt
          ("id") + " "
          + resultSet.getString("name") + " " + resultSet.getInt("age"));
    }
    st.close();
  }

  public static void delete(Statement st) throws SQLException {
    String sql = "delete from student where id=2";
    int row = st.executeUpdate(sql);
    System.out.println(row);
  }

  public static void update(Statement st) throws SQLException {
    String sql = "update student set name='章子怡' where id=2";
    int row = st.executeUpdate(sql);
    System.out.println(row);
  }

  public static void insert(Statement st) throws SQLException {
    String sql = "insert into student values(null,'刘园园',27)";
    int row = st.executeUpdate(sql);  //共几行受到影响  (增加删除修改)
  }

}
