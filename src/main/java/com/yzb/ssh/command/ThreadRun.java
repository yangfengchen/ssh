package com.yzb.ssh.command;

import com.yzb.ssh.entity.TIphone;
import com.yzb.ssh.entity.TIphonePlace;
import com.yzb.ssh.entity.TUser;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;


public class ThreadRun implements Callable<String> {

    private TUser tUser;
    private TIphonePlace tIphonePlace;
    public ThreadRun(TUser tUser,TIphonePlace tIphonePlace){
        this.tUser = tUser;
        this.tIphonePlace = tIphonePlace;
    }

    public String call() throws Exception {
        try{
           /* TIphone tIphone = tUser.gettIphones().get(0);
            System.out.println(tIphone.getId()+""+tIphone.getIphone());*/
            System.out.println("ss:"+tIphonePlace.gettIphone().gettUserList().get(0).getName());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }
}
