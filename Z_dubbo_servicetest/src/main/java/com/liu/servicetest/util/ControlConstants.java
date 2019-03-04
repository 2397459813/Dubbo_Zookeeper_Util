package com.liu.servicetest.util;

/**
 * @version:
 * @Description:返回对象成功失败标志常量类
 * @author: liu
 * @date:
 */
public final class ControlConstants {
	private ControlConstants() {
	}

	public interface RETURN_CODE {
		String IS_OK = "0";
		String SYSTEM_ERROR = "-1";
	}

	public interface LOCAL_TYPE {
		String ZH_CN = "zh_CN";
		String EN_US = "en_US";
	}
}