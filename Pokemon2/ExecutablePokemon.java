public class ExecutablePokemon{
  public static void main(String [] args){
  
  // Coconfort est un pokemon de 10kg et sa valeur d'attaque est 1
    Pokemon cocon = new Pokemon("Coconfort",10,1);
    System.out.println(cocon.getNom()); // Coconfort
    System.out.println(cocon.getPoids()); // 10
    System.out.println(cocon.getAttaque()); // 1

    Pokemon dardagnan = new Pokemon("Dardagnan",29.5,5);
    Pokemon dracaudeu = new Pokemon("Dracaufeu",90.5,4);
    Pokemon bulbizarre = new Pokemon("Bulbizarre",6.9,3);
    
    Pokedex pokedex = new Pokedex();
    pokedex.ajoute(dardagnan);
    pokedex.ajoute(dracaudeu);
    System.out.println(pokedex.getNom()); // Nouveau Pokedex
    System.out.println(pokedex.nombrePokemons()); // 2
    System.out.println(pokedex.totalPuissance()); // 9 (5 + 4)
    System.out.println(pokedex.contient("Dardagnan")); // true
    System.out.println(pokedex.contient("Bulbizarre")); // false
       
    Pokedex pokedexMathieu = new Pokedex("Mathieu");
    pokedexMathieu.ajoute(cocon);
    pokedexMathieu.ajoute(dardagnan);
    pokedexMathieu.ajoute(dracaudeu);
    pokedexMathieu.ajoute(bulbizarre);
    System.out.println(pokedexMathieu.getNom()); // Mathieu
    System.out.println(pokedexMathieu.nombrePokemons()); // 4
    System.out.println(pokedexMathieu.totalPuissance()); // 13 (1+5+4+3)

    String justePourVoir = new String("Bulbizarre");
    System.out.println(pokedexMathieu.contient(justePourVoir)); // true bien sur
    
  }
}