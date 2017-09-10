import com.shanubhogh.service.CustomerService;
import com.shanubhogh.service.CustomerServiceImp;

public class Application {

	public static void main(String[] args) {
		
		CustomerService service= new CustomerServiceImp();
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
