public class Personnage implements Comparable {
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
     public String toString(){
        return this.name+", b="+this.tailleBarbe+", o="+this.tailleOreilles;
    }

    @Override
    public int compareTo(Object o){
        return this.getTailleBarbe() - ((Personnage)o).getTailleBarbe();
    }
    
}