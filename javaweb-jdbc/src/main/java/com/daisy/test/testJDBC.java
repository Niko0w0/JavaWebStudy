package com.daisy.test;

import java.sql.*;

public class testJDBC {
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
        Statement statement=connection.createStatement();
        // 编写SQL
        String sql = "select * from users;";
        //执行SQL
        ResultSet resultSet =statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println("id"+resultSet.getObject("id"));
            System.out.println("name"+resultSet.getObject("name"));
            System.out.println("password"+resultSet.getObject("password"));
            System.out.println("email"+resultSet.getObject("email"));
            System.out.println("birthday"+resultSet.getObject("birthday"));
        }
        // 关闭连接，释放资源（一定要做）
        resultSet.close();
        statement.close();
        connection.close();
    }
}
