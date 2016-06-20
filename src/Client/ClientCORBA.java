package Client;

import Jeux.*;
import org.omg.CORBA.Object;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Scanner;

/**
 * Created by Utilisateur on 14/06/2016.
 */
public class ClientCORBA {

    public static void main(String[] args){
        try{
            // Connexion au serveur et chargement des interfaces
            InitialContext ctx = new InitialContext();
            Object refJoueur = (Object) ctx.lookup("JEUXJOUEUR");
            Object refConnexion = (Object) ctx.lookup("JEUXCONNEXION");
            Object refPartie = (Object) ctx.lookup("JEUXPARTIE");

            IJoueurRemote stubJ = IJoueurRemoteHelper.narrow((org.omg.CORBA.Object)refJoueur);
            IConnexionRemote stubC = IConnexionRemoteHelper.narrow((org.omg.CORBA.Object)refConnexion);
            IPartieRemote stubP = IPartieRemoteHelper.narrow((org.omg.CORBA.Object)refPartie);
            Scanner scan = new Scanner(System.in);
            String cmd ="";
            String pseudo="";
            String mdp="";
            Boolean menu =true;

            while (menu) {
                System.out.println("\t\t-----------------------------------------");
                System.out.println("\t\t|                                       |");
                System.out.println("\t\t| Commandes :                           |\n" +
                        "\t\t|\t1 : se connecter au service         |\n" +
                        "\t\t|\t2 : créer un compte                 |");
                System.out.println("\t\t|                                       |");
                System.out.println("\t\t-----------------------------------------");

                System.out.print("> ");
                cmd = scan.nextLine();
                if (cmd.equalsIgnoreCase("1")) {
                    System.out.println("\tPseudo : (ou exit pour annuler)");
                    pseudo = scan.nextLine();
                    if(!pseudo.equals("exit")) {
                        System.out.println("\tMot de passe : ");
                        mdp = scan.nextLine();
                        stubC.seConnecter(pseudo, mdp);
                        menu = false;
                    }

                } else if (cmd.equalsIgnoreCase("2")) {
                    System.out.println("\tEntrez votre pseudo : (exit pour annuler)");
                    pseudo = scan.nextLine();
                    if(!pseudo.equals("exit")) {
                        System.out.println("\tEntrez votre mot de passe : ");
                        mdp = scan.nextLine();
                        stubJ.creerUnCompte(pseudo, mdp);
                        menu = false;
                    }

                } else {
                    System.out.println("Uniquement les commandes ci dessous\n");
                }
            }
            menu=true;

            //Menu
            while (menu) {
                System.out.println("\t\t-----------------------------------------------------------------");
                System.out.println("\t\t|                                                               |");
                System.out.println("\t\t|  Commandes :                                                  |\n" +
                        "\t\t|\t1 : afficher le score                                       |\n" +
                        "\t\t|\t2 : affiche le classement des joueurs                       |\n" +
                        "\t\t|\t3 : afficher la liste des joueurs connectés                 |\n" +
                        "\t\t|\t4 : affiche la liste des parties en attente de joueurs      |\n" +
                        "\t\t|\t5 : se deconnecter                                          |");
                System.out.println("\t\t|                                                               |");
                System.out.println("\t\t-----------------------------------------------------------------");
                System.out.print("> ");
                cmd = scan.nextLine();
                if (cmd.equalsIgnoreCase("1")) {
                    //stubJ.voirLeScore();
                    menu=false;
                } else if (cmd.equalsIgnoreCase("2")) {
                    stubJ.voirClassementJoueur();
                    menu=false;
                } else if (cmd.equalsIgnoreCase("3")) {
                    stubJ.voirJoueursConnectes();
                    menu=false;
                } else if (cmd.equalsIgnoreCase("4")) {
                    stubP.partiesEnAttente();
                    menu=false;
                }
                else if (cmd.equalsIgnoreCase("5")) {
                    //stubC.seDeconnecter();
                    menu=false;
                }
                else{
                    System.out.println("Uniquement les commandes ci dessous\n");
                }
            }
        }
        catch(NamingException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

