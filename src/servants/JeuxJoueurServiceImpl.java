package servants;

import Jeux.IJoueurRemotePOA;
import Jeux.Joueur;

/**
 * Created by Utilisateur on 13/06/2016.
 */
public class JeuxJoueurServiceImpl extends IJoueurRemotePOA{

    @Override
    public Joueur creerUnCompte(String pseudo, String mdp) {
        return null;
    }

    @Override
    public Joueur[] voirClassementJoueur() {
        return new Joueur[0];
    }

    @Override
    public Joueur[] voirJoueursConnectes() {
        return new Joueur[0];
    }

    @Override
    public String voirLeScore(Joueur joueur) {
        return null;
    }
}
