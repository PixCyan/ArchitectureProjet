package servants;

import Jeux.IConnexionRemotePOA;
import Jeux.Joueur;
import serveurBDD.ServiceBDD;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Utilisateur on 13/06/2016.
 * Interface de connexion
 */
public class JeuxConnexionServiceImpl extends IConnexionRemotePOA {

    @Override
    public boolean seConnecter(String pseudo, String mdp) throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        //TODO ajouter à la liste des joueurs connectés.
        return service.verifierConnexion(pseudo, mdp);
    }

    @Override
    public boolean seDeconnecter(Joueur joueur) {
        //Euh je crois qu'on a pas besoin de ça mais à voir
        //peut etre juste pour retirer de la liste
        //TODO retirer de la liste des joueurs
        return false;
    }

    /**
     * Gestion de la connexion
     * @return ServiceBDD
     * @throws Exception
     */
    private static ServiceBDD connexionBDConnexionService() throws Exception{
        //Se connecte au serveurBDD
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 3000);
        ServiceBDD service;
        return service = (ServiceBDD) registry.lookup("ServiceBDD");
    }
}
