import java.util.List;
import java.util.ArrayList;

public class Executable{
  public static void main(String [] args){
       // Gimli a une barbe de 65cm et ses oreilles mesurent 15cm
       Personnage gimli = new Personnage("Gimli",65,15);
       System.out.println(gimli);
       // (Gimli, b=65, o=15)

       Personnage legolas = new Personnage("Legolas",0,35);
       Personnage grandpas = new Personnage("Aragorn", 20, 8);

       Groupe fraternite = new Groupe("La Fraternité");
       fraternite.ajoute(gimli);
       fraternite.ajoute(new Personnage("Legolas",0,35));
       fraternite.ajoute("Frodo",1,25);
       fraternite.ajoute("Sam",2,24);
       fraternite.ajoute("Boromir",15,9);
       fraternite.ajoute("Aragorn",20,8);
       fraternite.ajoute("Merry",7,26);
       fraternite.ajoute("Pippin",4,25);
       System.out.println(fraternite);
       // La Fraternité
       // [(Gimli, b=65, o=15), (Legolas, b=0, o=35), (Frodo, b=1, o=25), (Sam, b=2, o=24), (Boromir, b=15, o=9), (Aragorn, b=20, o=8), (Merry, b=7, o=26), (Pippin, b=4, o=25)]

       List<Personnage> grandesOreilles = fraternite.filtreOreille(25); // les membres de la fraternité qui ont des oreilles de plus de 25cm
       System.out.println("Les grandes oreilles : " + grandesOreilles);
       // Les grandes oreilles : [(Legolas, b=0, o=35), (Merry, b=7, o=26)]

       List<Personnage> petiteBarbe = fraternite.filtreBarbe(10); // les membres de la fraternité qui ont une barbe de moins de 10cm
       System.out.println("Les petites barbes : " + petiteBarbe);
       // Les petites barbes : [(Legolas, b=0, o=35), (Frodo, b=1, o=25), (Sam, b=2, o=24), (Merry, b=7, o=26), (Pippin, b=4, o=25)]
  }
}