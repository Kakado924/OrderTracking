package com.ordertracking.service;

import com.ordertracking.dao.WareHouseDao;
import com.ordertracking.bean.Order;

import java.util.logging.Logger;

/**
 * Created by SESA344888 on 2016/3/12.
 */
public class WarehouseService {

    private static final Logger LOGGER = Logger.getLogger(WarehouseService.class.getName());

    public Order inbound(String MO) {

        WareHouseDao warehousedao = new WareHouseDao();
        Order BIN = WareHouseDao.getMoRefByMO(MO);
        if (BIN == null) {
            return null;
        }
        else if (BIN.getStatus().equals("配送中")) {
            warehousedao.updateStatus(BIN);
            return BIN;
        }
        return null;
    }
}
