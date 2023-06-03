public class MainApp{

  public static void main(String[] args){

    Carte carte = new Carte(0 , "dame" , 12);
    carte.output();

    Joueur joueur = new Joueur("Loum");

    joueur.ajouterCarte(carte);
  }
}
