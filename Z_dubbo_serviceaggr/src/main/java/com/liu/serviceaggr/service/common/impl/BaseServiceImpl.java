package com.liu.serviceaggr.service.common.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.serviceaggr.control.remote.IRemoteService;


/**
 * 服务基类
 */	
public class BaseServiceImpl {

    private IRemoteService userRemoteSV;
    private IRemoteService orderRemoteSV;
	public IRemoteService getUserRemoteSV() {
		return userRemoteSV;
	}
	public void setUserRemoteSV(IRemoteService userRemoteSV) {
		this.userRemoteSV = userRemoteSV;
	}
	public IRemoteService getOrderRemoteSV() {
		return orderRemoteSV;
	}
	public void setOrderRemoteSV(IRemoteService orderRemoteSV) {
		this.orderRemoteSV = orderRemoteSV;
	}
	
	


}
