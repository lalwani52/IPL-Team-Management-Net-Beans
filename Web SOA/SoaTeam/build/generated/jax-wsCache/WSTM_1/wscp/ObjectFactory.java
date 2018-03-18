
package wscp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wscp package. 
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

    private final static QName _Avail_QNAME = new QName("http://WSTMp/", "avail");
    private final static QName _AvailResponse_QNAME = new QName("http://WSTMp/", "availResponse");
    private final static QName _GetAmt_QNAME = new QName("http://WSTMp/", "getAmt");
    private final static QName _GetAmtResponse_QNAME = new QName("http://WSTMp/", "getAmtResponse");
    private final static QName _Hello_QNAME = new QName("http://WSTMp/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://WSTMp/", "helloResponse");
    private final static QName _PlayerDetails_QNAME = new QName("http://WSTMp/", "playerDetails");
    private final static QName _PlayerDetailsResponse_QNAME = new QName("http://WSTMp/", "playerDetailsResponse");
    private final static QName _Revoke_QNAME = new QName("http://WSTMp/", "revoke");
    private final static QName _RevokeResponse_QNAME = new QName("http://WSTMp/", "revokeResponse");
    private final static QName _Sign_QNAME = new QName("http://WSTMp/", "sign");
    private final static QName _SignResponse_QNAME = new QName("http://WSTMp/", "signResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wscp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Avail }
     * 
     */
    public Avail createAvail() {
        return new Avail();
    }

    /**
     * Create an instance of {@link AvailResponse }
     * 
     */
    public AvailResponse createAvailResponse() {
        return new AvailResponse();
    }

    /**
     * Create an instance of {@link GetAmt }
     * 
     */
    public GetAmt createGetAmt() {
        return new GetAmt();
    }

    /**
     * Create an instance of {@link GetAmtResponse }
     * 
     */
    public GetAmtResponse createGetAmtResponse() {
        return new GetAmtResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link PlayerDetails }
     * 
     */
    public PlayerDetails createPlayerDetails() {
        return new PlayerDetails();
    }

    /**
     * Create an instance of {@link PlayerDetailsResponse }
     * 
     */
    public PlayerDetailsResponse createPlayerDetailsResponse() {
        return new PlayerDetailsResponse();
    }

    /**
     * Create an instance of {@link Revoke }
     * 
     */
    public Revoke createRevoke() {
        return new Revoke();
    }

    /**
     * Create an instance of {@link RevokeResponse }
     * 
     */
    public RevokeResponse createRevokeResponse() {
        return new RevokeResponse();
    }

    /**
     * Create an instance of {@link Sign }
     * 
     */
    public Sign createSign() {
        return new Sign();
    }

    /**
     * Create an instance of {@link SignResponse }
     * 
     */
    public SignResponse createSignResponse() {
        return new SignResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "avail")
    public JAXBElement<Avail> createAvail(Avail value) {
        return new JAXBElement<Avail>(_Avail_QNAME, Avail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "availResponse")
    public JAXBElement<AvailResponse> createAvailResponse(AvailResponse value) {
        return new JAXBElement<AvailResponse>(_AvailResponse_QNAME, AvailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAmt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "getAmt")
    public JAXBElement<GetAmt> createGetAmt(GetAmt value) {
        return new JAXBElement<GetAmt>(_GetAmt_QNAME, GetAmt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAmtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "getAmtResponse")
    public JAXBElement<GetAmtResponse> createGetAmtResponse(GetAmtResponse value) {
        return new JAXBElement<GetAmtResponse>(_GetAmtResponse_QNAME, GetAmtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "playerDetails")
    public JAXBElement<PlayerDetails> createPlayerDetails(PlayerDetails value) {
        return new JAXBElement<PlayerDetails>(_PlayerDetails_QNAME, PlayerDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "playerDetailsResponse")
    public JAXBElement<PlayerDetailsResponse> createPlayerDetailsResponse(PlayerDetailsResponse value) {
        return new JAXBElement<PlayerDetailsResponse>(_PlayerDetailsResponse_QNAME, PlayerDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revoke }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "revoke")
    public JAXBElement<Revoke> createRevoke(Revoke value) {
        return new JAXBElement<Revoke>(_Revoke_QNAME, Revoke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "revokeResponse")
    public JAXBElement<RevokeResponse> createRevokeResponse(RevokeResponse value) {
        return new JAXBElement<RevokeResponse>(_RevokeResponse_QNAME, RevokeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "sign")
    public JAXBElement<Sign> createSign(Sign value) {
        return new JAXBElement<Sign>(_Sign_QNAME, Sign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTMp/", name = "signResponse")
    public JAXBElement<SignResponse> createSignResponse(SignResponse value) {
        return new JAXBElement<SignResponse>(_SignResponse_QNAME, SignResponse.class, null, value);
    }

}
