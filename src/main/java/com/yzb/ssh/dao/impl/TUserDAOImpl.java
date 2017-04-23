package com.yzb.ssh.dao.impl;

import com.alibaba.fastjson.JSON;
import com.yzb.ssh.dao.TUserDao;
import com.yzb.ssh.entity.TUser;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TUserDAOImpl implements TUserDao{
	private static final Logger log = LoggerFactory.getLogger(TUserDAOImpl.class);

	@Resource
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public TUser getTUser(){
		TUser tuser = (TUser) getSession().get(TUser.class,"1");
		System.out.println(JSON.toJSONString(tuser));
		Hibernate.initialize(tuser);
		Hibernate.initialize(tuser.gettIphones());
		/*TUser newTuser = new TUser();
		newTuser.setId(tuser.getId());
		newTuser.setContactinfomation(tuser.getContactinfomation());
		newTuser.setName(tuser.getName());
		newTuser.setVocation(tuser.getVocation());
		newTuser.settIphones(tuser.gettIphones());*/
		getSession().close();
		return tuser;
	}
}