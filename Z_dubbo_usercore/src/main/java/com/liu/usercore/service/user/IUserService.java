package com.liu.usercore.service.user;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;

/** 
* @version:
* @Description: 用户处理接口
* @author: liu 
* @date:
*/ 
public interface IUserService {
	/**
	 * 根据mobile查询用户信息
	 * @param input
	 * @param output
	 */
	void queryByMobile(InputDTO input, OutputDTO output);
	/**
	 *     插入用户信息
	 * @param input
	 * @param output
	 */
	void addUser(InputDTO input, OutputDTO output);
	
}
