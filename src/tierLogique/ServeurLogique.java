package tierLogique;


import java.rmi.RemoteException;
import joueurs.Joueur;
import joueurs.JoueurInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by raffennn on 11/06/2016.
 * Serveur : gestion présentation
 */
public class ServeurLogique implements ServiceLogique {
    private ArrayList<Joueur> joueursConnecte = new ArrayList<>();


    public static void main(String [] args) throws Exception {
        //TODO main serveur
        System.out.println("MERDE");
    }

    @Override
    public void seConnecter() throws RemoteException {
        String pseudo = "";
        String mdp = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Donnez votre pseudo : ");
        boolean continuer = true;
        while(continuer) {
            String entree = scan.nextLine();
            if(!entree.equals("")) {
                pseudo = entree;
                continuer = false;
            }
        }
        System.out.println("Donnez votre mot de passe : ");
        continuer = true;
        while(continuer) {
            String entree = scan.nextLine();
            if(!entree.equals("")) {
                mdp = entree;
                continuer = false;
            }
        }
        //TODO appeler la BDD pour vérifier existance utilisateur.
    }

    @Override
    public void creerUnCompte() throws RemoteException {
        String pseudo = "";
        String mdp = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Donnez votre pseudo : ");
        boolean continuer = true;
        while(continuer) {
            String entree = scan.nextLine();
            //TODO check si Pseudo existe déjà
            Joueur pseudoBddRes;
            if(!entree.equals("")) {
                pseudo = entree;
                continuer = false;
            }
        }
        if(!continuer) {
            System.out.println("Cet utilisateur existe déjà.");
        } else {
            System.out.println("Donnez votre mot de passe : ");
            continuer = true;
            while(continuer) {
                String entree = scan.nextLine();
                if(!entree.equals("")) {
                    mdp = entree;
                    continuer = false;
                }
            }
        }
    }

    @Override
    public void voirLeScore(JoueurInterface j) throws RemoteException {
        //TODO get le joueur dans la BDD et renvoyer le score

    }

    @Override
    public void voirClassementJoueur() throws RemoteException {
        //TODO get les 3 premiers meilleurs joueurs classés par score

    }

    @Override
    public void voirJoueursConnectes() throws RemoteException {



    }

    @Override
    public void partiesEnAttente() throws RemoteException {

    }

    @Override
    public void creerPartie() throws RemoteException {

    }
}
