package com.yzb.ssh.test;

import com.alibaba.fastjson.JSON;
import com.yzb.ssh.entity.TIphonePlace;
import com.yzb.ssh.entity.TUser;
import com.yzb.ssh.service.TIphonePlaceService;
import com.yzb.ssh.service.TUserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath*:spring.xml","classpath*:spring-hibernate.xml","classpath*:struts.xml",})
/*@Transactional
@Rollback(false)*/
public class TUserTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private TUserService tUserService;

    @Resource
    private TIphonePlaceService tIphonePlaceService;
   /* @Ignore
    @Test
    public void test1(){
        TUser tuser = tUserService.getTUser();
        //System.out.println("dddddd");
        //System.out.println(JSON.toJSONString(tuser.gettIphones()));
    }*/


    @Test
    public void test(){
        TIphonePlace tIphonePlace = tIphonePlaceService.getId();
        System.out.println(tIphonePlace.toString());
        //System.out.println("ssssss");
    }
}
