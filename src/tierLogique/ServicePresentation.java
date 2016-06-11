package tierLogique;

import joueurs.JoueurInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by raffennn on 11/06/2016.
 */
public interface ServicePresentation extends Remote {
    public void seConnecter() throws RemoteException;
    public void creerUnCompte() throws RemoteException;
    public void voirLeScore(JoueurInterface j) throws RemoteException;
    public void voirClassementJoueur() throws RemoteException;
    public void voirJoueursConnectes() throws RemoteException;
    public void partiesEnAttente() throws RemoteException;
    public void creerPartie() throws RemoteException;



}
