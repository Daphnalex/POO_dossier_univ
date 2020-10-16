public class CalculTemperature  {
    
    private double celsius_min;
    private double celsius_max;
    private double  celsius;
    
    /**
     * Par défaut :
     * la température minimale est de -20 degré celsius
     * la température maximale est de 80 degré celsius
     * la température actuelle est de 20 degré celsius
     **/
    public CalculTemperature(){
        // Exercice 3 - Question 3.1
        // TODO  
         this.celsius_min = -20;
         this.celsius_max = 80;
         this.celsius = 20;
    }
    public  double  getCelsiusMin (){
        // Exercice 3 - Question 3.1
        // TODO
        return this.celsius_min;
    }
    public  double  getCelsiusMax (){
        // Exercice 3 - Question 3.1
        // TODO
        return this.celsius_max;
    }
    public  double  getCelsius (){
        // Exercice 3 - Question 3.1
        // TODO
        return this.celsius  ;
    }
    public  double  getFarenheit (){
     return  this.celsius *9.0/5.0 + 32.0;
    }
    /** Modifie la température
     * @param : nouvelleTemperature en defré Celsius
     * @exception : Lève l'exception TemperatureNonValide si 
     * la nouvelleTemperature n'est pas acceptable c'est à dire
     *  si elle n'est pas comprise entre  celsius_min et celsius_max
     */
    public  void  setCelsius(double nouvelleTemperature) throws TemperatureNonValide
    {   
        if (nouvelleTemperature>=this.celsius_min && nouvelleTemperature<= this.celsius_max){
            this.celsius=nouvelleTemperature;
        }
        else{
            throw new TemperatureNonValide();
            
        }
    }
    
     /** Modifie la température
     * @param : farenheit en degré Farenheit
     * @exception : Lève l'exception TemperatureNonValide si farenheit
     * n'est pas acceptable , c'est à dire si la température en Celsius
     * n'est pas comprise entre celsius_min et celsius_max
     */   
    public  void  setFarenheit(double  farenheit) throws TemperatureNonValide
    {
        double nouvelleTemperature = (farenheit  - 32) * 5.0 / 9.0;
        this.setCelsius(nouvelleTemperature);
    }
}

