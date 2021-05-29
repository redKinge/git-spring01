/**
 * Project Name:dt60_JDBC2
 * File Name:JdbcUtil.java
 * Package Name:cn.java.utils
 * Date:下午5:31:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package com.java.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description: JdbcUtil工具类工具类<br/>
 * Date: 下午5:31:21 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class JdbcUtil {

    public static DataSource dataSouce = null;

    static {
        try {
            // 1、创建一个Properties对象
            Properties props = new Properties();
            // 2、将Properties对象与jdbc.properties文件关联
            InputStream inStream = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inStream);
            // 3、创建数据源(DataSource)对象
            dataSouce = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
