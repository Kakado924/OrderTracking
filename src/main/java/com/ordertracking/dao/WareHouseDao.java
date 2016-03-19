package com.ordertracking.dao;

import com.ordertracking.bean.Order;
import com.ordertracking.utils.SQLServerManager;
import org.apache.ibatis.session.SqlSession;


/**
 * Created by SESA344888 on 2016/3/12.
 */
public class WareHouseDao {

    public static Order getMoRefByMO(String MO) {
        SqlSession session= SQLServerManager.getSqlSession();
        String statement = "com.ordertracking.mapping.WarehouseMapper.getMoRefByMO";
        Order order = session.selectOne(statement,MO);
        return order;
    }

    public void updateStatus(Order order) {
        SqlSession session= SQLServerManager.getSqlSession();
        order.setStatus("已入库");
        String statement = "com.ordertracking.mapping.WarehouseMapper.updateStatus";
        session.update(statement,order);
        session.commit();
    }
}
