import java.util.ArrayList;

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
    private ArrayList<String> pieces = new ArrayList<String>();

    /**
        Constructeur de Maison : permet de manipuler la classe maison en dehors de la classe.
     */
    public Maison(String city, int nbPiece ){
        this.city = city;
        this.nbPiece = nbPiece;
        for (int i = 0; i< nbPiece; i++){
            this.pieces.add(null);
        }
    }

    /**
        Affiche les informations de la maison
     */
    public void affiche(){
        String listPieces = "";
        for(int i=0; i < this.pieces.size() ;i++){
            
            String piece;
            int nb = i+1;
            listPieces = listPieces + "piece numero " + nb + " : " + this.pieces.get(i) + "\n";
        }
       System.out.println("Localisation de la maison: "+this.city+"\nNombre de pieces: "+this.nbPiece+"\n"+listPieces);
    }

    /**
        Indique le nombre de pièces dans la maison
        @return nbPiece
        retourne le nombre de pièces
     */
    public int getNbPieces(){
        return this.nbPiece;
    }

    /**
        Met à jour le nom de la ville de la classe Maison
     */
    public void setVille(String ville){
        this.city = ville;
    }
    
    /**
        Met à jour pour le numéro d'une pièce le nom de cette dernière
        Appelle la méthode affiche.
     */
    public void precisePiece(int numPiece, String namePiece){
        this.pieces.set(numPiece-1,namePiece);
        affiche();
    }

    /**
        Indique si un nom de pièces est présent dans la maison
        @return present
        retourne un boolean qui indique si le nom de la pièce existe ou non
     */
    public boolean cherche(String namePiece){
        boolean present = false;
        for(int i=0; i<this.pieces.size();i++){
            if (this.pieces.get(i) == namePiece) present = true;
        }
       return present;
    }

}