package com.liu.web.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class CustomObjectMapper extends ObjectMapper {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1426571377565762838L;

		 public CustomObjectMapper() {
		        super();
		        SimpleModule simpleModule = new SimpleModule();
		        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
		        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
		        registerModule(simpleModule);
	}
}
