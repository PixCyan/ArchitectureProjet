import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import servants.JeuxConnexionServiceImpl;
import servants.JeuxJoueurServiceImpl;
import servants.JeuxPartieServiceImpl;

import javax.naming.InitialContext;

/**
 * Created by Utilisateur on 14/06/2016.
 */
public class ServeurCorba  {

    public static void main(String[] args){


        try {
            ORB orb = ORB.init(args, null);
            POA rootPOA= POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            JeuxJoueurServiceImpl jjsi= new JeuxJoueurServiceImpl();
            JeuxConnexionServiceImpl jcsi = new JeuxConnexionServiceImpl();
            JeuxPartieServiceImpl jpsi = new JeuxPartieServiceImpl();

            InitialContext ctx = new InitialContext();
            ctx.rebind("JEUXJOUEUR",rootPOA.servant_to_reference(jjsi));
            ctx.rebind("JEUXCONNEXION",rootPOA.servant_to_reference(jcsi));
            ctx.rebind("JEUXPARTIE",rootPOA.servant_to_reference(jpsi));

            orb.run();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
