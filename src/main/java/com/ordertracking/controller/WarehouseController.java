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
import java.util.HashMap;
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
            Order MO = WarehouseService.inbound(mo);
            Map<String, Order> map = new HashMap<String, Order>();
/*            Order MOA01 = new Order();
            MOA01.setMO("111111111");
            MOA01.setQuantity("23");
            Order MOA02 = new Order();
            MOA02.setMO("222222");
            MOA02.setQuantity("33333");
            map.put("A01-1", MOA01);
            map.put("A01-2", MOA02);*/

            XStream xstream = new XStream(new JsonHierarchicalStreamDriver(){
                public HierarchicalStreamWriter createWriter(Writer out) {
                    return new JsonWriter(out, JsonWriter.DROP_ROOT_MODE);
                }
            });
            response.getWriter().print(xstream.toXML(map));
            //return new ModelAndView("Storage" , map);
        }
    }
