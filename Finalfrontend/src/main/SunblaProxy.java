package main;

public class SunblaProxy implements main.Sunbla {
  private String _endpoint = null;
  private main.Sunbla sunbla = null;
  
  public SunblaProxy() {
    _initSunblaProxy();
  }
  
  public SunblaProxy(String endpoint) {
    _endpoint = endpoint;
    _initSunblaProxy();
  }
  
  private void _initSunblaProxy() {
    try {
      sunbla = (new main.SunblaServiceLocator()).getSunbla();
      if (sunbla != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sunbla)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sunbla)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sunbla != null)
      ((javax.xml.rpc.Stub)sunbla)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Sunbla getSunbla() {
    if (sunbla == null)
      _initSunblaProxy();
    return sunbla;
  }
  
  public java.lang.String getProductInformation(int receiptID) throws java.rmi.RemoteException{
    if (sunbla == null)
      _initSunblaProxy();
    return sunbla.getProductInformation(receiptID);
  }
  
  
}