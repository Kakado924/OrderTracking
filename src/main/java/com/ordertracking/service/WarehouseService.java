package com.ordertracking.service;

import com.ordertracking.dao.WareHouseDao;
import com.ordertracking.bean.Warehouse;

import java.util.logging.Logger;

/**
 * Created by SESA344888 on 2016/3/12.
 */
public class WarehouseService {

    private static final Logger LOGGER = Logger.getLogger(WarehouseService.class.getName());

    public Warehouse warehouse(String bin) {

        WareHouseDao warehousedao = new WareHouseDao();
        Warehouse BIN = WareHouseDao.getMoRefByBin(bin);
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
