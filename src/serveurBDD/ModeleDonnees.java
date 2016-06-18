package serveurBDD;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by raffennn on 11/06/2016.
 * Serveur : gestion des données
 */
public class ModeleDonnees {
    Connection connection = null;
    Statement statement = null;

    /**
     * Connexion à la base de données
     */
    public ModeleDonnees(){

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:jeucartes.db");
            statement = connection.createStatement();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    /**
     * Création de la table joueur
     * @throws SQLException
     */
    public void createTables() throws SQLException{
        statement.execute("DROP TABLE IF EXISTS JOUEUR");

        String joueur = "CREATE TABLE JOUEUR " +
                "(PSEUDO TEXT PRIMARY KEY NOT NULL," +
                " MDP TEXT NOT NULL, " +
                " SCORE INT NOT NULL);";

        statement.executeUpdate(joueur);
    }

    /**
     * Test si le pseudo est déjà existant dans la base de données. Renvoie vrai s'il existe, faux sinon
     * @param pseudo
     * @return boolean
     * @throws SQLException
     */
    public boolean joueurExiste(String pseudo) throws SQLException{
        Boolean existe =false;
        ResultSet res=statement.executeQuery("SELECT PSEUDO FROM JOUEUR WHERE PSEUDO=pseudo");

        if(res.next()){
            existe=true;
        }
        return existe;
    }

    /**
     * Teste si le mot de passe correspond bien au pseudo du joueur
     * @param pseudo
     * @param mdp
     * @return boolean
     * @throws SQLException
     */
    public boolean verifierConnexion(String pseudo,String mdp) throws SQLException{
        boolean possible=false;
        ResultSet res=statement.executeQuery("SELECT PSEUDO,MDP FROM JOUEUR WHERE PSEUDO=pseudo AND MDP=mdp");

        if(res.next()){
            possible=true;
        }
        return possible;
    }

    /**
     * Ajoute un joueur dans la base de données
     * @param pseudo
     * @param mdp
     * @throws SQLException
     */
    public void ajouterJoueur(String pseudo, String mdp) throws SQLException{
        statement.executeUpdate("INSERT INTO JOUEUR VALUES(pseudo,mdp,'0')");
    }

    /**
     * Retourne un classement des joueurs du scores le plus haut jusqu'au score le plus bas
     * @return ArrayList
     * @throws SQLException
     */
    public ArrayList<String> classement() throws SQLException{

        ResultSet res = statement.executeQuery("SELECT PSEUDO,SCORE FROM JOUEUR ORDER BY SCORE");

        ArrayList<String> classementJoueur = new ArrayList<String>();
        ResultSetMetaData metadata = res.getMetaData();
        int numberOfColumns = metadata.getColumnCount();
        while (res.next()) {
            int i = 1;
            while (i <= numberOfColumns) {
                classementJoueur.add(res.getString(i++));
            }
        }
        return classementJoueur;
    }

    /**
     * Ajoute à un joueur un certains nombre de points
     * @param nbPoint
     * @param pseudo
     * @throws SQLException
     */
    public void ajouterPoint(int nbPoint, String pseudo) throws SQLException{
        int score;
        score=scoreJoueur(pseudo)+nbPoint;

        statement.executeUpdate("UPDATE JOUEUR SET SCORE=score WHERE PSEUDO=pseudo");
    }

    /**
     * Retourne le score d'un joueur
     * @param pseudo
     * @return
     * @throws SQLException
     */
    public Integer scoreJoueur(String pseudo) throws SQLException{
        int score;
        ResultSet res=statement.executeQuery("SELECT SCORE FROM JOUEUR WHERE PSEUDO=pseudo");
        score=Integer.parseInt(res.getString(1));
        return score;
    }

    //statement.close();
    //connection.close();
}


