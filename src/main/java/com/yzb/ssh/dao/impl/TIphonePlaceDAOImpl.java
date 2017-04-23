package com.yzb.ssh.dao.impl;

import com.yzb.ssh.dao.TIphonePlaceDao;
import com.yzb.ssh.entity.TIphonePlace;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class TIphonePlaceDAOImpl implements TIphonePlaceDao{
	private static final Logger log = LoggerFactory
			.getLogger(TIphonePlaceDAOImpl.class);

	@Resource
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public TIphonePlace getId(){
		System.out.println("判断session");
		System.out.println(sessionFactory == null);
		System.out.println("判断session1");
		/*String hql = " from TIphonePlace";
		List<TIphonePlace> tIphonePlaceList = getSession().createQuery(hql).list();*/
		TIphonePlace tIphonePlace = (TIphonePlace) getSession().get(TIphonePlace.class,"1");
		Hibernate.initialize(tIphonePlace);
		Hibernate.initialize(tIphonePlace.gettIphone());
		Hibernate.initialize(tIphonePlace.gettIphone().gettUserList());
		/*TIphonePlace newtIphonePlace = new TIphonePlace();
		newtIphonePlace.setId(tIphonePlace.getId());
		newtIphonePlace.setIphoneId(tIphonePlace.getIphoneId());
		newtIphonePlace.setPlace(tIphonePlace.getPlace());
		newtIphonePlace.settIphone(tIphonePlace.gettIphone());
		System.out.println(newtIphonePlace.getId());*/
		getSession().close();
		return tIphonePlace;
	}

}