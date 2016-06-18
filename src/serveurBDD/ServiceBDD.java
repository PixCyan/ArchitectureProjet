package serveurBDD;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by PixCyan on 18/06/2016.
 */
public interface ServiceBDD extends Remote {
    public boolean joueurExiste(String pseudo, String mdp) throws RemoteException, SQLException;
    public void ajouterJoueur(String pseudo, String mdp) throws RemoteException, SQLException;
    public ArrayList<String> classement() throws RemoteException, SQLException;
    public void ajouterPoint(int nbPoint, String pseudo) throws RemoteException, SQLException;
    public int scoreJoueur(String pseudo) throws RemoteException, SQLException;
    public boolean verifierConnexion(String pseudo,String mdp) throws RemoteException, SQLException;
}
