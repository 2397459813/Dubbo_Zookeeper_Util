package com.liu.ordercore.service.order.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.ordercore.service.common.impl.BaseServiceImpl;
import com.liu.ordercore.service.order.IOrderService;


public class OrderServiceImpl extends BaseServiceImpl implements IOrderService {
	private  static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Override
	public void queryByPhone(InputDTO input, OutputDTO output) {
		logger.info("开始查询订单信息入参："+input.getParams().toString());
		Map<String,Object> item = (Map<String, Object>) getBaseDao().queryForObject("order.queryByPhone", input.getParams());
		output.setItem(item);
		
	}

	@Override
	public void addOrder(InputDTO input, OutputDTO output) {
		
		
	}

}
