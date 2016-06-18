package servants;

import Jeux.IPartieRemote;
import Jeux.IPartieRemotePOA;
import Jeux.Joueur;
import Jeux.Partie;
import serveurBDD.ServiceBDD;

import java.lang.reflect.Array;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

/**
 * Created by Utilisateur on 13/06/2016.
 */
public class JeuxPartieServiceImpl extends IPartieRemotePOA {


    @Override
    public Partie[] partiesEnAttente() {
        return new Partie[0];
    }

    @Override
    public Partie creerPartie(int nbJoueurs) {
        Joueur joueurs[] = {};
        Partie partie = new Partie(++nbPartie, nbJoueurs, 32,joueurs);
        //Ajout du joueur qui créé la partie à la liste des joueurs
        //partie.joueurs[] = joueur;
        //partiesEnAttente[partiesEnAttente.length+1] = partie;
        System.out.println("Test");
        return partie;
    }

    @Override
    public Joueur[] voirJoueursEnPartie(Partie partie) {
        for(Joueur j: joueursEnLigne) {

        }


        return new Joueur[0];
    }

}
