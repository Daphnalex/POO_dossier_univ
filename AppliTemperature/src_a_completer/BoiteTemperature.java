import javafx.scene.layout.VBox;
import javafx.scene.control.TitledPane;
import javafx.geometry.Pos;
import javafx.scene.layout.Region;
 
public class BoiteTemperature extends TitledPane{

    public BoiteTemperature(String titre, Region region){
        super(titre, new VBox(region));
        this.setCollapsible(false);
        this.setAlignment(Pos.CENTER);  
    }
    
}
