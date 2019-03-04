package com.liu.servicetest.service.user.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.servicetest.service.user.IUserService;

	

public class UserServiceImpl implements IUserService{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public void queryForTest(InputDTO input, OutputDTO output) {
		
		LOGGER.info("input.getParam:"+input.getParams().toString());
		output.setData("test hello dubbo");
			
		
	}
	
	

}
