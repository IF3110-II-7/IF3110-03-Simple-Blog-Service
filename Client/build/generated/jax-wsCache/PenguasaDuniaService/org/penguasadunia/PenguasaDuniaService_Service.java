
package org.penguasadunia;

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
@WebServiceClient(name = "PenguasaDuniaService", targetNamespace = "http://PenguasaDunia.org/", wsdlLocation = "http://radiant-brushlands-4818.herokuapp.com/PenguasaDuniaService?wsdl")
public class PenguasaDuniaService_Service
    extends Service
{

    private final static URL PENGUASADUNIASERVICE_WSDL_LOCATION;
    private final static WebServiceException PENGUASADUNIASERVICE_EXCEPTION;
    private final static QName PENGUASADUNIASERVICE_QNAME = new QName("http://PenguasaDunia.org/", "PenguasaDuniaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://radiant-brushlands-4818.herokuapp.com/PenguasaDuniaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PENGUASADUNIASERVICE_WSDL_LOCATION = url;
        PENGUASADUNIASERVICE_EXCEPTION = e;
    }

    public PenguasaDuniaService_Service() {
        super(__getWsdlLocation(), PENGUASADUNIASERVICE_QNAME);
    }

    public PenguasaDuniaService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PENGUASADUNIASERVICE_QNAME, features);
    }

    public PenguasaDuniaService_Service(URL wsdlLocation) {
        super(wsdlLocation, PENGUASADUNIASERVICE_QNAME);
    }

    public PenguasaDuniaService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PENGUASADUNIASERVICE_QNAME, features);
    }

    public PenguasaDuniaService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PenguasaDuniaService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PenguasaDuniaService
     */
    @WebEndpoint(name = "PenguasaDuniaServicePort")
    public PenguasaDuniaService getPenguasaDuniaServicePort() {
        return super.getPort(new QName("http://PenguasaDunia.org/", "PenguasaDuniaServicePort"), PenguasaDuniaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PenguasaDuniaService
     */
    @WebEndpoint(name = "PenguasaDuniaServicePort")
    public PenguasaDuniaService getPenguasaDuniaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://PenguasaDunia.org/", "PenguasaDuniaServicePort"), PenguasaDuniaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PENGUASADUNIASERVICE_EXCEPTION!= null) {
            throw PENGUASADUNIASERVICE_EXCEPTION;
        }
        return PENGUASADUNIASERVICE_WSDL_LOCATION;
    }

}
