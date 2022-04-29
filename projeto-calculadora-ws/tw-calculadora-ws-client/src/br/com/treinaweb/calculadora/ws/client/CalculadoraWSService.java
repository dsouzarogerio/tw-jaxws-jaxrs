package br.com.treinaweb.calculadora.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-04-27T19:05:41.782-03:00
 * Generated source version: 3.5.2
 *
 */
@WebServiceClient(name = "CalculadoraWSService",
                  wsdlLocation = "file:/D:/workspace/tw-jaxws-jaxrs/projeto-calculadora/tw-calculadora-ws/WebContent/wsdl/calculadoraws.wsdl",
                  targetNamespace = "http://ws.calculadora.treinaweb.com.br/")
public class CalculadoraWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.calculadora.treinaweb.com.br/", "CalculadoraWSService");
    public final static QName CalculadoraWSPort = new QName("http://ws.calculadora.treinaweb.com.br/", "CalculadoraWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/workspace/tw-jaxws-jaxrs/projeto-calculadora/tw-calculadora-ws/WebContent/wsdl/calculadoraws.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculadoraWSService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/workspace/tw-jaxws-jaxrs/projeto-calculadora/tw-calculadora-ws/WebContent/wsdl/calculadoraws.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculadoraWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculadoraWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculadoraWSService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CalculadoraWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CalculadoraWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CalculadoraWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CalculadoraWSEndpoint
     */
    @WebEndpoint(name = "CalculadoraWSPort")
    public CalculadoraWSEndpoint getCalculadoraWSPort() {
        return super.getPort(CalculadoraWSPort, CalculadoraWSEndpoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculadoraWSEndpoint
     */
    @WebEndpoint(name = "CalculadoraWSPort")
    public CalculadoraWSEndpoint getCalculadoraWSPort(WebServiceFeature... features) {
        return super.getPort(CalculadoraWSPort, CalculadoraWSEndpoint.class, features);
    }

}
