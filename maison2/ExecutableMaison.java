public class ExecutableMaison {

  public static void main(String[] args){
     Maison m = new Maison("Orléans",3);
     m.affiche(); // doit afficher :
     // Localisation de la maison : Orléans
     // Nombre de pieces : 3
     // piece numero 1 : null
     // piece numero 2 : null
     // piece numero 3 : null
     System.out.println(m.getNbPieces());// doit afficher 3
     m.setVille("Tatooine");
     m.precisePiece(1,"Chambre");
     System.out.println(m.cherche("Chambre"));
     // doit afficher true
     m.precisePiece(3,"Salle de billard");
     m.precisePiece(1,"Garage pour hélicoptère");
     m.affiche(); // doit afficher :
     // Localisation de la maison : Tatooine
     // Nombre de pieces : 3
     // piece numero 1 : Garage pour hélicoptère
     // piece numero 2 : null
     // piece numero 3 : Salle de billard
     System.out.println(m.cherche("Salle de billard"));
     // doit afficher true
     System.out.println(m.cherche("Chambre"));
     // doit afficher false
  }
}