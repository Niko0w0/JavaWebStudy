package com.daisy.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testJDBC3 {

    @Test
    public void test()  {
        //useUnicode=true&characterEncoding=gbk 解决中文乱码
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&verifyServerCertificate=false&useSSL=false";
        String username = "root";
        String password = "12456";

        Connection connection = null;

        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库
            connection = DriverManager.getConnection(url,username,password);

            //通知数据库开启事务,false是开启
            connection.setAutoCommit(false);
            String sql = "update account set money = money-100 where name = 'A'";
            connection.prepareStatement(sql).executeUpdate();

            //制造错误
//            int i = 1/0;
            String sql2 = "update account set money = money+100 where name = 'B'";
            connection.prepareStatement(sql2).executeQuery();
            connection.commit();//提交事务
            System.out.println("提交事务成功");
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }



    }
}
