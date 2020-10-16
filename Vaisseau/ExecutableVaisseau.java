public class ExecutableVaisseau{
  public static void main(String [] args){
    Vaisseau faucon = new Vaisseau("Faucon Millenium",6,4);
    System.out.println(faucon.getNom()); 
    System.out.println(faucon.nbPassagers()); 
    System.out.println(faucon.getPuissance()); 
    System.out.println(faucon.transportDePassagers()); 

  }
}