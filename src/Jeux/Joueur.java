package Jeux;


/**
* Jeux/Joueur.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 19 h 07 CEST
*/

public final class Joueur implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String pseudo = null;
  public String password = null;
  public String totalScore = null;

  public Joueur ()
  {
  } // ctor

  public Joueur (int _id, String _pseudo, String _password, String _totalScore)
  {
    id = _id;
    pseudo = _pseudo;
    password = _password;
    totalScore = _totalScore;
  } // ctor

} // class Joueur
