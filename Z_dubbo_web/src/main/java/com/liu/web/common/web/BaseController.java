package com.liu.web.common.web;


import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.web.common.control.remote.impl.ServiceaggrSV;
import com.liu.web.common.control.remote.impl.ServicetestSV;


public class BaseController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Resource(name = "serviceaggrSV")
	private ServiceaggrSV serviceaggrSV; // 前后工程调用服务
	@Resource(name = "servicetestSV")
	private ServicetestSV servicetestSV; // 前后工程调用服务
	public ServiceaggrSV getServiceaggrSV() {
		return serviceaggrSV;
	}
	public void setServiceaggrSV(ServiceaggrSV serviceaggrSV) {
		this.serviceaggrSV = serviceaggrSV;
	}
	public ServicetestSV getServicetestSV() {
		return servicetestSV;
	}
	public void setServicetestSV(ServicetestSV servicetestSV) {
		this.servicetestSV = servicetestSV;
	}




}
