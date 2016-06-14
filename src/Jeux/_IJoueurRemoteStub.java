package Jeux;


/**
* Jeux/_IJoueurRemoteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* mardi 14 juin 2016 17 h 48 CEST
*/

public class _IJoueurRemoteStub extends org.omg.CORBA.portable.ObjectImpl implements Jeux.IJoueurRemote
{

  public Jeux.Joueur creerUnCompte (String pseudo, String mdp)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("creerUnCompte", true);
                $out.write_string (pseudo);
                $out.write_string (mdp);
                $in = _invoke ($out);
                Jeux.Joueur $result = Jeux.JoueurHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return creerUnCompte (pseudo, mdp        );
            } finally {
                _releaseReply ($in);
            }
  } // creerUnCompte

  public String voirLeScore (Jeux.Joueur joueur)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("voirLeScore", true);
                Jeux.JoueurHelper.write ($out, joueur);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return voirLeScore (joueur        );
            } finally {
                _releaseReply ($in);
            }
  } // voirLeScore

  public Jeux.Joueur[] voirClassementJoueur ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("voirClassementJoueur", true);
                $in = _invoke ($out);
                Jeux.Joueur $result[] = Jeux.listeClassementHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return voirClassementJoueur (        );
            } finally {
                _releaseReply ($in);
            }
  } // voirClassementJoueur

  public Jeux.Joueur[] voirJoueursConnectes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("voirJoueursConnectes", true);
                $in = _invoke ($out);
                Jeux.Joueur $result[] = Jeux.listeJoueursHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return voirJoueursConnectes (        );
            } finally {
                _releaseReply ($in);
            }
  } // voirJoueursConnectes

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Jeux/IJoueurRemote:1.0"};

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
} // class _IJoueurRemoteStub
