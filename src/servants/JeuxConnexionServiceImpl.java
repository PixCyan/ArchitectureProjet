package servants;

import Jeux.IConnexionRemotePOA;
import Jeux.Joueur;
import serveurBDD.ServiceBDD;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import static Other.GestionListe.getJoueursEnLigne;

/**
 * Created by Utilisateur on 13/06/2016.
 * Interface de connexion
 */
public class JeuxConnexionServiceImpl extends IConnexionRemotePOA {

    /**
     * Se connecte au jeu
     * @param pseudo
     * @param mdp
     * @return
     * @throws Exception
     */
    @Override
    public String seConnecter(String pseudo, String mdp) throws Exception {
        ServiceBDD service = connexionBDConnexionService();
        Boolean infoInvalide=true;
        Boolean quitter=false;
        while (infoInvalide && quitter==false) {
            if (service.verifierConnexion(pseudo, mdp)) {
                Joueur joueur = new Joueur();
                joueur.pseudo = pseudo;
                joueur.password = mdp;
                getJoueursEnLigne().add(joueur);
                infoInvalide=false;
            } else {
                System.out.println("Informations invalides\n");
                Scanner scan = new Scanner(System.in);
                System.out.println("\tPseudo : (ou exit pour annuler)");
                pseudo = scan.nextLine();
                if(!pseudo.equals("exit")) {
                    System.out.println("\tMot de passe : ");
                    mdp = scan.nextLine();
                }
                else {
                    quitter=true;
                }
            }
        }
        return "";
    }

    /**
     * Se deconnecte du jeu
     * @param joueur
     * @return
     */
    @Override
    public String seDeconnecter(Joueur joueur) {
        System.out.println("Bye Bye "+joueur.pseudo);
        getJoueursEnLigne().remove(joueur);
        return "";
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
