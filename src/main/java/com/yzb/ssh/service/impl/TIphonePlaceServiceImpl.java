package com.yzb.ssh.service.impl;

import com.yzb.ssh.command.TestLazyThread;
import com.yzb.ssh.dao.TIphonePlaceDao;
import com.yzb.ssh.dao.TUserDao;
import com.yzb.ssh.entity.TIphonePlace;
import com.yzb.ssh.entity.TUser;
import com.yzb.ssh.service.TIphonePlaceService;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/23.
 */
@Service
public class TIphonePlaceServiceImpl implements TIphonePlaceService {

    @Resource
    private TIphonePlaceDao tIphonePlaceDao;

    @Resource
    private TestLazyThread testLazyThread;

    @Resource
    private TUserDao tUserDao;


    public TIphonePlace getId(){
       TIphonePlace tIphonePlace = tIphonePlaceDao.getId();
        System.out.println(tIphonePlace.gettIphone().gettUserList().get(0).getId()+"ddddddd");
        /*TIphonePlace tIphonePlace = new TIphonePlace();
        TUser tUser = tUserDao.getTUser();*/
        TUser tUser = new TUser();
        testLazyThread.testThread(tUser,tIphonePlace);
        return tIphonePlace;
    }

}
