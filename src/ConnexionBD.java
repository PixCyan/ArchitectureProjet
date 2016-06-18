import servants.JeuxJoueurServiceImpl;
import serveurBDD.ServiceBDD;
import tierLogique.ServiceLogique;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Utilisateur on 15/06/2016.
 */
public class ConnexionBD extends UnicastRemoteObject implements Test {

    private ConnexionBD() throws RemoteException{

    }

    @Override
    public void pudi(){

    }



    public static ServiceBDD connexionBDConnexionService() throws Exception{

        //Se connecte au serveurBDD
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 3000);
        ServiceBDD service;
        return service = (ServiceBDD) registry.lookup("ServiceBDD");
    }

}
