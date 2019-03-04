package com.liu.apidubbo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @version:V1.0
* @Description: 调用service服务的封装入参类
* @author: liu 
* @date:
*/ 
public class InputDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String service;
	private String method;
	private String busiCode;
	private Map<String, Object> params = new HashMap<String, Object>();
	private List<Map<String, Object>> beans = new ArrayList<Map<String, Object>>();

	public InputDTO() {
	}

	public InputDTO(String service, String method) {
		this.service = service;
		this.method = method;
	}

	public InputDTO(String service, String method, Map<String, Object> params) {
		this.service = service;
		this.method = method;
		this.params = params;
	}

	public InputDTO(String service, String method, Map<String, Object> params, Map<String, String> logParams) {
		this.service = service;
		this.method = method;
		this.params = params;

	}

	public InputDTO(String service, String method, Map<String, Object> params, Map<String, String> comParams,
			Map<String, String> logParams) {
		this.service = service;
		this.method = method;
		this.params = params;

	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Map<String, Object> getParams() {
		if (null == params) {
			params = new HashMap<String, Object>();
		}
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public List<Map<String, Object>> getBeans() {
		return null == beans ? new ArrayList<Map<String, Object>>() : beans;
	}

	public void setBeans(List<Map<String, Object>> beans) {
		this.beans = beans;
	}

	public String getBusiCode() {
		return busiCode;
	}

	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}

	public void addParams(String key, String toKey, String value) {
		if (toKey != null && !"".equals(toKey)) {
			getParams().put(toKey, value);
		} else {
			getParams().put(key, value);
		}
	}

	public void addBeans(String key, String toKey, int index, String value) {
		if (getBeans().size() <= index) {
			getBeans().add(new HashMap<String, Object>());
		}
		if (toKey != null && !"".equals(toKey)) {
			getBeans().get(index).put(toKey, value);
		} else {
			getBeans().get(index).put(key, value);
		}
	}

	public String getValue(String key) {
		Object value = getParams().get(key);
		if (value != null && (value instanceof Number || value instanceof String)) {
			return String.valueOf(value);
		}
		return (String) getParams().get(key);
	}

	public String getBeansValue(int index, String key) {

		if (getBeans().size() <= index) {
			return null;
		}
		return (String) getBeans().get(index).get(key);
	}

}
