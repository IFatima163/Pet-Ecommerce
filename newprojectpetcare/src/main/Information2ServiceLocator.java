/**
 * Information2ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Information2ServiceLocator extends org.apache.axis.client.Service implements main.Information2Service {

    public Information2ServiceLocator() {
    }


    public Information2ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Information2ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Information2
    private java.lang.String Information2_address = "http://localhost:8080/Tutorial/services/Information2";

    public java.lang.String getInformation2Address() {
        return Information2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Information2WSDDServiceName = "Information2";

    public java.lang.String getInformation2WSDDServiceName() {
        return Information2WSDDServiceName;
    }

    public void setInformation2WSDDServiceName(java.lang.String name) {
        Information2WSDDServiceName = name;
    }

    public main.Information2 getInformation2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Information2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInformation2(endpoint);
    }

    public main.Information2 getInformation2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Information2SoapBindingStub _stub = new main.Information2SoapBindingStub(portAddress, this);
            _stub.setPortName(getInformation2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInformation2EndpointAddress(java.lang.String address) {
        Information2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Information2.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Information2SoapBindingStub _stub = new main.Information2SoapBindingStub(new java.net.URL(Information2_address), this);
                _stub.setPortName(getInformation2WSDDServiceName());
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
        if ("Information2".equals(inputPortName)) {
            return getInformation2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Information2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Information2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Information2".equals(portName)) {
            setInformation2EndpointAddress(address);
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
