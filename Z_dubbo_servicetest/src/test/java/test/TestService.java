package test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;
import com.liu.servicetest.service.user.IUserService;



public class TestService {
	@Test
	public void testSpring() {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring/spring-all.xml");
		IUserService userservice = (IUserService) factory.getBean("userService");
		InputDTO input = new InputDTO();
		Map<String,Object> item = new HashMap<String,Object>();
		item.put("mobile", "13101714387");
		input.setParams(item);
		OutputDTO output = new OutputDTO();
		userservice.queryForTest(input, output);
		System.out.println("**********************"+output.getData().toString());
	}
}
