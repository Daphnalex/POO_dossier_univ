import java.util.Comparator;

public class ComparateurOreilles implements Comparator<Personnage>
{
    @Override
    public int compare(Personnage p1, Personnage p2){
        return p1.getTailleOreilles() - p2.getTailleOreilles();
    }
}