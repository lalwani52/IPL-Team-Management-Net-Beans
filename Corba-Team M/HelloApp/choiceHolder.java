package HelloApp;


/**
* HelloApp/choiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hello.idl
* Sunday, 4 February, 2018 2:20:36 AM IST
*/

public final class choiceHolder implements org.omg.CORBA.portable.Streamable
{
  public double value[] = null;

  public choiceHolder ()
  {
  }

  public choiceHolder (double[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HelloApp.choiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HelloApp.choiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HelloApp.choiceHelper.type ();
  }

}