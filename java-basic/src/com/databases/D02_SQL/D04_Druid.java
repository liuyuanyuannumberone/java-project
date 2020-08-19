package com.databases.D02_SQL;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class D04_Druid {
  public static void main(String[] args) throws Exception {
    InputStream in = D04_Druid.class.getResourceAsStream("/druiddb.properties");
    Properties pro = new Properties();
    pro.load(in);
//    System.out.println(pro.getProperty("username"));
    DataSource ds = DruidDataSourceFactory.createDataSource(pro);
    Connection con = ds.getConnection();
    con.close(); //ªÿ ’
  }
}
