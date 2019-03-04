package com.liu.web.common.util;
/** 
* @version:
* @Description: 全局异常类
* @author: liu 
* @date:
*/ 
public class WebCoreException extends RuntimeException{
	
	private static final long serialVersionUID = 6242165744027783598L;

	/**
	 * 
	 * @param msg
	 */
	public WebCoreException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param msg
	 * @param e
	 */
	public WebCoreException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * 
	 * @param e
	 */
	public WebCoreException(Throwable e) {
		super(e);
	}
}
