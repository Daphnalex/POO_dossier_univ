public class Maison{
    /**
        @param city;
        Ville où se situe l'instance de ma classe Maison
     */
    private String city;
    /**
        @param nbPiece;
        Nombre de pièce dans la maison
     */
    private int nbPiece;

    /**
        @param pieces;
        Tableau des noms de pièces de la maison
     */
    private String[] pieces;

    /**
        Constructeur de Maison : permet de manipuler la classe maison en dehors de la classe.
     */
    public Maison(String city, int nbPiece ){
        this.city = city;
        this.nbPiece = nbPiece;
        this.pieces = new String[nbPiece];
    }

    /**
        Affiche les informations de la maison
     */
    public String affiche(){
        String listPieces = "";
        for(int i=1; i<=this.nbPiece;i++){
            listPieces = listPieces + "piece numero " + i + " : " + this.pieces[i];
            
        }
        return "Localisation de la maison: "+ this.city +"\nNombre de pièces: " + this.nbPiece + "\n" + listPieces;
    }

    public int getNbPieces(){
        return this.nbPiece;
    }

    public void setVille(String ville){
        this.city = ville;
    }
    
    public void precisePiece(int nbPiece, String namePiece){
        
    }

    public boolean cherche(String namePiece){
        return true;
    }

}