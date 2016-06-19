package servants;

import Jeux.IJoueurRemotePOA;
import Jeux.Joueur;
import Other.GestionListe;
import serveurBDD.ServiceBDD;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

import static Other.GestionListe.getJoueursEnLigne;

/**
 * Created by Utilisateur on 13/06/2016.
 */
public class JeuxJoueurServiceImpl extends IJoueurRemotePOA{

    @Override
    public String creerUnCompte(String pseudo, String mdp) throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        Boolean pseudoExiste=true;
        boolean joueurExiste;
        Boolean quitter=false;
        while (pseudoExiste && quitter==false) {
            joueurExiste = service.joueurExiste(pseudo, mdp);
            if (!joueurExiste) {
                Joueur joueur = new Joueur();
                joueur.pseudo = pseudo;
                joueur.password = mdp;
                service.ajouterJoueur(pseudo, mdp);
                getJoueursEnLigne().add(joueur);
                pseudoExiste=false;
            } else {
                System.out.println("Pseudo " + pseudo + " déjà existant, veuillez en choisir un autre\n");
                Scanner scan = new Scanner(System.in);
                System.out.println("\tEntrez votre pseudo : (exit pour annuler)");
                pseudo = scan.nextLine();
                if(!pseudo.equals("exit")) {
                    System.out.println("\tEntrez votre mot de passe : ");
                    mdp = scan.nextLine();
                }
                else{
                    quitter=true;
                }
            }
        }
        return "Bienvenu " + pseudo;
    }

    @Override
    public String voirClassementJoueur() throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        ArrayList<String> joueurs = service.classement();
        System.out.println("/--------------------- Classement ---------------------/");
        joueurs.forEach(System.out::println);
        return "";
    }

    @Override
    public String voirJoueursConnectes() {
        ArrayList<Joueur> joueur= GestionListe.getJoueursEnLigne();
        System.out.println("Liste des joueurs connectés : \n");
        for(Joueur joueurCo :  joueur){
            System.out.println(joueurCo.pseudo+"\n");
        }
        return "";
    }

    @Override
    public String voirLeScore(Joueur joueur)throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        Integer score=service.scoreJoueur(joueur.pseudo);
        System.out.println("Votre score : "+score);
        return "";
    }

    @Override
    public String vueJoueur() {
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
        return (ServiceBDD) registry.lookup("ServiceBDD");
    }
}
