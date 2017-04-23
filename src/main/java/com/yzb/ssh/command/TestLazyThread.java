package com.yzb.ssh.command;

import com.yzb.ssh.entity.TIphonePlace;
import com.yzb.ssh.entity.TUser;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/4/23.
 */
@Component
public class TestLazyThread {
    public void testThread(TUser tUser,TIphonePlace tIphonePlace){
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 3,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        try{

            for(int i = 0 ; i < 1000 ; i++){
                Thread.sleep(1000);
                ThreadRun threadRun = new ThreadRun(tUser,tIphonePlace);
                threadPool.submit(threadRun);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
