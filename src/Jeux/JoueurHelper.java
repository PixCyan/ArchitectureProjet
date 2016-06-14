package Jeux;


/**
* Jeux/JoueurHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* mardi 14 juin 2016 17 h 48 CEST
*/

abstract public class JoueurHelper
{
  private static String  _id = "IDL:Jeux/Joueur:1.0";

  public static void insert (org.omg.CORBA.Any a, Jeux.Joueur that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Jeux.Joueur extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "pseudo",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "password",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "totalScore",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (Jeux.JoueurHelper.id (), "Joueur", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Jeux.Joueur read (org.omg.CORBA.portable.InputStream istream)
  {
    Jeux.Joueur value = new Jeux.Joueur ();
    value.id = istream.read_long ();
    value.pseudo = istream.read_string ();
    value.password = istream.read_string ();
    value.totalScore = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Jeux.Joueur value)
  {
    ostream.write_long (value.id);
    ostream.write_string (value.pseudo);
    ostream.write_string (value.password);
    ostream.write_string (value.totalScore);
  }

}
