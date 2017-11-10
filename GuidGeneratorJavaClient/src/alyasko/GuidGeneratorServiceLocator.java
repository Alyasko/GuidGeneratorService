/**
 * GuidGeneratorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package alyasko;

public class GuidGeneratorServiceLocator extends org.apache.axis.client.Service implements alyasko.GuidGeneratorService {

    public GuidGeneratorServiceLocator() {
    }


    public GuidGeneratorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GuidGeneratorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IGuidGeneratorService
    private java.lang.String BasicHttpBinding_IGuidGeneratorService_address = "http://guid-generator.azurewebsites.net/GuidGeneratorService.svc";

    public java.lang.String getBasicHttpBinding_IGuidGeneratorServiceAddress() {
        return BasicHttpBinding_IGuidGeneratorService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IGuidGeneratorServiceWSDDServiceName = "BasicHttpBinding_IGuidGeneratorService";

    public java.lang.String getBasicHttpBinding_IGuidGeneratorServiceWSDDServiceName() {
        return BasicHttpBinding_IGuidGeneratorServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IGuidGeneratorServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IGuidGeneratorServiceWSDDServiceName = name;
    }

    public alyasko.IGuidGeneratorService getBasicHttpBinding_IGuidGeneratorService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IGuidGeneratorService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IGuidGeneratorService(endpoint);
    }

    public alyasko.IGuidGeneratorService getBasicHttpBinding_IGuidGeneratorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            alyasko.BasicHttpBinding_IGuidGeneratorServiceStub _stub = new alyasko.BasicHttpBinding_IGuidGeneratorServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IGuidGeneratorServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IGuidGeneratorServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IGuidGeneratorService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (alyasko.IGuidGeneratorService.class.isAssignableFrom(serviceEndpointInterface)) {
                alyasko.BasicHttpBinding_IGuidGeneratorServiceStub _stub = new alyasko.BasicHttpBinding_IGuidGeneratorServiceStub(new java.net.URL(BasicHttpBinding_IGuidGeneratorService_address), this);
                _stub.setPortName(getBasicHttpBinding_IGuidGeneratorServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IGuidGeneratorService".equals(inputPortName)) {
            return getBasicHttpBinding_IGuidGeneratorService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "GuidGeneratorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IGuidGeneratorService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IGuidGeneratorService".equals(portName)) {
            setBasicHttpBinding_IGuidGeneratorServiceEndpointAddress(address);
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
