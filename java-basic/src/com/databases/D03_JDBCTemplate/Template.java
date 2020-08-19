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


    //增删改用update
    JdbcTemplate jt = new JdbcTemplate(DataSourceUtils.getDataSource());
    int row1 = jt.update("insert into student values (null,?,?)", "范冰冰", 18);//影响的行数
    int row2 = jt.update("update student set name=?,age=? where id=?", "刘艳", 28,6);
    int row3 = jt.update("delete  from student where id=?", 5);
    //查询
    //查询一个  后边写自己要封装的类型
    Integer intNumber = jt.queryForObject("select max(age) from student", Integer.class);  //26
    //    //查询单行记录
    Map<String, Object> mapRow = jt.queryForMap("select * from student where id=?", 1);
    //查询多行记录
    List<Map<String, Object>> list = jt.queryForList("select * from student");
    System.out.println(list);
  }
}
