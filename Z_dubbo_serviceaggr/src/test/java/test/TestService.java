package test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.serviceaggr.service.order.IOrderService;
import com.liu.serviceaggr.service.user.IUserService;


public class TestService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);
	@Test
	public void testSpring() {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring/spring-all.xml");
		IUserService userservice = (IUserService) factory.getBean("userService");
		InputDTO input = new InputDTO();
		Map<String,Object> item = new HashMap<String,Object>();
		item.put("mobile", "13101714387");
		input.setParams(item);
		input.setService("userService");
		input.setMethod("queryByMobile");
		OutputDTO output = new OutputDTO();
		userservice.queryByMobile(input, output);
		LOGGER.info("**********************************调用usercore服务"+output.getItem().toString());
		
		input.setService("orderService");
		input.setMethod("queryByPhone");
		item.put("phone", "13101714488");
		IOrderService orderservice = (IOrderService) factory.getBean("orderService");
		orderservice.queryByPhone(input, output);
		LOGGER.info("**********************************调用ordercore服务"+output.getItem().toString());
		
	}
}
