package Other;

import Jeux.Joueur;
import Jeux.Partie;

import java.util.ArrayList;

/**
 * Created by Utilisateur on 18/06/2016.
 * Gestion des différentes listes
 */
public class GestionListe {
    private static int nbPartie = 0;
    private static ArrayList<Joueur> joueursEnLigne = new ArrayList<>();
    private static ArrayList<Partie> partiesEnAttente = new ArrayList<>();


    public static int getNbPartie() {
        return nbPartie;
    }

    public static void setNbPartie(int nbPartie) {
        GestionListe.nbPartie = nbPartie;
    }

    public static ArrayList<Joueur> getJoueursEnLigne() {
        return joueursEnLigne;
    }

    public static void setJoueursEnLigne(ArrayList<Joueur> joueursEnLigne) {
        GestionListe.joueursEnLigne = joueursEnLigne;
    }

    public static ArrayList<Partie> getPartiesEnAttente() {
        return partiesEnAttente;
    }

    public static void setPartiesEnAttente(ArrayList<Partie> partiesEnAttente) {
        GestionListe.partiesEnAttente = partiesEnAttente;
    }
}
