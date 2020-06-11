package Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;


public class Demo {
	public static void main(String[] args) throws MalformedURLException,RemoteException {
		URL url = new URL("http://localhost:52630/HelloService.svc?wsdl");
//		QName qname = new QName("http://tempuri.org/", "HelloService");
//		
//		ServiceFactory factory = (ServiceFactory) ServiceFactory.newInstance();
//		
//		Service service = (Service) factory.createService(url, qname);
		//QName port = new QName("http://tempuri.org/", "BasicHttpBinding_IHelloService");
//		
//		QName method = new QName("http://tempuri.org/","array");
//		Call call = (Call) service.createCall(port, method);
//		QName q  = new QName("http://www.w3.org/2001/XMLSchema","anyType");
//		call.registerTypeMapping(Integer.class, q, BeanSerializerFactory.class, BeanDeserializerFactory.class);
//		call.setReturnType(XMLType.SOAP_ARRAY);
//		Object rs =  call.invoke(new Object[] {"Phuong"});
//		System.out.println(rs);
		QName wsdlServiceName = new QName("http://tempuri.org/","HelloService");
		RPCServiceClient serviceClient = new RPCServiceClient(null, url, wsdlServiceName, "BasicHttpBinding_IHelloService");
//	      Options options = serviceClient.getOptions();
//	      options.setTo(targetEPR);
//	      options.setAction("urn:echo");
//	      serviceClient.setOptions(options);
	      
	      QName qname1 = new QName("http://tempuri.org/", "array");
	      System.out.println(serviceClient.getTargetEPR());
	      
	      OMElement response1 = serviceClient.invokeBlocking(qname1,new Object[] {"Phuong"});
	      

		
	}
}
