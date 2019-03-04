package com.liu.serviceaggr.service.order;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;

/** 
* @version:
* @Description:订单服务接口
* @author: liu 
* @date:
*/ 
public interface IOrderService {
	
	/**  
	* @Title: 
	* @Description:  通过号码查询订单信息
	* @param
	* @return 
	* @throws  
	*/ 
	
	public void queryByPhone(InputDTO input, OutputDTO output);
}
