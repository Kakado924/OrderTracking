package com.ordertracking.controller;

import com.ordertracking.bean.Order;
import com.ordertracking.service.WarehouseService;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/**
 * Created by SESA344888 on 2016/3/12.
 */
@Controller
public class WarehouseController {

            private static final Logger LOGGER = Logger.getLogger(WarehouseController.class.getName());
        /**
         *  在这里面添加login 的调用业务逻辑
         * @param response
         * @return
         * @throws IOException
         */
        @RequestMapping(value="/inbound.do")
        public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String mo = request.getParameter("mo");
            LOGGER.info("MO:" + mo);
            WarehouseService WarehouseService = new WarehouseService();
            List<Order> orders = WarehouseService.inbound(mo);
            /*List<Order> orders = new ArrayList<Order>();
            Order order1 = new Order();
            order1.setMO("1111");
            order1.setWarehouseBin("A44-1");
            order1.setReference("oooo");

            Order order2 = new Order();
            order2.setMO("222");
            order2.setWarehouseBin("A44-2");
            order2.setReference("hhhh");

            orders.add(order1);
            orders.add(order2);*/

            XStream xstream = new XStream(new JsonHierarchicalStreamDriver(){
                public HierarchicalStreamWriter createWriter(Writer out) {
                    return new JsonWriter(out, JsonWriter.DROP_ROOT_MODE);
                }
            });
            response.getWriter().print(xstream.toXML(orders));
        }
    }
