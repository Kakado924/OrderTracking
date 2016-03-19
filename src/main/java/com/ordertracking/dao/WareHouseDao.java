package com.ordertracking.dao;

import com.ordertracking.bean.Warehouse;
import com.ordertracking.utils.SQLServerManager;
import org.apache.ibatis.session.SqlSession;


/**
 * Created by SESA344888 on 2016/3/12.
 */
public class WareHouseDao {

    public static Warehouse getMoRefByBin(String bin) {
        SqlSession session= SQLServerManager.getSqlSession();
        String statement = "com.ordertracking.mapping.WarehouseMapper.getMoRefByBin";
        Warehouse BIN = session.selectOne(statement,bin);
        return BIN;
    }

    public void updateStatus(Warehouse bin) {
        SqlSession session= SQLServerManager.getSqlSession();
        bin.setStatus("已入库");
        String statement = "com.ordertracking.mapping.WarehouseMapper.updateStatus";
        session.update(statement,bin);
        session.commit();
    }
}
