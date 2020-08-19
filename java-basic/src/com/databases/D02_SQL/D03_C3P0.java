package com.databases.D02_SQL;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D03_C3P0 {
  public static void main(String[] args) throws PropertyVetoException, SQLException {
    //第三方连接池只提供连接池功能，不提供数据库连接，所以连接数据库，仍然需要数据库特定的驱动包
    //硬编码设置数据库连接
    /*?useUnicode=true&characterEncoding=utf-8*/
    //c3p0Pool.setDriverClass("com.mysql.jdbc.Driver");
    //c3p0Pool.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
    //c3p0Pool.setUser("root");
    //c3p0Pool.setPassword("passok");


    //自己去找配置文件named-config
    //ComboPooledDataSource c3p0Pool = new ComboPooledDataSource("hehe");

    //自己去找配置文件 default-config
    ComboPooledDataSource c3p0Pool = new ComboPooledDataSource();
    Connection con = c3p0Pool.getConnection();


    String sql = "select * from  student where name=?and id=?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, "lyy");
    ps.setInt(2, 1);
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {
      System.out.println(rs.getInt("id") + "|" + rs.getString("name") + "|"
          + rs.getInt("age"));
    }
    rs.close();
    ps.close();
    con.close(); //这个是归还连接的意思而不是关闭
  }
}
