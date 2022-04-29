
package br.com.treinaweb.calculadora.ws;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.treinaweb.calculadora.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2022-04-27T18:52:44-03:00")
public class ObjectFactory {

    private final static QName _Somar_QNAME = new QName("http://ws.calculadora.treinaweb.com.br/", "somar");
    private final static QName _SomarResponse_QNAME = new QName("http://ws.calculadora.treinaweb.com.br/", "somarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.treinaweb.calculadora.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Somar }
     * 
     */
    public Somar createSomar() {
        return new Somar();
    }

    /**
     * Create an instance of {@link SomarResponse }
     * 
     */
    public SomarResponse createSomarResponse() {
        return new SomarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Somar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.calculadora.treinaweb.com.br/", name = "somar")
    public JAXBElement<Somar> createSomar(Somar value) {
        return new JAXBElement<Somar>(_Somar_QNAME, Somar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SomarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.calculadora.treinaweb.com.br/", name = "somarResponse")
    public JAXBElement<SomarResponse> createSomarResponse(SomarResponse value) {
        return new JAXBElement<SomarResponse>(_SomarResponse_QNAME, SomarResponse.class, null, value);
    }

}
