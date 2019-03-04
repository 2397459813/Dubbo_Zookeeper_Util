package com.liu.serviceaggr.service.user.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.serviceaggr.service.common.impl.BaseServiceImpl;
import com.liu.serviceaggr.service.user.IUserService;


public class UserServiceImpl extends BaseServiceImpl implements IUserService{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public void queryByMobile(InputDTO input, OutputDTO output) {
		
		LOGGER.info("通过号码查询用户信息==start>>"+input.getParams());
		getUserRemoteSV().execute(input, output);
		
		
	}
	
	

}
