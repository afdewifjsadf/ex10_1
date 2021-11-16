
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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
public class ObjectFactory {

    private final static QName _CalCircumferenceResponse_QNAME = new QName("http://services/", "calCircumferenceResponse");
    private final static QName _CalCircleAreaResponse_QNAME = new QName("http://services/", "calCircleAreaResponse");
    private final static QName _CalCircleArea_QNAME = new QName("http://services/", "calCircleArea");
    private final static QName _CalCircumference_QNAME = new QName("http://services/", "calCircumference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalCircleArea }
     * 
     */
    public CalCircleArea createCalCircleArea() {
        return new CalCircleArea();
    }

    /**
     * Create an instance of {@link CalCircumference }
     * 
     */
    public CalCircumference createCalCircumference() {
        return new CalCircumference();
    }

    /**
     * Create an instance of {@link CalCircumferenceResponse }
     * 
     */
    public CalCircumferenceResponse createCalCircumferenceResponse() {
        return new CalCircumferenceResponse();
    }

    /**
     * Create an instance of {@link CalCircleAreaResponse }
     * 
     */
    public CalCircleAreaResponse createCalCircleAreaResponse() {
        return new CalCircleAreaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircumferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "calCircumferenceResponse")
    public JAXBElement<CalCircumferenceResponse> createCalCircumferenceResponse(CalCircumferenceResponse value) {
        return new JAXBElement<CalCircumferenceResponse>(_CalCircumferenceResponse_QNAME, CalCircumferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircleAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "calCircleAreaResponse")
    public JAXBElement<CalCircleAreaResponse> createCalCircleAreaResponse(CalCircleAreaResponse value) {
        return new JAXBElement<CalCircleAreaResponse>(_CalCircleAreaResponse_QNAME, CalCircleAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircleArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "calCircleArea")
    public JAXBElement<CalCircleArea> createCalCircleArea(CalCircleArea value) {
        return new JAXBElement<CalCircleArea>(_CalCircleArea_QNAME, CalCircleArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircumference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "calCircumference")
    public JAXBElement<CalCircumference> createCalCircumference(CalCircumference value) {
        return new JAXBElement<CalCircumference>(_CalCircumference_QNAME, CalCircumference.class, null, value);
    }

}
