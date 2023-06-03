public class Carte{


  private  int nSigne ;
  private String nName ;
  private int nValue ;

  public Carte(int signe , String name , int value){

      this.nSigne = signe ;
      this.nName = name ;
      this.nValue = value;
  }


  public int getValue(){

    return this.nValue ;
  }


    public int getSigne(){

      return this.nSigne ;
    }

public  void output(){

  System.out.println("le signe  de la carte est " + this.nSigne);
  System.out.println("le nom de la carte est " + this.nName);
  System.out.println("la valeur de la carte est " + this.nValue);
}




}
