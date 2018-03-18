package HelloApp;


/**
* HelloApp/HelloPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hello.idl
* Sunday, 4 February, 2018 2:20:36 AM IST
*/

public abstract class HelloPOA extends org.omg.PortableServer.Servant
 implements HelloApp.HelloOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sign", new java.lang.Integer (0));
    _methods.put ("revoke", new java.lang.Integer (1));
    _methods.put ("playerDetails", new java.lang.Integer (2));
    _methods.put ("getAmt", new java.lang.Integer (3));
    _methods.put ("avail", new java.lang.Integer (4));
    _methods.put ("shutdown", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // HelloApp/Hello/sign
       {
         double choice = in.read_double ();
         String $result = null;
         $result = this.sign (choice);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // HelloApp/Hello/revoke
       {
         double cho = in.read_double ();
         String $result = null;
         $result = this.revoke (cho);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // HelloApp/Hello/playerDetails
       {
         String $result[] = null;
         $result = this.playerDetails ();
         out = $rh.createReply();
         HelloApp.playerHelper.write (out, $result);
         break;
       }

       case 3:  // HelloApp/Hello/getAmt
       {
         double $result[] = null;
         $result = this.getAmt ();
         out = $rh.createReply();
         HelloApp.amountHelper.write (out, $result);
         break;
       }

       case 4:  // HelloApp/Hello/avail
       {
         String $result[] = null;
         $result = this.avail ();
         out = $rh.createReply();
         HelloApp.availablemlHelper.write (out, $result);
         break;
       }

       case 5:  // HelloApp/Hello/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:HelloApp/Hello:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Hello _this() 
  {
    return HelloHelper.narrow(
    super._this_object());
  }

  public Hello _this(org.omg.CORBA.ORB orb) 
  {
    return HelloHelper.narrow(
    super._this_object(orb));
  }


} // class HelloPOA
