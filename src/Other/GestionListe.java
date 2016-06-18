package Other;

import Jeux.Joueur;
import Jeux.Partie;

/**
 * Created by Utilisateur on 18/06/2016.
 */
public class GestionListe {

    private static int nbPartie = 0;
    private static Joueur joueursEnLigne[] = {};
    private static Partie partiesEnAttente[] = {};

    public static int getNbPartie() {
        return nbPartie;
    }

    public static void setNbPartie(int nbPartie) {
        GestionListe.nbPartie = nbPartie;
    }

    public static Joueur[] getJoueursEnLigne() {
        return joueursEnLigne;
    }

    public static void setJoueursEnLigne(Joueur[] joueursEnLigne) {
        GestionListe.joueursEnLigne = joueursEnLigne;
    }

    public static Partie[] getPartiesEnAttente() {
        return partiesEnAttente;
    }

    public static void setPartiesEnAttente(Partie[] partiesEnAttente) {
        GestionListe.partiesEnAttente = partiesEnAttente;
    }
}
