package com.liu.apidubbo;


/** 
* @version:V1.0
* @Description: 通过IControlService类借助dubbo向外界暴露服务
*                                          外界通过传入inputDTO参数决定调用本服务的何种service的何种方法
*                                          然后通过OutputDTO将调用结果返回上层调用者
* *(面向接口编程，不要面向实现编程)
* @author: liu 
* @date:
*/ 
public interface IControlService {
	
	/**
	 * 
	* @Title: 
	* @Description: 上层调用dubbo服务的统一入口 
	* @param
	* @return 
	* @throws
	 */
	OutputDTO execute(InputDTO inputDTO);
}
