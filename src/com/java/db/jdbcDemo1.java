package com.java.db;

import com.java.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * description:描述
 * author: 河发
 * time: 14:00
 */
public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
          //1,创建QueryRunner的核心类
        QueryRunner qr=new QueryRunner(JdbcUtil.dataSouce);
        //2,开始执行sql
        int flag= qr.update("INSERT INTO persons SET Uname='宫本',gender='男',address='日本',idCard='49888766555'");
        System.out.println("flag="+flag);
    }
}
