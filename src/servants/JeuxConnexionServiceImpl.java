package servants;

import Jeux.IConnexionRemotePOA;

/**
 * Created by Utilisateur on 13/06/2016.
 */
public class JeuxConnexionServiceImpl extends IConnexionRemotePOA {

    @Override
    public boolean seConnecter() {
        return false;
    }

    @Override
    public boolean seDeconnecter() {
        return false;
    }
}
