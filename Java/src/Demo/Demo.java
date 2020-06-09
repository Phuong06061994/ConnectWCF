package Demo;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
	URL url = new URL("http://localhost:52630/HelloService.svc?wsdl");
	QName qname = new QName("http://tempuri.org/", "HelloService");
	Service service = Service.create(url,qname);
	
	
	}
	
	
}
