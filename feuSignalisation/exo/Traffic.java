public class Traffic {
    public void main(String[] args){
        Feu feu1 = new Feu("rouge");
        Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture();
        Voiture voiture3 = new Voiture();
        Voiture voiture4 = new Voiture();
        feu1.ajouterObservateur(voiture1);
        feu1.ajouterObservateur(voiture2);
        feu1.ajouterObservateur(voiture3);
        feu1.ajouterObservateur(voiture4);
        feu1.changeCouleur();
        System.println(feu1.getCouleur());
        System.println("La voiture démarre : " +voiture1.getDemarrer());


    }
}