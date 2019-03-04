package com.liu.usercore.util;


/** 
* @version:
* @Description: 全局异常类
* @author: liu 
* @date:
*/ 
public class UserCoreException extends RuntimeException  {

	private static final long serialVersionUID = 6242165744027783598L;

	/**
	 * 
	 * @param msg
	 */
	public UserCoreException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param msg
	 * @param e
	 */
	public UserCoreException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * 
	 * @param e
	 */
	public UserCoreException(Throwable e) {
		super(e);
	}
	
}
