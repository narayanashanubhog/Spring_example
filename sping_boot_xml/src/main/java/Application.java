import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanubhogh.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service= appContext.getBean("customerSevice", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
