package com.ordertracking.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by chlei on 2016/3/6.
 */
public class mysqlManager {
    private static SqlSessionFactory sqlManager;
    static{
        String resource = "mybatis-conf.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlManager = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSession getSqlSession() {
        if (sqlManager == null) {
            return null;
        }
        return sqlManager.openSession();
    }

    public static void closeSqlSession() {
        getSqlSession().close();
    }

    public static void commitTransaction() {
        getSqlSession().commit();
    }

    public static void rollBackTransaction(){
        getSqlSession().rollback();
    }
}
