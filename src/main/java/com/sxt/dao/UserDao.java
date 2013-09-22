package com.sxt.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sxt.po.User;

public class UserDao {
	private HibernateTemplate hibernateTemplate;
	
	public void add(User u){
		System.out.println("UserDao.add()");
		
//		Serializable id = new User();
//		User user = (User) hibernateTemplate.get("com.sxt.po.User", id);
		System.out.println(hibernateTemplate);
		hibernateTemplate.save(u);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
