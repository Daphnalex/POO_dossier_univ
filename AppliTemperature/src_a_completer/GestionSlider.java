import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
 
public class GestionSlider implements ChangeListener<Number>{

    private CalculTemperature temperature;
    private AppliTemperatures appli;
    
    public GestionSlider(CalculTemperature temperature, AppliTemperatures appli ){
        this.temperature=temperature;
        this.appli=appli;
    }
    
    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
    {
        try{
            this.temperature.setCelsius(this.appli.getValueSlider());
            this.appli.majAffichage();
        }
        catch(TemperatureNonValide e){
            e.printStackTrace();
            System.out.println("Normalement, il est impossible de passer par ici !!!");
        }
    }
}
  
