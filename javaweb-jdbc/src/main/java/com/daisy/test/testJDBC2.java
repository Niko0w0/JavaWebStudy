package com.daisy.test;

import java.sql.*;

public class testJDBC2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //useUnicode=true&characterEncoding=gbk 解决中文乱码
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&verifyServerCertificate=false&useSSL=false";
        String username = "root";
        String password = "12456";

        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接数据库
        Connection connection =DriverManager.getConnection(url,username,password);
        //向数据库发送SQL的对象Statement：CRUD
        String sql = "insert into users(id,name,password,email,birthday) values (?,?,?,?,?);";
        PreparedStatement ps=connection.prepareStatement(sql);
        // 编写SQL
        ps.setInt(1,4);
        ps.setString(2,"啦啦");
        ps.setString(3,"123456");
        ps.setString(4,"32428@qq.com");
        ps.setDate(5,new Date(new java.util.Date().getTime()));
        //执行SQL
        int rows = ps.executeUpdate();
        if(rows > 0){
            System.out.println("插入成功");
        }
        System.out.println(rows);
        // 关闭连接，释放资源（一定要做）
        ps.close();
        connection.close();
    }
}
