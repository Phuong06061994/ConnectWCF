package org.tempuri;

public class IHelloServiceProxy implements org.tempuri.IHelloService {
  private String _endpoint = null;
  private org.tempuri.IHelloService iHelloService = null;
  
  public IHelloServiceProxy() {
    _initIHelloServiceProxy();
  }
  
  public IHelloServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIHelloServiceProxy();
  }
  
  private void _initIHelloServiceProxy() {
    try {
      iHelloService = (new org.tempuri.HelloServiceLocator()).getBasicHttpBinding_IHelloService();
      if (iHelloService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iHelloService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iHelloService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iHelloService != null)
      ((javax.xml.rpc.Stub)iHelloService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IHelloService getIHelloService() {
    if (iHelloService == null)
      _initIHelloServiceProxy();
    return iHelloService;
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (iHelloService == null)
      _initIHelloServiceProxy();
    return iHelloService.sayHello(name);
  }
  
  
}