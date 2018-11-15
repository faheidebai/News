package com.news.biz.impl;

import java.util.List;

import com.news.biz.AdminBiz;
import com.news.entity.Admin;
import com.news.dao.AdminDao;

public class AdminBizImpl implements AdminBiz {

	private AdminDao adminDao;
	
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


	@Override
	public List login(Admin condition) {
		// TODO Auto-generated method stub
		return this.adminDao.search(condition);
	}

}
