package Jeux;


/**
* Jeux/listeClassementHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* lundi 13 juin 2016 18 h 17 CEST
*/

public final class listeClassementHolder implements org.omg.CORBA.portable.Streamable
{
  public Jeux.Joueur value[] = null;

  public listeClassementHolder ()
  {
  }

  public listeClassementHolder (Jeux.Joueur[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Jeux.listeClassementHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Jeux.listeClassementHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Jeux.listeClassementHelper.type ();
  }

}
