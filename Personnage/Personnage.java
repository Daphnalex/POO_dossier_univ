public class Personnage {
    private String name;
    private int tailleOreilles;
    private int tailleBarbe;

    public Personnage(String name, int tailleBarbe, int tailleOreilles){
        this.name = name;
        this.tailleBarbe = tailleBarbe;
        this.tailleOreilles = tailleOreilles;
    }

    public String getNom(){
        return this.name;
    }

    public int getTailleOreilles(){
        return this.tailleOreilles;
    }

    public int getTailleBarbe(){
        return this.tailleBarbe;
    }
}