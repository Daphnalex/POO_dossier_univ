import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ExecutableTri{
    public static void main(String[] args)
    {
       List<Integer> listeDeNombres = new ArrayList<>();
       List<String> listeDeString = new ArrayList<>();
       listeDeNombres.add(3);
       listeDeNombres.add(1);
       listeDeNombres.add(2);
       listeDeString.add("tu");
       listeDeString.add("ne");
       listeDeString.add("sais");
       listeDeString.add("rien");
       listeDeString.add("John");
       listeDeString.add("Snow");
       Collections.sort(listeDeNombres);
       Collections.sort(listeDeString);
       System.out.println(listeDeNombres);
       System.out.println(listeDeString);
      // Affiche [ 1, 2, 3]
    }
}
