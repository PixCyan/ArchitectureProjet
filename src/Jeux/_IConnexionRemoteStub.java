package Jeux;


/**
* Jeux/_IConnexionRemoteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 19 h 07 CEST
*/

public class _IConnexionRemoteStub extends org.omg.CORBA.portable.ObjectImpl implements Jeux.IConnexionRemote
{

  public String seConnecter (String pseudo, String mdp)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("seConnecter", true);
                $out.write_string (pseudo);
                $out.write_string (mdp);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return seConnecter (pseudo, mdp        );
            } finally {
                _releaseReply ($in);
            }
  } // seConnecter

  public String seDeconnecter (Jeux.Joueur joueur)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("seDeconnecter", true);
                Jeux.JoueurHelper.write ($out, joueur);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return seDeconnecter (joueur        );
            } finally {
                _releaseReply ($in);
            }
  } // seDeconnecter

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Jeux/IConnexionRemote:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _IConnexionRemoteStub
