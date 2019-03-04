package com.liu.usercore.control.impl;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import com.liu.apidubbo.IControlService;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.usercore.util.ControlConstants;
import com.liu.usercore.util.UserCoreException;

/** 
* @version:
* @Description: 
* @author: liu 
* @date:
*/ 
public class ControlServiceImpl implements IControlService,BeanFactoryAware{
	
	private BeanFactory factory;
	private static final Logger LOGGER = LoggerFactory.getLogger(ControlServiceImpl.class);
	@Override
	public void setBeanFactory(BeanFactory factory) {
		this.factory = factory;
	}
	@Override
	public OutputDTO execute(InputDTO inputDTO) {
		//初始化设置返回结果成功
		OutputDTO outputDTO = new OutputDTO(ControlConstants.RETURN_CODE.IS_OK);
		try {
			outputDTO.setCode(ControlConstants.RETURN_CODE.IS_OK);
			if (inputDTO != null) {
				//通过bean名字获取对应类对象
				Object object = factory.getBean(inputDTO.getService());
				//获取要调用的方法对象
				Method mth = object.getClass().getMethod(inputDTO.getMethod(), InputDTO.class, OutputDTO.class);
				//根据反射调用带参方法
				mth.invoke(object, inputDTO ,outputDTO);
			}else{
				throw new UserCoreException("InputDTO can't be null !!!");
			}
			
		}catch(Exception e) {
			LOGGER.error("ControlServiceImpl，调用后台服务方法execute异常",e);
			// 异常处理
			outputDTO.setCode(ControlConstants.RETURN_CODE.SYSTEM_ERROR);
            outputDTO.setMsg("服务异常");
			
		}finally {
			
		}
		return outputDTO;
	}
	
}


















