package servants;

import Jeux.IPartieRemote;
import Jeux.IPartieRemotePOA;
import Jeux.Joueur;
import Jeux.Partie;

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
        return null;
    }

    @Override
    public Joueur[] voirJoueursEnPartie(Partie partie) {
        return new Joueur[0];
    }
}
