public class Belote{

  private Carte[] nTabCarte ;
  private Joueur[] nTabJoueur ;


public Belote(){

  this.nTabJoueur = new Joueur[4] ;

/* (Doudou,
Lamine, Fatou, Dieynaba)
  */

  Joueur Doudou = new Joueur("Doudou");
  Joueur Fatou = new Joueur("Fatou");
  Joueur Lamine = new Joueur("Lamine");
  Joueur Dieynaba = new Joueur("Dieynaba");

  this.nTabJoueur = new Joueur[] {Doudou,Fatou,Lamine,Dieynaba} ;





}









}
