package com.java.dao.impl;

import com.java.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * description:描述
 * author: 河发
 * time: 15:15
 */
public class PersonDaoImpl {
    private static QueryRunner qr=new QueryRunner(JdbcUtil.dataSouce);
    /**
     * 信息录入
     */
    public static int insertPerson(String[] param) throws Exception {
        int flag= qr.update("INSERT INTO people SET Uname=?,gender=?,address=?,idCard=?",param);
        return flag;
    }

    /**
     * 查询人员信息
     */
    public static List<Map<String,Object>> selectPerson() throws SQLException {
          List<Map<String,Object>> resultList=qr.query("SELECT * FROM people",new MapListHandler());
          return resultList;
    }
    /**
     * 删除人员信息
     */
    public static int deletePerson(String ids) throws SQLException {
      int flag= qr.update("DELETE FROM people WHERE idCard=?",ids);
      return flag;
    }

    /**
     * 修改人员信息
     */
    /*public static int updatePerson(String[] params) throws SQLException {
       int flag=qr.update("UPDATE people SET Uname=？,gender=？,address=？ WHERE idCard=？",params);
       return flag;
        UPDATE persons SET NAME=?,gender=?,address=? WHERE idCard=?
    }*/
    public static int updatePerson(String[] params) throws SQLException {
        int flag = qr.update("UPDATE people SET Uname=？,gender=？,address=？ WHERE idCard=？",params);
        return flag;
    }
}
