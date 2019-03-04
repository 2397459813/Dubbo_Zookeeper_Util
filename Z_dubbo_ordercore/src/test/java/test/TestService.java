package test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.ordercore.service.order.IOrderService;


public class TestService {
	@Test
	public void testSpring() {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring/spring-all.xml");
		System.out.println("========================================"+factory);
		IOrderService orderservice = (IOrderService) factory.getBean("orderService");
		System.out.println("==========================="+orderservice);
		InputDTO input = new InputDTO();
		Map<String,Object> item = new HashMap<String,Object>();
		item.put("phone", "13101714488");
		input.setParams(item);
		OutputDTO output = new OutputDTO();
		orderservice.queryByPhone(input, output);
		System.out.println("**********************"+output.getItem().toString());
	}
}
