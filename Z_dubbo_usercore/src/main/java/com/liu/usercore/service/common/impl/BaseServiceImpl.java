package com.liu.usercore.service.common.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.usercore.dao.IBaseDao;

/**
 * Service 基类
 * 
 */
public class BaseServiceImpl {
	private  static final Logger LOGGER= LoggerFactory.getLogger(BaseServiceImpl.class);
	private  IBaseDao baseDao;
	


	public IBaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao( IBaseDao baseDao) {
		this.baseDao = baseDao;
	}

}
