package example;

import alyasko.GuidGeneratorServiceLocator;
import alyasko.IGuidGeneratorService;
import com.sun.corba.se.spi.activation.Activator;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          GuidGeneratorServiceLocator locator = new GuidGeneratorServiceLocator();
          IGuidGeneratorService service = locator.getBasicHttpBinding_IGuidGeneratorService();
          // If authorization is required
          //((BasicHttpBinding_IGuidGeneratorServiceStub)service).setUsername("user3");
          //((BasicHttpBinding_IGuidGeneratorServiceStub)service).setPassword("pass3");
          // invoke business method
          String guid = service.generate();
          System.out.println("Generating GUID using remote SOAP service...");
          System.out.println("Generated GUID:");
          System.out.println(guid);
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
