import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Groupe {
    private String nameGroupe;
    private ArrayList<Personnage> listPerso = new ArrayList<Personnage>();

    public Groupe(String nameGroupe){
        this.nameGroupe = nameGroupe;
    }

    public void ajoute(Personnage newPerso){
        this.listPerso.add(newPerso);
    }

    public void ajoute(String nomPerso, int longueurBarbe, int longueurOreille){
       Personnage newPerso = new Personnage(nomPerso,longueurBarbe,longueurOreille);
       System.out.println(newPerso);
       this.ajoute(newPerso); 
    }

     public String toString(){
         String chaine = "\n" + this.nameGroupe + ":" + "\n[";
        for(Personnage p: this.listPerso)
        {
            String perso = "(" + p + "),";
            chaine = chaine  + perso ;
        }
        return chaine + "]";
    }

    public List<Personnage> filtreOreille(int i){
        List<Personnage> result = this.listPerso.stream()
            .filter(personnage -> personnage.getTailleOreilles() > i)
            .collect(Collectors.toList());
       return result;
       
    }

    List<Personnage> filtreBarbe(int i){
        List<Personnage> result = this.listPerso.stream()
                .filter(personnage -> personnage.getTailleBarbe()<i)
                .collect(Collectors.toList());
        return result;  
    }

}