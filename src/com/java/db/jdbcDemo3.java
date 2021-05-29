package com.java.db;

import com.java.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * description:描述
 * author: 河发
 * time: 20:14
 */
public class jdbcDemo3 {
    public static void main(String[] args) throws Exception {
        QueryRunner qr=new QueryRunner(JdbcUtil.dataSouce);
        List<Map<String,Object>> resultList=qr.query("SELECT * FROM bank",new MapListHandler());
        resultList.forEach(temp->{
              System.out.println(temp);
        });
    }
}
