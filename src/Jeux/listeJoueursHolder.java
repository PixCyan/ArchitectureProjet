package Jeux;


/**
* Jeux/listeJoueursHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 19 h 07 CEST
*/

public final class listeJoueursHolder implements org.omg.CORBA.portable.Streamable
{
  public Jeux.Joueur value[] = null;

  public listeJoueursHolder ()
  {
  }

  public listeJoueursHolder (Jeux.Joueur[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Jeux.listeJoueursHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Jeux.listeJoueursHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Jeux.listeJoueursHelper.type ();
  }

}
