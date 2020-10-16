import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Slider;
import javafx.geometry.Orientation;
 
public class AppliTemperatures extends Application {
    
    // ATTRIBUTS 
    private Slider slider;
    private TextField temp_celsius_affichee;
    private TextField temp_farenheit_affichee;
    
    // Exercice 3 - Question 3.2
    // AJOUTEZ ICI LES ATTRIBUTS QUI VOUS SEMBLENT NECESSAIRES D AJOUTER
    private CalculTemperature calculTemp;

    
    /** Met à jour l'affichage des températures */
	public void majAffichage(){
		// Exercice 3 - Question 3.3
        // COMPLETER LE CODE DE CETTE METHODE
        this.temp_celsius_affichee.setText(this.calculTemp.getCelsius()+"");
        this.temp_farenheit_affichee.setText(this.calculTemp.getFarenheit() + "");
	}

    /** récupère la température en Celsius qui se trouve dans le TextField
     * @exception NumberFormatException si l'information entrée ne correcpond pas à un nombre
     */
    public double getCelsius() throws NumberFormatException
    {
        //parseDouble appartient à la classe Double elle transforme un string en double
        //getText appartient à la classe TextField elle récupère l'attribut text.
        return Double.parseDouble(temp_celsius_affichee.getText());
    }
    
    /** récupère la température en Farenheit qui se trouve dans le TextField
     * @exception NumberFormatException si l'information entrée ne correcpond pas à un nombre
     */
    public double getFarenheit() throws NumberFormatException
    {
        return Double.parseDouble(temp_farenheit_affichee.getText());
    }
    
    /** 
     * Récupère la température en Celsius donnée par le Slider
     */    
    public double getValueSlider(){
        // Exercice 2 - Question 2.5
        // COMPLETER LE CODE DE CETTE METHODE
        
        return this.slider.getValue();
    }
    
    /** renvoie la scene */ 
	private Scene laScene(){
		HBox cont = new HBox(10);
        cont.setAlignment(Pos.CENTER);
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        cont.getChildren().add(vbox);
        vbox.getChildren().add(new BoiteTemperature("Température en Celsius", this.temp_celsius_affichee));
        vbox.getChildren().add(new BoiteTemperature("Température en Farenheit", this.temp_farenheit_affichee));
        cont.getChildren().add(new BoiteTemperature("Température en Celsius", this.slider));
		return new Scene(cont,500,300);
	}
    
    /**
     * Met en forme la Scene principale
     * @param stage la fenêtre principale
     */
	@Override
	public void start(Stage stage) {
		stage.setTitle("Contrôle de la température");
		stage.setScene(this.laScene());
		stage.show();
        this.majAffichage();
	}
    
    /**
     * Instancie tous les attributs 
     * et connecte les widgets aux contrôleurs
     */    
    @Override
    public void init(){
        // Exercice 2 - Question 2.3
        // INSTANCIER ICI LES ATTRIBUTS
        this.calculTemp = new CalculTemperature();
        this.slider = new Slider(-20,80,20);
        this.temp_celsius_affichee = new TextField("20,0");
        this.temp_farenheit_affichee = new TextField("68,0");
        this.slider.setOrientation(Orientation.VERTICAL);

        // Exercice 2 - Question 2.4
        // REGLAGES DU SLIDER A COMPLETER
        this.slider.setShowTickMarks(true);
        this.slider.setShowTickLabels(true);
        this.slider.setMajorTickUnit(10);
        this.slider.setBlockIncrement(5);
        
                           
        //Exercice 3 - Question 3.2
        // INSTANCIER ICI LES ATTRIBUTS RESTANTS

        
        
        // Exercice 4
        // ON "CONNECTE" les widgets avec leur controleurs respectifs
        
        // CONNEXION DU TEXTFIELD CELSIUS  AVEC SON CONTROLEUR
        GestionCelsius controleurCelsius = new GestionCelsius(this.calculTemp, this); // A COMPLETER
        this.temp_celsius_affichee.setOnAction(controleurCelsius);

        //CONNEXION DU TEXTFIELD FARENHEIT AVEC SON CONTROLEUR
        GestionFarenheit controleurFarenheit = new GestionFarenheit(this.calculTemp, this); // A COMPLETER
        this.temp_farenheit_affichee.setOnAction(controleurFarenheit);

        // CONNEXION DU SLIDER  AVEC SON CONTROLEUR
        GestionSlider controleurSlider = new GestionSlider( this.calculTemp, this ); // A COMPLETER
        this.slider.valueProperty().addListener(controleurSlider);  
    }
    
    /**
     * Programme principal
     * @param args inutilisé
     */
    public static void main(String[] args) {
        launch(args);
    }

}
