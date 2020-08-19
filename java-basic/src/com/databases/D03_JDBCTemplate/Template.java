package com.databases.D03_JDBCTemplate;

import com.databases.D03_JDBCTemplate.utils.DataSourceUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Template {
  public static void main(String[] args) throws SQLException {
    //DataSource ds = DataSourceUtils.getDataSource();
    //Connection con = ds.getConnection();
    //con.close();


    //��ɾ����update
    JdbcTemplate jt = new JdbcTemplate(DataSourceUtils.getDataSource());
    int row1 = jt.update("insert into student values (null,?,?)", "������", 18);//Ӱ�������
    int row2 = jt.update("update student set name=?,age=? where id=?", "����", 28,6);
    int row3 = jt.update("delete  from student where id=?", 5);
    //��ѯ
    //��ѯһ��  ���д�Լ�Ҫ��װ������
    Integer intNumber = jt.queryForObject("select max(age) from student", Integer.class);  //26
    //    //��ѯ���м�¼
    Map<String, Object> mapRow = jt.queryForMap("select * from student where id=?", 1);
    //��ѯ���м�¼
    List<Map<String, Object>> list = jt.queryForList("select * from student");
    System.out.println(list);
  }
}
