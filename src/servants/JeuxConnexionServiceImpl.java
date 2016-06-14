package servants;

import Jeux.IConnexionRemotePOA;
import Jeux.Joueur;

/**
 * Created by Utilisateur on 13/06/2016.
 */
public class JeuxConnexionServiceImpl extends IConnexionRemotePOA {

    @Override
    public boolean seConnecter(String pseudo, String mdp) {
        return false;
    }

    @Override
    public boolean seDeconnecter(Joueur joueur) {
        return false;
    }
}
