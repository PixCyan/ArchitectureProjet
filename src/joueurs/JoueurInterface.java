package joueurs;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by raffennn on 11/06/2016.
 */
public interface JoueurInterface extends Remote {
        public String infosJoueursConnectés() throws RemoteException;

}
