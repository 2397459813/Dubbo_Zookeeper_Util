package com.liu.apidubbo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @version:V1.0
* @Description:调用service服务方法之后返回结果存储到OutputDTO中返回 
* @author: liu 
* @date:
*/ 
public class OutputDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String msg;
	private Map<String, Object> item = new HashMap<String, Object>();
	private Integer total;
	private List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
	private Object data;

	public OutputDTO() {
	}

	public OutputDTO(String code) {
		super();
		this.code = code;
	}

	public OutputDTO(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getItem() {
		return item;
	}

	public void setItem(Map<String, Object> item) {
		this.item = item;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Map<String, Object>> getItems() {
		return items;
	}

	public void setItems(List<Map<String, Object>> items) {
		this.items = items;
	}

	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}

}
