package com.ordertracking.Test;

import com.ordertracking.bean.User;
import com.ordertracking.bean.Order;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        List<Order> orders = new ArrayList<Order>();
        Order order1 = new Order();
        order1.setMO("1111");
        order1.setWarehouseBin("A01-1");
        order1.setReference("oooo");

        Order order2 = new Order();
        order2.setMO("1111");
        order2.setWarehouseBin("A01-1");
        order2.setReference("oooo");

        orders.add(order1);
        orders.add(order2);
        XStream xstream3 = new XStream(new JsonHierarchicalStreamDriver(){
            public HierarchicalStreamWriter createWriter(Writer out) {
                return new JsonWriter(out, JsonWriter.DROP_ROOT_MODE);
            }
        });
        xstream3.alias("user",User.class);
        xstream3.toXML(orders, new PrintWriter(System.out));
    }
}
