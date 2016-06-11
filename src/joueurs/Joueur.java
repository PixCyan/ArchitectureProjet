package joueurs;

import tierLogique.Partie;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by raffennn on 11/06/2016.
 * Gestion d'un joueur
 */
public class Joueur extends UnicastRemoteObject {
    private int id;
    private String pseudo;
    private String password;
    private String totalScore;
    private Partie partie;

    private Joueur() throws RemoteException {
    }

    public static void main(String [] args) throws Exception {
        //TODO main client

    }


}
