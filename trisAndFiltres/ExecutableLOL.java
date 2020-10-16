import java.util.List;


public class ExecutableLOL{
  public static void main(String [] args){
  
    Favoris arthur = new Favoris("arthur");
    arthur.importe("arthur.csv");
    System.out.println(arthur);
    
    List<Champion> defenseurs = arthur.filtreDefense(7); // filtre les champions dont la défense est >= 7
    System.out.println("les défenseurs de arthur : "+ defenseurs);

    // List<Champion> lesMages = arthur.filtre("Mage"); // filtre les champions par Tags
    // System.out.println("les mages de arthur : "+ lesMages);
    
    // arthur.trieParAttaqueCroissante();
    // System.out.println("Tri par attaque croissante : "+ arthur);

    // arthur.trieParNom();
    // System.out.println("Tri par nom : "+ arthur);

    // arthur.trieParPuissance(); // puissance = attaque + magie + defense
    // System.out.println("Tri par puissance : "+ arthur);
  }
}
