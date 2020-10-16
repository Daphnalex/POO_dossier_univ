import java.util.ArrayList;

public class Observable {
    ArrayList<Observateur> listObserver = new ArrayList<Observateur>();

    public void ajouterObservateur(Observateur voiture){
        this.listObserver.add(voiture);
    }

    public void supprimerObservateur(Observateur voiture){
        this.listObserver.remove(voiture);
    }

    public void notifierObservateur(String color){
        for(int i=0; i < this.listObserver.size(); i++){
            this.listObserver.get(i).notificationCouleur(color);
        }
    }
}