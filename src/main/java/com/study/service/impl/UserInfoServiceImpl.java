package com.study.service.impl;

import com.study.dao.IUserInfoDAO;
import com.study.entity.UserInfo;
import com.study.service.IUserInfoService;

public class UserInfoServiceImpl implements IUserInfoService {

    private IUserInfoDAO dao;

    @Override
    public void add(UserInfo info) {
        dao.add(info);
    }

    public IUserInfoDAO getDao() {
        return dao;
    }

    public void setDao(IUserInfoDAO dao) {
        this.dao = dao;
    }
}
