package Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.ServiceFactory;

public class Demo {
	public static void main(String[] args) throws MalformedURLException, ServiceException, RemoteException {
		URL url = new URL("http://localhost:52630/HelloService.svc?wsdl");
		QName qname = new QName("http://tempuri.org/", "HelloService");
		
		ServiceFactory factory = (ServiceFactory) ServiceFactory.newInstance();
		
		Service service = (Service) factory.createService(url, qname);
		QName port = new QName("http://tempuri.org/", "BasicHttpBinding_IHelloService");
		QName method = new QName("http://tempuri.org/","sayHello");
		
		Call call = (Call) service.createCall(port, method);
		
		Object rs =  call.invoke(new Object[] {"Phuong"});
		System.out.println(rs);
		
	}
}
