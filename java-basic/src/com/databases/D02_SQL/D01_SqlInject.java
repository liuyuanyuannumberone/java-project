package com.databases.D02_SQL;

import com.databases.D01_JDBC.MysqlUtils;

import java.sql.*;

public class D01_SqlInject {
  public static void main(String[] args) throws SQLException {
    //sqlע��:���û��������а���һЩSQL�ķ��ţ�������ǲ����жϾ�ֱ�ӷ�װ��sql����У��Ӷ���ı���������sql
    //�ĺ��壬��������ͽ���SQLע��.
    //����취��ps�ڲ�ת�������sqlע������,��ȫ����Statement
    String name = "lyy";
    String passwd = "passok";
    Connection con = MysqlUtils.getConnection();
    String sql = "select * from  user where userName=?and userPwd=?";
    PreparedStatement ps = con.prepareStatement(sql);
    int count = ps.getParameterMetaData().getParameterCount();  //��������
    //����Ҫ���ǲ������;Ϳ��Բ���
    ps.setObject(1, name);  // ps.setString(1, name);
    ps.setObject(2, passwd); //ps.setString(2, passwd);
    ps.executeQuery();
    ps.close();
    con.close();
  }
}
