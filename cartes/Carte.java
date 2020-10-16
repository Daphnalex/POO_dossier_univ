class Carte implements Jouable{

    private int intValue;
    private String couleur;

    public Carte(int intValue,String color){
        this.intValue = intValue;
        this.couleur = color;
    }

    public String getValeur(){
        switch(this.intValue){
            case 1: 
                return "As";
            case 11: 
                return "Valet";
            case 12: 
                return "Dame";
            case 13: 
                return "Roi";
            default: 
                return Integer.toString(this.intValue);
        }
    } 

    public int getValeurInt(){
        return this.intValue;
    } 

    public String getCouleur(){
        return this.couleur;
    }


    public boolean equals(Object o){
        Jouable other = (Jouable)o;
        if (this.intValue == other.getValeurInt() && this.couleur == other.getCouleur()) return true;
        else return false;
    }
}