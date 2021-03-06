import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExecutableTri3{
  public static void main(String [] args){

       Personnage gimli = new Personnage("Gimli",65,15);
       Personnage legolas = new Personnage("Legolas",0,35);
       Personnage grandpas = new Personnage("Aragorn", 20, 8);

       List<Personnage> maListe = new ArrayList<>();
       maListe.add(gimli);
       maListe.add(legolas);
       maListe.add(grandpas);
       maListe.add(new Personnage("Boromir",15,49));
       System.out.println("Liste non triée :"+maListe);
       // Liste non triée : [(Gimli, b=65, o=15), (Legolas, b=0, o=35), (Aragorn, b=20, o=8), (Boromir, b=15, o=49)]

       Collections.sort(maListe, new ComparateurOreilles());
       System.out.println("Liste triée par oreille croissante :"+maListe);

       Collections.sort(maListe, new ComparateurNom());
       System.out.println("Liste triée par ordre alphabetique :"+maListe);

  }
}