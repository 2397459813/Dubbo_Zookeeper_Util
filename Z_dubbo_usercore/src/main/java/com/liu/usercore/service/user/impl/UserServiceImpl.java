package com.liu.usercore.service.user.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.usercore.service.common.impl.BaseServiceImpl;
import com.liu.usercore.service.user.IUserService;


public class UserServiceImpl extends BaseServiceImpl implements IUserService{
	private  static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public void queryByMobile(InputDTO input, OutputDTO output) {
		logger.info("开始查询user信息入参："+input.getParams().toString());
		Map<String,Object> item = (Map<String, Object>) getBaseDao().queryForObject("user.queryByMobile", input.getParams());
		output.setItem(item);
	}

	@Override
	public void addUser(InputDTO input, OutputDTO output) {
		// TODO Auto-generated method stub
		
	}

}
