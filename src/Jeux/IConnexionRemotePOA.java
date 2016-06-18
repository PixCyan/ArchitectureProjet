package Jeux;


/**
* Jeux/IConnexionRemotePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 17 h 40 CEST
*/

public abstract class IConnexionRemotePOA extends org.omg.PortableServer.Servant
 implements Jeux.IConnexionRemoteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("seConnecter", new java.lang.Integer (0));
    _methods.put ("seDeconnecter", new java.lang.Integer (1));
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
       case 0:  // Jeux/IConnexionRemote/seConnecter
       {
         String pseudo = in.read_string ();
         String mdp = in.read_string ();
         boolean $result = false;
         $result = this.seConnecter (pseudo, mdp);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Jeux/IConnexionRemote/seDeconnecter
       {
         Jeux.Joueur joueur = Jeux.JoueurHelper.read (in);
         boolean $result = false;
         $result = this.seDeconnecter (joueur);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Jeux/IConnexionRemote:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IConnexionRemote _this() 
  {
    return IConnexionRemoteHelper.narrow(
    super._this_object());
  }

  public IConnexionRemote _this(org.omg.CORBA.ORB orb) 
  {
    return IConnexionRemoteHelper.narrow(
    super._this_object(orb));
  }


} // class IConnexionRemotePOA
