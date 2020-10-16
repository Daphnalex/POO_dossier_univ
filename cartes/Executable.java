


public class Executable {

    public static void main(String[] args) {
        // Pour jouer avec un jeu de 52 cartes
        Main maMain = new Main();
        maMain.add(new Carte(12,"coeur"));
        maMain.add(new Carte(9,"carreau"));
        maMain.add(new Carte(1,"pique"));
        maMain.add(new Carte(11,"coeur"));
        maMain.add(new Carte(7,"coeur"));
        Vue_JeuDeCartes vue = new Vue_JeuDeCartes(maMain);

        Controleur controleur = new Controleur(maMain, vue);
        vue.addActionListener(controleur);
    }

}
