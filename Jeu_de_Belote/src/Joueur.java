public class Joueur{

  private String nName ;
  private int nScore ;
  private int nCompteur_de_carte ;
  private Carte[] nTableau;

  public Joueur(String name){

    // on initialise le score du joueur a 0 ;
    this.nScore = 0 ;
    // on initialise de nCompteur_de_carte a 0 ;
    this.nCompteur_de_carte = 0 ;
    // initialise le tableau ;
    this.nTableau = new Carte[13];
    // le nom du joueur
    this.nName = name ;

  }


  public void ajouterCarte(Carte carte) {

      if (nCompteur_de_carte < 13) {

          nTableau[nCompteur_de_carte] = carte;
          nCompteur_de_carte++;
      }
  }



public Carte jouerEnPremier() {

    if(nCompteur_de_carte == 0){
      return null ;
    }

    Carte carteJouee = nTableau[0];
    nTableau[0] = null;
    nCompteur_de_carte--;
    return carteJouee;
}

 public Carte play(int signe){

  for(int i = 0; i<= nCompteur_de_carte;i++){

    if(nTableau[i].getSigne() == signe){

      Carte carteJouee = nTableau[i];
      nTableau[i] = null ;
      nCompteur_de_carte -- ;

      return carteJouee;
    }
  }

  return null; // ajout pour couvrir le cas où aucune carte ne correspond au signe donné

}




public void tourGagnant(Carte[] cartes) {

  int maxValeur = 0;
  int gagnant = 0;

  // On cherche la carte avec la plus grande valeur
  for (int i = 0; i < 4; i++) {
    if (cartes[i].getValue() > maxValeur) {
      maxValeur = cartes[i].getValue();
      gagnant = i;
    }
  }

  // On met à jour le score du joueur gagnant
  if (gagnant == 0) {
    this.nScore += 3;
  }
}


}
