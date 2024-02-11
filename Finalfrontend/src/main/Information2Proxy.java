package main;

public class Information2Proxy implements main.Information2 {
  private String _endpoint = null;
  private main.Information2 information2 = null;
  
  public Information2Proxy() {
    _initInformation2Proxy();
  }
  
  public Information2Proxy(String endpoint) {
    _endpoint = endpoint;
    _initInformation2Proxy();
  }
  
  private void _initInformation2Proxy() {
    try {
      information2 = (new main.Information2ServiceLocator()).getInformation2();
      if (information2 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)information2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)information2)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (information2 != null)
      ((javax.xml.rpc.Stub)information2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Information2 getInformation2() {
    if (information2 == null)
      _initInformation2Proxy();
    return information2;
  }
  
  public java.lang.String sellerInformation(int sellerID) throws java.rmi.RemoteException{
    if (information2 == null)
      _initInformation2Proxy();
    return information2.sellerInformation(sellerID);
  }
  
  
}