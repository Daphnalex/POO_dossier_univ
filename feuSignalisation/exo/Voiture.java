public class Voiture implements Observateur {
    
    private boolean demarrer;

    public Voiture(){
        this.demarrer = false;
    }

    public boolean getDemarrer(){
        return this.demarrer;
    }

    public boolean notificationCouleur(String couleur){
        if (couleur == "vert"){
            this.demarrer = true;
        } else {
            this.demarrer = false;
        }
        return this.demarrer;
    }
     
}