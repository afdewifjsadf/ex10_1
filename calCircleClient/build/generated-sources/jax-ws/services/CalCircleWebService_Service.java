
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "calCircleWebService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/calCircleSoap/calCircleWebService?WSDL")
public class CalCircleWebService_Service
    extends Service
{

    private final static URL CALCIRCLEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCIRCLEWEBSERVICE_EXCEPTION;
    private final static QName CALCIRCLEWEBSERVICE_QNAME = new QName("http://services/", "calCircleWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/calCircleSoap/calCircleWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCIRCLEWEBSERVICE_WSDL_LOCATION = url;
        CALCIRCLEWEBSERVICE_EXCEPTION = e;
    }

    public CalCircleWebService_Service() {
        super(__getWsdlLocation(), CALCIRCLEWEBSERVICE_QNAME);
    }

    public CalCircleWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCIRCLEWEBSERVICE_QNAME, features);
    }

    public CalCircleWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCIRCLEWEBSERVICE_QNAME);
    }

    public CalCircleWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCIRCLEWEBSERVICE_QNAME, features);
    }

    public CalCircleWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalCircleWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalCircleWebService
     */
    @WebEndpoint(name = "calCircleWebServicePort")
    public CalCircleWebService getCalCircleWebServicePort() {
        return super.getPort(new QName("http://services/", "calCircleWebServicePort"), CalCircleWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalCircleWebService
     */
    @WebEndpoint(name = "calCircleWebServicePort")
    public CalCircleWebService getCalCircleWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "calCircleWebServicePort"), CalCircleWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCIRCLEWEBSERVICE_EXCEPTION!= null) {
            throw CALCIRCLEWEBSERVICE_EXCEPTION;
        }
        return CALCIRCLEWEBSERVICE_WSDL_LOCATION;
    }

}