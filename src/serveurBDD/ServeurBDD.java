package serveurBDD;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by PixCyan on 18/06/2016.
 * Serveur RMI : gestion de la BDD
 */
public class ServeurBDD  implements ServiceBDD  {
    private static final ModeleDonnees md = new ModeleDonnees();


    public static void main(String [] args) throws Exception {
        //TODO main serveur

        ServeurBDD service = new ServeurBDD();
        ServiceBDD stub;
        stub = (ServiceBDD) UnicastRemoteObject.exportObject(service,0);
        Registry registry = LocateRegistry.createRegistry(3000);
        registry.rebind("ServiceBDD", stub);
        boolean continuer = true;
        while(continuer) {

        }
    }

    @Override
    public boolean joueurExiste(String pseudo, String mdp) throws RemoteException, SQLException {
        return md.joueurExiste(pseudo);
    }

    @Override
    public void ajouterJoueur(String pseudo, String mdp) throws RemoteException, SQLException {
        md.ajouterJoueur(pseudo, mdp);
    }

    @Override
    public ArrayList<String> classement() throws RemoteException, SQLException {
        md.classement();
        return null;
    }

    @Override
    public void ajouterPoint(int nbPoint, String pseudo) throws RemoteException, SQLException {
        md.ajouterPoint(nbPoint, pseudo);
    }

    @Override
    public int scoreJoueur(String pseudo) throws RemoteException, SQLException {
        return md.scoreJoueur(pseudo);
    }

    @Override
    public boolean verifierConnexion(String pseudo, String mdp) throws RemoteException, SQLException {
        return md.verifierConnexion(pseudo, mdp);
    }
}
