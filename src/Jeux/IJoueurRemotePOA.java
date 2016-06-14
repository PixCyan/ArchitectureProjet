package Jeux;


/**
* Jeux/IJoueurRemotePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* lundi 13 juin 2016 18 h 17 CEST
*/

public abstract class IJoueurRemotePOA extends org.omg.PortableServer.Servant
 implements Jeux.IJoueurRemoteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("creerUnCompte", new java.lang.Integer (0));
    _methods.put ("voirLeScore", new java.lang.Integer (1));
    _methods.put ("voirClassementJoueur", new java.lang.Integer (2));
    _methods.put ("voirJoueursConnectes", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Jeux/IJoueurRemote/creerUnCompte
       {
         Jeux.Joueur $result = null;
         $result = this.creerUnCompte ();
         out = $rh.createReply();
         Jeux.JoueurHelper.write (out, $result);
         break;
       }

       case 1:  // Jeux/IJoueurRemote/voirLeScore
       {
         Jeux.Joueur joueur = Jeux.JoueurHelper.read (in);
         String $result = null;
         $result = this.voirLeScore (joueur);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // Jeux/IJoueurRemote/voirClassementJoueur
       {
         Jeux.Joueur $result[] = null;
         $result = this.voirClassementJoueur ();
         out = $rh.createReply();
         Jeux.listeClassementHelper.write (out, $result);
         break;
       }

       case 3:  // Jeux/IJoueurRemote/voirJoueursConnectes
       {
         Jeux.Joueur $result[] = null;
         $result = this.voirJoueursConnectes ();
         out = $rh.createReply();
         Jeux.listeJoueursHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Jeux/IJoueurRemote:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IJoueurRemote _this() 
  {
    return IJoueurRemoteHelper.narrow(
    super._this_object());
  }

  public IJoueurRemote _this(org.omg.CORBA.ORB orb) 
  {
    return IJoueurRemoteHelper.narrow(
    super._this_object(orb));
  }


} // class IJoueurRemotePOA
