package com.study.controller;

import com.study.entity.UserInfo;
import com.study.service.IUserInfoService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInfoController implements Controller {

    private IUserInfoService service;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String uname = request.getParameter("name");
        Integer uage = Integer.valueOf(request.getParameter("age"));
        UserInfo info = new UserInfo();
        info.setAge(uage);
        info.setName(uname);
        service.add(info);

        return new ModelAndView("/welcome.jsp");
    }

    public IUserInfoService getService() {
        return service;
    }

    public void setService(IUserInfoService service) {
        this.service = service;
    }
}
