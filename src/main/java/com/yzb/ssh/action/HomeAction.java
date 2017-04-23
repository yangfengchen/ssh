package com.yzb.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;

/**
 * Created by Administrator on 2017/4/23.
 */
/*@Namespace("/common")*/
public class HomeAction extends ActionSupport {

    //请求路径 http://localhost:9090/common/home!index.action + @Namespace("/common") 返回到common/home_index.jsp
    //或者可以@Action
    @Action(value = "/common/index")
    public String index(){
        System.out.println("进入成功");
        return "index";
    }

}
