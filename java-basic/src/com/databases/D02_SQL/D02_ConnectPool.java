package com.databases.D02_SQL;

import com.databases.D01_JDBC.MysqlUtils;
import com.sun.istack.internal.Pool;
import org.omg.SendingContext.RunTime;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

class MyPool implements DataSource {
  private LinkedList<Connection> conList = new LinkedList<>();
  private int initCount = 5;  //��ʼ������
  private int maxCount = 6; //���������
  private int curCount = 0; //��ǰ������


  private Connection createConnection() throws SQLException {
    Connection con = DriverManager.getConnection
        ("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8",
            "root", "passok");
    return con;
  }

  public MyPool() throws SQLException {
    for (int i = 0; i < this.initCount; i++) {
      conList.add(createConnection());
      this.curCount++;
    }
  }

  @Override
  public Connection getConnection() throws SQLException {
    if (this.conList.size() > 0) {
      //���ӳ���ȡ
      Connection connection = conList.remove(0);
      return connection;
    }
    if (this.curCount < this.maxCount) {
      Connection connection = this.createConnection();
      this.curCount++;
      return connection;
    }
    if (this.curCount == this.maxCount) {
      throw new RuntimeException("�Ѿ��������������");
    }
    return null;
  }


  @Override
  public Connection getConnection(String username, String password) throws SQLException {
    return null;
  }

  @Override
  public <T> T unwrap(Class<T> iface) throws SQLException {
    return null;
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    return false;
  }

  @Override
  public PrintWriter getLogWriter() throws SQLException {
    return null;
  }

  @Override
  public void setLogWriter(PrintWriter out) throws SQLException {

  }

  @Override
  public void setLoginTimeout(int seconds) throws SQLException {

  }

  @Override
  public int getLoginTimeout() throws SQLException {
    return 0;
  }

  @Override
  public Logger getParentLogger() throws SQLFeatureNotSupportedException {
    return null;
  }
}


public class D02_ConnectPool {
  public static void main(String[] args) throws SQLException {
    //���ӳأ��������Ӷ�������������ڶ��û�������Է�����������Щ���Ӷ��󣬲���ÿ�ζ������µ����Ӷ���
    // ������߳��������Ч��
    MyPool myPool = new MyPool();
    Connection connection1 = null;
    Connection connection2 = null;
    Connection connection3 = null;
    Connection connection4 = null;
    Connection connection5 = null;
    Connection connection6 = null;
    Connection connection7 = null;
    try {
      connection1 = myPool.getConnection();
      connection2 = myPool.getConnection();
      connection3 = myPool.getConnection();
      connection4 = myPool.getConnection();
      connection5 = myPool.getConnection();
      connection6 = myPool.getConnection();
      connection7 = myPool.getConnection();
    }
    finally {
      connection1.close();
      connection2.close();
      connection3.close();
      connection4.close();
      connection5.close();
      connection6.close();
      if (connection7 != null) {
        connection7.close();
      }
    }
  }
}
