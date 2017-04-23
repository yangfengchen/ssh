package com.yzb.ssh.service.impl;

import com.yzb.ssh.dao.TUserDao;
import com.yzb.ssh.entity.TUser;
import com.yzb.ssh.service.TUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/23.
 */
@Service
public class TUserServiceImpl implements TUserService{

    @Resource
    private TUserDao tUserDao;

    public TUser getTUser(){
        TUser tUser = tUserDao.getTUser();
        System.out.println(tUser.gettIphones());
        return tUser;
    }
}
