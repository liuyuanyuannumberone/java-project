package com.databases.D03_JDBCTemplate.rowMapper;

import com.databases.D03_JDBCTemplate.utils.DataSourceUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RowMapper {
  public static void main(String[] args) {
    JdbcTemplate jt = new JdbcTemplate(DataSourceUtils.getDataSource());
    //将数据库结果封装成自定义格式
    List<Student> queryList = jt.query("select * from student",
        new org.springframework.jdbc.core.RowMapper<Student>() {
          @Override
          public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            Student stu = new Student();
            stu.setId(resultSet.getInt("id"));
            stu.setName(resultSet.getString("name"));
            stu.setAge(resultSet.getInt("age"));
            return stu;
          }
        });

    List<Student> queryList_two = jt.query("select * from student", (ResultSet rs, int i) -> {
      Student stu = new Student();
      stu.setId(rs.getInt("id"));
      stu.setName(rs.getString("name"));
      stu.setAge(rs.getInt("age"));
      return stu;
    });

    // query内部会根据返回结果，把数据库的字段与setId setName setAge方法一一对应，
    // 如果找不到，复制为null
    //使用前提：数据库列名===类的set列名字 一对应
    List<Student> studentList = jt.query("select * from student",
        new BeanPropertyRowMapper<>(Student.class));
    System.out.println(studentList);
  }
}
