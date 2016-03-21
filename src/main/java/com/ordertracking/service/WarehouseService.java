package com.ordertracking.service;

import com.ordertracking.dao.WareHouseDao;
import com.ordertracking.bean.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by SESA344888 on 2016/3/12.
 */
public class WarehouseService {

    private static final Logger LOGGER = Logger.getLogger(WarehouseService.class.getName());

    public List<Order> inbound(String MO) {
        WareHouseDao warehousedao = new WareHouseDao();
        Order order = WareHouseDao.getMoRefByMO(MO);
        if (order == null) {
            return null;
        }
        else if (order.getStatus().equals("配送中")) {
            warehousedao.updateStatus(order);
            addMoToWarehouse(order);
            return warehousedao.getInboundVisual();
        }
        return warehousedao.getInboundVisual();
    }

    private void addMoToWarehouse(Order order) {
        WareHouseDao warehousedao = new WareHouseDao();
        String orderBin = order.getWarehouseBin();
        String[] bins = orderBin.split(",");
        int length = bins.length;
        List<Order> orders = new ArrayList<Order>();
        for (int i = 0; i < length; i ++) {
            Order temp = new Order();
            temp.setWarehouseBin(bins[i]);
            temp.setMO(order.getMO());
            temp.setReference(order.getReference());
            orders.add(temp);
        }
        warehousedao.addMoToWarehouse(orders);
    }
}
