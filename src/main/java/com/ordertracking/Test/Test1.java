package com.ordertracking.Test;

import com.ordertracking.bean.User;
import com.ordertracking.bean.Warehouse;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chlei on 2016/3/6.
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        /*String resource = "mybatis-conf.xml";
        Reader is = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //SqlSession session = sessionFactory.openSession();
        SqlSession session = mysqlManager.getSqlSession();

        String statement = "com.ordertracking.mapping.userMapper.getUserByUserName";
        User user = session.selectOne(statement, "lcc");
        System.out.println(user);*/

        /*User user1 = new User(1, "lcc","lcc",2);
        User user2 = new User(2, "lcc2","lcc2",3);
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        XStream xstream3 = new XStream(new JsonHierarchicalStreamDriver());
        xstream3.alias("user",User.class);
        xstream3.toXML(users, new PrintWriter(System.out));*/

        Map<String, Warehouse> map = new HashMap<String, Warehouse>();
        Warehouse MOA01 = new Warehouse();
        MOA01.setMO("111111111");
        MOA01.setQuantity("23");
        Warehouse MOA02 = new Warehouse();
        MOA02.setMO("222222");
        MOA02.setQuantity("33333");
        map.put("A01-1", MOA01);
        map.put("A01-2", MOA02);
        XStream xstream3 = new XStream(new JsonHierarchicalStreamDriver(){
            public HierarchicalStreamWriter createWriter(Writer out) {
                return new JsonWriter(out, JsonWriter.DROP_ROOT_MODE);
            }
        });
        xstream3.alias("user",User.class);
        xstream3.toXML(map, new PrintWriter(System.out));
    }
}
