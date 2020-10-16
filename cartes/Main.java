import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class Main {
        
    private ArrayList<Jouable> main;
    private Jouable carteSelectionnee;

    public Main(){
        this.main = new ArrayList<Jouable>();
    }
        
    public ArrayList<Jouable> getMesCartes(){
        return this.main;
    }

    public Jouable getCarteSelectionnee(){
        return this.carteSelectionnee;
    }
    
    public void add(Jouable c){
        this.main.add(c);
    }
    
    public int nombreDeCartes(){
        return 0;
    }
    
    
    public void jouer(){
        if (this.carteSelectionnee!=null)
        {
            this.main.remove(carteSelectionnee);
            this.carteSelectionnee=null;
        }
        else
            System.out.println("aucune carte selectionnée");
    }


    public void jouerToutesCouleurs(){
        ArrayList<Jouable> copyMain = (ArrayList<Jouable>)this.main.clone();
        for(int i=0; i < copyMain.size();i++){
            Jouable carteCourante = copyMain.get(i);
            if (carteCourante.getCouleur().equals(this.carteSelectionnee.getCouleur())){
                this.main.remove(carteCourante);
            }
        }
    }

    public void jouerToutesValeurs(){
        ArrayList<Jouable> copyMain = (ArrayList<Jouable>)this.main.clone();
        for(int i=0; i < copyMain.size();i++){
            Jouable carteCourante = copyMain.get(i);
            if (carteCourante.getValeurInt() == this.carteSelectionnee.getValeurInt())){
                this.main.remove(carteCourante);
            }
        }
    }    
        
    public void triParValeurs(){
    }
    /**
    * Trie dans l'ordre "trefle" < "carreau"< "coeur" < "pique"
    */
    public void triParCouleurs(){
    }


    public void piocher(){
        Random generateurDeNombresAleatoires = new Random();
        String [] couleurs={"trefle", "carreau", "coeur", "pique"};
        int valeur = generateurDeNombresAleatoires.nextInt(13)+1;
        String couleur = couleurs[generateurDeNombresAleatoires.nextInt(4)];

        this.add(new Carte(valeur, couleur));
        System.out.println(this.main);
        }
    
    public void setCarteSelectionee(Jouable c)
    {
        this.carteSelectionnee = c;
    }

    public boolean carteSelectionnee()
    {
        return !(this.carteSelectionnee==null);
    }

}
