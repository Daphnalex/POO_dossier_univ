import java.util.Comparator;

public class ComparateurNom implements Comparator<Personnage>
{
    @Override
    public int compare(Personnage p1, Personnage p2){
        return p1.getNom().compareTo(p2.getNom());
    }
}