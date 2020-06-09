/**
 * HelloServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class HelloServiceLocator extends org.apache.axis.client.Service implements org.tempuri.HelloService {

    public HelloServiceLocator() {
    }


    public HelloServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IHelloService
    private java.lang.String BasicHttpBinding_IHelloService_address = "http://localhost:52630/HelloService.svc";

    public java.lang.String getBasicHttpBinding_IHelloServiceAddress() {
        return BasicHttpBinding_IHelloService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IHelloServiceWSDDServiceName = "BasicHttpBinding_IHelloService";

    public java.lang.String getBasicHttpBinding_IHelloServiceWSDDServiceName() {
        return BasicHttpBinding_IHelloServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IHelloServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IHelloServiceWSDDServiceName = name;
    }

    public org.tempuri.IHelloService getBasicHttpBinding_IHelloService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IHelloService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IHelloService(endpoint);
    }

    public org.tempuri.IHelloService getBasicHttpBinding_IHelloService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IHelloServiceStub _stub = new org.tempuri.BasicHttpBinding_IHelloServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IHelloServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IHelloServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IHelloService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IHelloService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IHelloServiceStub _stub = new org.tempuri.BasicHttpBinding_IHelloServiceStub(new java.net.URL(BasicHttpBinding_IHelloService_address), this);
                _stub.setPortName(getBasicHttpBinding_IHelloServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IHelloService".equals(inputPortName)) {
            return getBasicHttpBinding_IHelloService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "HelloService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IHelloService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IHelloService".equals(portName)) {
            setBasicHttpBinding_IHelloServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
