package Demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloService {
	@WebMethod
	 public String sayHello(String name);
}
