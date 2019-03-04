package com.liu.serviceaggr.service.order.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.serviceaggr.service.common.impl.BaseServiceImpl;
import com.liu.serviceaggr.service.order.IOrderService;


public class OrderServiceImpl extends BaseServiceImpl implements IOrderService{
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Override
	public void queryByPhone(InputDTO input, OutputDTO output) {
		LOGGER.info("查询订单信息==>>start"+input.getParams());
		getOrderRemoteSV().execute(input, output);
		
	}

}
