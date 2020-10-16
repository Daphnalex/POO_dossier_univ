import java.util.List;
import java.util.ArrayList;

public class Champion
{
    private String nom;
    private int attaque, defense, magie, difficulte ;
    private List<String> tags;

    public Champion(String nom, int attaque, int defense, int magie, int difficulte, String tag1){
        this.nom = nom;
        this.attaque = attaque;
        this.defense = defense;
        this.magie = magie;
        this.difficulte = difficulte;
        this.tags = new ArrayList<>();
        this.tags.add(tag1);
    }
    public Champion(String nom, int attaque, int defense, int magie, int difficulte, String tag1, String tag2){
        this(nom, attaque, defense, magie, difficulte, tag1);
        this.tags.add(tag2);
    }

    public int filtreDefense(int i){
        
    }
}



