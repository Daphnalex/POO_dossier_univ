public class Vaisseau {
    private String nom;
    private int nombreDePassagers = 0;
    private int puissanceDeFeu;

    public Vaisseau(String nom, int puissance){
        this.nom = nom;
        this.puissanceDeFeu = puissance;
    }

    public Vaisseau(String nom, int passagers, int puissance){
        this(nom,puissance);
        this.nombreDePassagers = passagers;
    }

    public String getNom(){
        return this.nom;
    }

    public int nbPassagers(){
        return this.nombreDePassagers;
    }

    public int getPuissance(){
        return this.puissanceDeFeu;
    }

    public boolean transportDePassagers(){
        if (this.nombreDePassagers > 0){
            return true;
        } else return false;
    }
}