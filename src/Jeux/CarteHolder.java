package Jeux;

/**
* Jeux/CarteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 19 h 07 CEST
*/

public final class CarteHolder implements org.omg.CORBA.portable.Streamable
{
  public Jeux.Carte value = null;

  public CarteHolder ()
  {
  }

  public CarteHolder (Jeux.Carte initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Jeux.CarteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Jeux.CarteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Jeux.CarteHelper.type ();
  }

}
