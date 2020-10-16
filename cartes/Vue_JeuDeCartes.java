import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import java.util.ArrayList;

public class Vue_JeuDeCartes extends JFrame
{
    
    protected JPanel panelImages;
    protected JPanel PanelCarteSelectionnee;
    protected JButton piocher;

    protected JButton jouer;
    protected JButton jouerCouleurs;
    protected JButton jouerValeurs;
    protected JButton trierParCouleurs;
    protected JButton trierParValeurs;
    protected ArrayList<JButton> boutonsCartes;
    protected Main main;


    public Vue_JeuDeCartes(Main main){
    
        super("Jouer aux cartes");
        this.setSize(1200 ,600); // taille de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // action a la fermeture
        this.main = main;
        this.boutonsCartes = new ArrayList<JButton>();

        Container cont = this.getContentPane(); // récupère le conteneur principal
        cont.setLayout(new BorderLayout()); // gère les positionnement dans le conteneur

        this.initPanelTitre();
        this.initPanelImages();
        this.initPanelBoutons();
        this.initPanelGauche();

        this.setVisible(true);

    }

    void initPanelTitre(){
        JPanel panelTitre = new JPanel(new FlowLayout());
        JLabel titre = new JLabel("Ma première Appli");
        titre.setFont(new Font ("Liberation Sans Serif", Font.PLAIN, 35));
        panelTitre.add(titre);
        Container cont = this.getContentPane();
        cont.add( panelTitre, BorderLayout.NORTH);
    }


    void initPanelImages(){

        this.panelImages = new JPanel(new FlowLayout());
        this.panelImages.setBorder(new TitledBorder("Les cartes dans ma main"));
        this.majPanelImages();
        Container cont = this.getContentPane();
        cont.add( panelImages, BorderLayout.CENTER);

    }

    void initPanelGauche(){
        JPanel panelGauche = new JPanel();
        BoxLayout box1 = new BoxLayout(panelGauche, BoxLayout.Y_AXIS);
        panelGauche.setLayout(box1);

        this.piocher = new JButton("piocher une nouvelle carte",new ImageIcon("images/paquet.jpeg"));
        this.jouer = new JButton();
        this.jouerValeurs = new JButton();
        this.jouerCouleurs = new JButton();
              
        panelGauche.add(piocher);
        panelGauche.add(jouer);
        panelGauche.add(jouerValeurs);
        panelGauche.add(jouerCouleurs);
        Container cont = this.getContentPane();
        cont.add(panelGauche, BorderLayout.WEST);


        piocher.setActionCommand("piocher");
        this.jouer.setActionCommand("jouer");
        this.jouerValeurs.setActionCommand("jouerToutesValeurs");
        this.jouerCouleurs.setActionCommand("jouerToutesCouleurs");

        this.majPanelCarteSelectionnee();
    }

    void addActionListenerToCards(Controleur controleur){
        for(JButton bouton : this.boutonsCartes)
        {
            bouton.addActionListener(controleur);
        }
    }

    void addActionListener(Controleur controleur){
        this.piocher.addActionListener(controleur);
        this.jouer.addActionListener(controleur);
        this.jouerValeurs.addActionListener(controleur);
        this.jouerCouleurs.addActionListener(controleur);
        this.trierParValeurs.addActionListener(controleur);
        this.trierParCouleurs.addActionListener(controleur);
        this.addActionListenerToCards(controleur);

    }

    void initPanelBoutons(){
        JPanel panelBoutons = new JPanel(new FlowLayout());

        this.trierParCouleurs = new JButton("Ranger par couleurs");

        this.trierParValeurs = new JButton("Ranger par valeurs");

        panelBoutons.add(trierParCouleurs);
        panelBoutons.add(trierParValeurs);

        Container cont = this.getContentPane();
        cont.add( panelBoutons, BorderLayout.SOUTH);

        trierParValeurs.setActionCommand("triParValeurs");
        trierParCouleurs.setActionCommand("triParCouleurs");

    }

    void majPanelImages(){

        this.panelImages.removeAll();
        this.boutonsCartes.clear();
                assert this.main.getMesCartes()  != null : "La méthode getMesCartes a renvoyé null!";
        for (Jouable carte : this.main.getMesCartes()){
            JButton dessin = new JButton();
            dessin.setIcon(new ImageIcon("images/"+carte.getValeurInt()+"-"+carte.getCouleur()+".jpg"));
            dessin.setMargin(new Insets(0, 0, 0, 0));
            dessin.setBorder(null);
            dessin.setName(""+carte.getValeurInt()+"-"+carte.getCouleur());
            this.panelImages.add(dessin);
            this.boutonsCartes.add(dessin);

        }
        this.panelImages.validate();
        this.panelImages.repaint();

    }
    void majPanelCarteSelectionnee(){

        if (this.main.getCarteSelectionnee()==null){
            this.jouer.setText("Aucune carte sélectionnée pour l'instant");
            this.jouer.setIcon(null);
            this.jouerValeurs.setVisible(false);
            this.jouerCouleurs.setVisible(false);
        }
        else{
            Jouable selection = this.main.getCarteSelectionnee();

            this.jouer.setText("jouer cette carte");
            this.jouer.setIcon(new ImageIcon("images/"+selection.getValeurInt()+"-"+selection.getCouleur()+".jpg"));

            this.jouerValeurs.setVisible(true);
            this.jouerCouleurs.setVisible(true);
            this.jouerValeurs.setText("Jouer tous les "+selection.getValeur());
            this.jouerCouleurs.setText("Jouer tous les "+selection.getCouleur());
        }


    }
}
