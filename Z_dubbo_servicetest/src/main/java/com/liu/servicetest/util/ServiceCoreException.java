package com.liu.servicetest.util;


/** 
* @version:
* @Description: 全局异常类
* @author: liu 
* @date:
*/ 
public class ServiceCoreException extends RuntimeException  {

	private static final long serialVersionUID = 6242165744027783598L;

	/**
	 * 
	 * @param msg
	 */
	public ServiceCoreException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param msg
	 * @param e
	 */
	public ServiceCoreException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * 
	 * @param e
	 */
	public ServiceCoreException(Throwable e) {
		super(e);
	}
	
}
