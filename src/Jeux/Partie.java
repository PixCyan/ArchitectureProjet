package Jeux;


/**
* Jeux/Partie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 17 h 40 CEST
*/

public final class Partie implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public int nbJoueurs = (int)0;
  public int nbCarte = (int)0;
  public Jeux.Joueur joueurs[] = null;

  public Partie ()
  {
  } // ctor

  public Partie (int _id, int _nbJoueurs, int _nbCarte, Jeux.Joueur[] _joueurs)
  {
    id = _id;
    nbJoueurs = _nbJoueurs;
    nbCarte = _nbCarte;
    joueurs = _joueurs;
  } // ctor

} // class Partie
