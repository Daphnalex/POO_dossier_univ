import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Controleur implements ActionListener{

    Main maMain;
    Vue_JeuDeCartes vue;

    public Controleur(Main m, Vue_JeuDeCartes v) {
        this.maMain=m;
        this.vue=v;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Object origineDeLEvent = arg0.getSource();
        JButton b = (JButton) origineDeLEvent;
        switch(b.getActionCommand()){
            case "triParValeurs":
            this.maMain.triParValeurs();
            break;
            case "triParCouleurs":
            this.maMain.triParCouleurs();
            break;
            case "jouer":
            this.maMain.jouer();
            break;
            case "piocher":
            this.maMain.piocher();
            break;
            case "jouerToutesValeurs":
            this.maMain.jouerToutesValeurs();
            break;
            case "jouerToutesCouleurs":
            this.maMain.jouerToutesCouleurs();
            break;
            default:
            String [] carte = b.getName().split("-");
            String couleur = carte[1];
            int valeur =  Integer.parseInt(carte[0]);
            this.maMain.setCarteSelectionee(new Carte(valeur, couleur));
        }
        this.vue.majPanelCarteSelectionnee();
        this.vue.majPanelImages();
        this.vue.addActionListenerToCards(this);

    }

}
