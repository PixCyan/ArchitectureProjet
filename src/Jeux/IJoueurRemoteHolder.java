package Jeux;

/**
* Jeux/IJoueurRemoteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 17 h 40 CEST
*/

public final class IJoueurRemoteHolder implements org.omg.CORBA.portable.Streamable
{
  public Jeux.IJoueurRemote value = null;

  public IJoueurRemoteHolder ()
  {
  }

  public IJoueurRemoteHolder (Jeux.IJoueurRemote initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Jeux.IJoueurRemoteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Jeux.IJoueurRemoteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Jeux.IJoueurRemoteHelper.type ();
  }

}
