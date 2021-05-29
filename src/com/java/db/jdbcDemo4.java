package com.java.db;

import com.java.pojo.Book;
import com.java.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * description:描述
 * author: 河发
 * time: 20:25
 */
public class jdbcDemo4 {
    public static void main(String[] args) throws Exception {
        QueryRunner qr=new QueryRunner(JdbcUtil.dataSouce);
        List<Book> resultbook=qr.query("SELECT * FROM bank",new BeanListHandler<Book>(Book.class));
        resultbook.forEach(temp->{
                System.out.println(temp);
        });
    }
}
