package com.liu.servicetest.service.user;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;

/** 
* @version:
* @Description:用户接口 
* @author: liu 
* @date:
*/  
public interface IUserService {

	/**  
	* @Title: 
	* @Description:  根据号码查询用户信息
	* @param
	* @return 
	* @throws  
	*/ 
	
	public void queryForTest(InputDTO input, OutputDTO output);
	
	
}
