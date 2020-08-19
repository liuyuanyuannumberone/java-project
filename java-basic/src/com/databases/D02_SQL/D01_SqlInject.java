package com.databases.D02_SQL;

import com.databases.D01_JDBC.MysqlUtils;

import java.sql.*;

public class D01_SqlInject {
  public static void main(String[] args) throws SQLException {
    //sql注入:当用户的数据中包含一些SQL的符号，如果我们不加判断就直接封装到sql语句中，从而会改变我们整个sql
    //的含义，这种情况就叫做SQL注入.
    //解决办法：ps内部转义避免了sql注入问题,完全代替Statement
    String name = "lyy";
    String passwd = "passok";
    Connection con = MysqlUtils.getConnection();
    String sql = "select * from  user where userName=?and userPwd=?";
    PreparedStatement ps = con.prepareStatement(sql);
    int count = ps.getParameterMetaData().getParameterCount();  //参数数量
    //不需要考虑参数类型就可以插入
    ps.setObject(1, name);  // ps.setString(1, name);
    ps.setObject(2, passwd); //ps.setString(2, passwd);
    ps.executeQuery();
    ps.close();
    con.close();
  }
}
