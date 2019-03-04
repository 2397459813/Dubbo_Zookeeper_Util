package com.liu.serviceaggr.control.remote.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liu.apidubbo.IControlService;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.serviceaggr.control.remote.IRemoteService;



/** 
* @version:
* @Description: BaseRemoteSVImpl只有一个execute方法，此类注入controlService远程接口，execute方法中调用远程接口的execute方法获取返回值，
* 				BaseRemoteSVImpl是UserServiceImpl和OrderServiceImpl的父类		
* 将返回值赋给OutputDTO对象
* @author: liu 
* @date:
*/ 
public class BaseRemoteSVImpl implements IRemoteService {
    private static final Logger logger = LoggerFactory.getLogger(BaseRemoteSVImpl.class);
    //由dubbo服务进行远程注入
    private IControlService controlService;

    public void execute(InputDTO inputDTO, OutputDTO outputDTO) {
        long start = System.currentTimeMillis();
        logger.info("START INVOKE WEBAPP...service=" + inputDTO.getService() + "   method=" + inputDTO.getMethod());

        // 转换成Json
        logger.info("InputDTO.getParams==" + inputDTO.getParams().toString());
        // 调用由dubbo服务提供的远程接口
        OutputDTO obj = controlService.execute(inputDTO);
        // 转换成
        outputDTO.setItem(obj.getItem());
        outputDTO.setItems(obj.getItems());
        outputDTO.setTotal(obj.getTotal());
        outputDTO.setData(obj.getData());
        outputDTO.setCode(obj.getCode());
        outputDTO.setMsg(obj.getMsg());
        long end = System.currentTimeMillis();
        logger.info("END INVOKE WEBAPP..." + String.valueOf(end - start) + "ms");
    }

    public IControlService getControlService() {
        return controlService;
    }

    public void setControlService(IControlService controlService) {
        this.controlService = controlService;
    }
}