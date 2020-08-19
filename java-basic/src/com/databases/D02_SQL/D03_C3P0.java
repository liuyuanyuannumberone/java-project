package com.databases.D02_SQL;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D03_C3P0 {
  public static void main(String[] args) throws PropertyVetoException, SQLException {
    //���������ӳ�ֻ�ṩ���ӳع��ܣ����ṩ���ݿ����ӣ������������ݿ⣬��Ȼ��Ҫ���ݿ��ض���������
    //Ӳ�����������ݿ�����
    /*?useUnicode=true&characterEncoding=utf-8*/
    //c3p0Pool.setDriverClass("com.mysql.jdbc.Driver");
    //c3p0Pool.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
    //c3p0Pool.setUser("root");
    //c3p0Pool.setPassword("passok");


    //�Լ�ȥ�������ļ�named-config
    //ComboPooledDataSource c3p0Pool = new ComboPooledDataSource("hehe");

    //�Լ�ȥ�������ļ� default-config
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
    con.close(); //����ǹ黹���ӵ���˼�����ǹر�
  }
}
