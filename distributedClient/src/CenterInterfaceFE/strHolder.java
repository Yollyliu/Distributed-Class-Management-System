package CenterInterfaceFE;


/**
* CenterInterfaceFE/strHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from InterfaceMTL.idl
* Tuesday, August 1, 2017 10:00:22 PM EDT
*/

public final class strHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public strHolder ()
  {
  }

  public strHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CenterInterfaceFE.strHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CenterInterfaceFE.strHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CenterInterfaceFE.strHelper.type ();
  }

}
