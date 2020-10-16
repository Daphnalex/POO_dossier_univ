public class Pokemon{
     /**
    @param nom
    Nom du Pokémon
    */
     private String nom;

    /**
    @param poids
    Poids du Pokémon
    */
     private double poids;

    /**
    @param attaque
    Nombre d'attaque du Pokémon
     */
     private int attaque;

     /**
    Méthode qui Renvoie le nom du pokémon
    @return nom
     */
     public String getNom(){
         return this.nom;
     }

     /**
    Méthode qui Renvoie le poids du pokémon
    @return poids
     */
     public double getPoids(){
         return this.poids;
     }

     /**
    Méthode qui Renvoie la valeur d'attaque du pokémon
    @return attaque
     */
     public int getAttaque(){
         return this.attaque;
     }

     /** 
        Constructeur de pokémon
        Instancie le nom, le poids et la valeur d'attaque du pokémon
     */
    public Pokemon(String nom, double poids, int attaque){
        this.nom = nom;
        this.poids = poids;
        this.attaque = attaque;
    }
}