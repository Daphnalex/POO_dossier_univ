import java.util.ArrayList;

public class Feu extends Observable {

    private String couleur;
    private ArrayList<String> listCouleur = new ArrayList<String>();

    public Feu(String couleur){
        this.couleur = couleur;
        this.listCouleur.add("vert");
        this.listCouleur.add("orange");
        this.listCouleur.add("rouge");
        
    }

    public String getCouleur(){
        return this.couleur;
    }

    public void setCouleur(String nouvelleCouleur){
        this.couleur = nouvelleCouleur;
    }

    public void changeCouleur(){
        for (int i=0; i < this.listCouleur.size() ;i++){
            if (this.listCouleur.get(i).equals(this.couleur)){
                this.couleur = this.listCouleur.get(i+1);
                this.notifierObservateur(this.couleur);
            }
        }
    }

}