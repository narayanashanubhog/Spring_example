import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanubhogh.service.CustomerService;
import com.shanubhogh.service.CustomerServiceImp;

public class Application {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service= appContext.getBean("customerSevice", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
////		
//		CustomerService service= new CustomerServiceImp();
//		
//		System.out.println(service.findAll().get(0).getFirstName());

	}

}
