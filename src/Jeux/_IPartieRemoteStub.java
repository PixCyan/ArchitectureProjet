package Jeux;


/**
* Jeux/_IPartieRemoteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* samedi 18 juin 2016 17 h 40 CEST
*/

public class _IPartieRemoteStub extends org.omg.CORBA.portable.ObjectImpl implements Jeux.IPartieRemote
{

  public Jeux.Partie[] partiesEnAttente ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("partiesEnAttente", true);
                $in = _invoke ($out);
                Jeux.Partie $result[] = Jeux.listePartiesEnAttenteHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return partiesEnAttente (        );
            } finally {
                _releaseReply ($in);
            }
  } // partiesEnAttente

  public Jeux.Partie creerPartie (int nbJoueurs)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("creerPartie", true);
                $out.write_long (nbJoueurs);
                $in = _invoke ($out);
                Jeux.Partie $result = Jeux.PartieHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return creerPartie (nbJoueurs        );
            } finally {
                _releaseReply ($in);
            }
  } // creerPartie

  public Jeux.Joueur[] voirJoueursEnPartie (Jeux.Partie partie)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("voirJoueursEnPartie", true);
                Jeux.PartieHelper.write ($out, partie);
                $in = _invoke ($out);
                Jeux.Joueur $result[] = Jeux.listeJoueursHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return voirJoueursEnPartie (partie        );
            } finally {
                _releaseReply ($in);
            }
  } // voirJoueursEnPartie

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Jeux/IPartieRemote:1.0"};

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
} // class _IPartieRemoteStub
