package com.liu.web.modules.user.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.web.common.web.BaseController;


/**
 * ClassName:UserController 
 * 
 * @author liu
 * @version
 * @since JDK 1.7
 */

@Controller
@RequestMapping("/api/user")
public class UserController extends BaseController{

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	@ResponseBody
	
	public OutputDTO getUser(HttpServletResponse response, HttpServletRequest request) {
		InputDTO input = new InputDTO();
		OutputDTO output = new OutputDTO();
		//查询用户信息
		input.setService("userService");
		input.setMethod("queryByMobile");
		Map<String,Object> item = new HashMap<String,Object>();
		item.put("mobile", "13101714387");
		input.setParams(item);
		getServiceaggrSV().execute(input, output);
		logger.info(output.toString());
		
		//========================================服务端获取cookie
		
		  Cookie[] cookies = (Cookie[]) request.getCookies();//根据请求数据，找到cookie数组

	        if (null==cookies) {//如果没有cookie数组
	            System.out.println("没有cookie");
	        } else {
	            for(Cookie cookie : cookies){
	                System.out.println("cookieName:"+cookie.getName()+",cookieValue:"+ cookie.getValue());
	            }
	        }
	       
	    
	    //========================================
	    String param = request.getParameter("testcookiekey");
	    HttpSession session  = request.getSession();
	    session.setAttribute("testcookiekey", param);
	     System.out.println("session中存放的cookie值为："+session.getAttribute("testcookiekey")+"sessionId为："+session.getId());   
		return output;
	}
	
	
	
}



















