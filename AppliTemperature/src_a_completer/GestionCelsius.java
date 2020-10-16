import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class GestionCelsius implements EventHandler<ActionEvent>{

    public CalculTemperature temperature;
    public AppliTemperatures appli;
        
    public GestionCelsius(CalculTemperature temperature, AppliTemperatures appli ){
        this.temperature=temperature;
        this.appli=appli;
    }

    private void messageErreur(String message){
            Alert alert = new Alert(Alert.AlertType.INFORMATION,message);
            alert.setTitle("Désolé");
            alert.showAndWait();   
    }
    

    void modifieTemperature() throws NumberFormatException, TemperatureNonValide
    {
        this.temperature.setCelsius(this.appli.getCelsius());
    }
    
    @Override
    public void handle(ActionEvent actionEvent) { 
        try{
            this.modifieTemperature();
        }
        catch(NumberFormatException e){
            this.messageErreur("Veuillez entrer un nombre");
        }
        catch(TemperatureNonValide e){
            this.messageErreur("Veuillez entrer une température raisonnable\nc'est à dire une température comprise\nentre "+temperature.getCelsiusMin()+"°Celsius et "+temperature.getCelsiusMax()+"°Celsius");
        }
        this.appli.majAffichage();
    }
}
