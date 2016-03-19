package com.ordertracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by chlei on 2016/3/10.
 */
@Controller
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());
    /**
     *
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/login.do")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LOGGER.info("username : " + username + "password:" + password);
        /*LoginService loginService = new LoginService();
        int authority = loginService.login(username, password);*/
        int authority = 1;
        if (authority == 1) {
            return new ModelAndView("Storage");
        }
        // 根据返回的结果，跳转到对应的页面
        return new ModelAndView("home");
    }
}
