package com.databases.D03_JDBCTemplate.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DataSourceUtils {
    private static DataSource ds;
    static {
        InputStream in = DataSourceUtils.class.getResourceAsStream("/druiddb.properties");
        Properties pro = new Properties();
        try {
            pro.load(in);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接池的方法
    public static DataSource getDataSource(){
        return ds;
    }


    //获取一个连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //关闭连接
    public static void closeAll(Connection conn , PreparedStatement stmt, ResultSet rs){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
