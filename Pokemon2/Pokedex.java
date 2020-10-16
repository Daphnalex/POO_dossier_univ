import java.util.ArrayList; // import the ArrayList class

public class Pokedex{
   
   private String nomPokedex;
   
   private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

   public Pokedex(String nouveauNom){
       this.nomPokedex = nouveauNom;
   }

   public void ajoute(Pokemon newPokemon){
       this.pokedex = newPokemon;
   } 

   public String getNom(){
       return this.nomPokedex;
   }

   public int nombrePokemons(){
       return this.pokedex.size();
   }

   public int totalPuissance(){
       int total = 0;
       for(Pokemon p: this.pokedex){
           total = total + p.getAttaque();
       }
       return total;
   }

   public boolean contient(String nom){
       boolean bool = false;
       for(Pokemon p: this.pokedex){
           if (nom.equals(p.getNom())) bool = true;
       }
       return bool;
   }
}