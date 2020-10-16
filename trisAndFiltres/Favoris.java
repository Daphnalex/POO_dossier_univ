import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Arrays;

public class Favoris{
    
    private String nomDuJoueur;
    private List<Champion> mesFavoris;
    
    public Favoris(String joueur){
        this.nomDuJoueur = joueur;
        this.mesFavoris = new ArrayList<>();
    }
    
    public void ajoute(Champion nouveauChampion){
        this.mesFavoris.add(nouveauChampion);
    }

    @Override
    public String toString(){
        return "Champions favoris de "+this.nomDuJoueur+":\n"+this.mesFavoris.toString();
    }
    
    public void importe(String nomDuFichierCSV){
        try{
            BufferedReader csv = new BufferedReader(new FileReader(nomDuFichierCSV));
            String ligne=csv.readLine();
            while (ligne!=null){
                List<String> items = Arrays.asList(ligne.split(","));
                try{
                    this.ajoute(new Champion(items.get(0), Integer.parseInt(items.get(1)), Integer.parseInt(items.get(2)), Integer.parseInt(items.get(3)), Integer.parseInt(items.get(4)),items.get(5), items.get(6)));
                }
                catch(IndexOutOfBoundsException e){
                    this.ajoute(new Champion(items.get(0), Integer.parseInt(items.get(1)), Integer.parseInt(items.get(2)), Integer.parseInt( items.get(3)), Integer.parseInt(items.get(4)),items.get(5)));
                }
                ligne = csv.readLine();
            }
            csv.close(); 
        }  
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
