package servants;

import Jeux.IPartieRemote;
import Jeux.IPartieRemotePOA;
import Jeux.Joueur;
import Jeux.Partie;
import Other.GestionListe;
import serveurBDD.ServiceBDD;

import java.lang.reflect.Array;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

/**
 * Created by Utilisateur on 13/06/2016.
 * Gestion des parties
 */
public class JeuxPartieServiceImpl extends IPartieRemotePOA {

    @Override
    public String partiesEnAttente() {
        return "";
    }

    @Override
    public String creerPartie(int nbJoueurs) {
        Joueur joueurs[] = {};
        int nbPartie = GestionListe.getNbPartie();
        Partie partie = new Partie(++nbPartie, nbJoueurs, 32,joueurs);
        //Ajout du joueur qui créé la partie à la liste des joueurs
        //partie.joueurs[] = joueur;
        //partiesEnAttente[partiesEnAttente.length+1] = partie;
        System.out.println("Test");
        return "";
    }

    @Override
    public String voirJoueursEnPartie(Partie partie) {

        return "";
    }

    @Override
    public String vuePartie() {
        return null;
    }

}
