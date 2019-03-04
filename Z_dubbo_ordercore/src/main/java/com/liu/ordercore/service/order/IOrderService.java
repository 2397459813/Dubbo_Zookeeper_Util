package com.liu.ordercore.service.order;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;

/** 
* @version:
* @Description: 订单处理接口
* @author: liu 
* @date:
*/ 
public interface IOrderService {
	/**
	 * 根据订单号码查询订单信息
	 * @param input
	 * @param output
	 */
	void queryByPhone(InputDTO input, OutputDTO output);
	/**
	 * 插入订单信息
	 * @param input
	 * @param output
	 */
	void addOrder(InputDTO input, OutputDTO output);
}
