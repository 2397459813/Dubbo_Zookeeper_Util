package com.liu.ordercore.util;
/** 
* @version:
* @Description: 全局异常类
* @author: liu 
* @date:
*/ 
public class OrderCoreException extends RuntimeException{
	
	private static final long serialVersionUID = 6242165744027783598L;

	/**
	 * 
	 * @param msg
	 */
	public OrderCoreException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param msg
	 * @param e
	 */
	public OrderCoreException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * 
	 * @param e
	 */
	public OrderCoreException(Throwable e) {
		super(e);
	}
}
