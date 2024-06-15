
package xx.mx.uv.consumo.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "comprasPortService", targetNamespace = "t4is.uv.mx/compras", wsdlLocation = "https://compras-production-300d.up.railway.app/ws/compras.wsdl")
public class ComprasPortService
    extends Service
{

    private final static URL COMPRASPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMPRASPORTSERVICE_EXCEPTION;
    private final static QName COMPRASPORTSERVICE_QNAME = new QName("t4is.uv.mx/compras", "comprasPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://compras-production-300d.up.railway.app/ws/compras.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPRASPORTSERVICE_WSDL_LOCATION = url;
        COMPRASPORTSERVICE_EXCEPTION = e;
    }

    public ComprasPortService() {
        super(__getWsdlLocation(), COMPRASPORTSERVICE_QNAME);
    }

    public ComprasPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPRASPORTSERVICE_QNAME, features);
    }

    public ComprasPortService(URL wsdlLocation) {
        super(wsdlLocation, COMPRASPORTSERVICE_QNAME);
    }

    public ComprasPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPRASPORTSERVICE_QNAME, features);
    }

    public ComprasPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComprasPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ComprasPort
     */
    @WebEndpoint(name = "comprasPortSoap11")
    public ComprasPort getComprasPortSoap11() {
        return super.getPort(new QName("t4is.uv.mx/compras", "comprasPortSoap11"), ComprasPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComprasPort
     */
    @WebEndpoint(name = "comprasPortSoap11")
    public ComprasPort getComprasPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("t4is.uv.mx/compras", "comprasPortSoap11"), ComprasPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPRASPORTSERVICE_EXCEPTION!= null) {
            throw COMPRASPORTSERVICE_EXCEPTION;
        }
        return COMPRASPORTSERVICE_WSDL_LOCATION;
    }

}
