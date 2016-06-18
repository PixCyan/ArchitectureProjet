package servants;

import Jeux.IJoueurRemotePOA;
import Jeux.Joueur;
import serveurBDD.ServiceBDD;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

/**
 * Created by Utilisateur on 13/06/2016.
 */
public class JeuxJoueurServiceImpl extends IJoueurRemotePOA{

    @Override
    public void creerUnCompte(String pseudo, String mdp) throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        //TODO ajouter à la liste des joueurs connectés.
        boolean joueurExiste = service.joueurExiste(pseudo, mdp);
        if (joueurExiste) {
            service.ajouterJoueur(pseudo, mdp);
        } else {
            //TODO renvoyer un message
        }
    }

    @Override
    public void voirClassementJoueur() throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        ArrayList<String> joueurs = service.classement();
        System.out.println("/--------------------- Classement ---------------------/");
        joueurs.forEach(System.out::println);

    }

    @Override
    public Joueur[] voirJoueursConnectes() {
        return new Joueur[0];
    }

    @Override
    public String voirLeScore(Joueur joueur) {
        return null;
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
