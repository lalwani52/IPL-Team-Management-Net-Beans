package HelloApp;


/**
* HelloApp/playerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hello.idl
* Sunday, 4 February, 2018 2:20:36 AM IST
*/

public final class playerHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public playerHolder ()
  {
  }

  public playerHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HelloApp.playerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HelloApp.playerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HelloApp.playerHelper.type ();
  }

}
