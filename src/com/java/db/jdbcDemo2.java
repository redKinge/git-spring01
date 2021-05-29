package com.java.db;

import com.java.pojo.Book;
import com.java.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.management.Query;
import java.sql.SQLException;

/**
 * description:描述
 * author: 河发
 * time: 14:05
 */
public class jdbcDemo2 {
    public static void main(String[] args) throws Exception {
        QueryRunner qr=new QueryRunner(JdbcUtil.dataSouce);
       /*String bankNo=(String)qr.query("SELECT bankNo FROM bank WHERE id=4",new ScalarHandler<String>());
       System.out.println("bankNo="+bankNo);*/
       Float money=qr.query("SELECT money FROM bank WHERE id=4",new ScalarHandler<Float>());
       System.out.println(money);
       Book bk1=qr.query("SELECT * FROM bank WHERE id=4",new BeanHandler<Book>(Book.class));
       System.out.println(bk1);
    }
}
