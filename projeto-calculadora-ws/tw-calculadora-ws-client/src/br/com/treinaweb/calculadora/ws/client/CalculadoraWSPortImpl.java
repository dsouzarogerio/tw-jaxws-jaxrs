
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package br.com.treinaweb.calculadora.ws.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-04-27T19:05:41.593-03:00
 * Generated source version: 3.5.2
 *
 */

@javax.jws.WebService(
                      serviceName = "CalculadoraWSService",
                      portName = "CalculadoraWSPort",
                      targetNamespace = "http://ws.calculadora.treinaweb.com.br/",
                      wsdlLocation = "file:/D:/workspace/tw-jaxws-jaxrs/projeto-calculadora/tw-calculadora-ws/WebContent/wsdl/calculadoraws.wsdl",
                      endpointInterface = "br.com.treinaweb.calculadora.ws.client.CalculadoraWSEndpoint")

public class CalculadoraWSPortImpl implements CalculadoraWSEndpoint {

    private static final Logger LOG = Logger.getLogger(CalculadoraWSPortImpl.class.getName());

    /* (non-Javadoc)
     * @see br.com.treinaweb.calculadora.ws.client.CalculadoraWSEndpoint#somar(int arg0, int arg1)*
     */
    public int somar(int arg0, int arg1) {
        LOG.info("Executing operation somar");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = -1090616241;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
