public interface Jouable
{
    /**
     * @return la valeur de la carte sous la forme d'une chaîne de caractères
     * par exemple "As", "2", ..., "Dame" ou "Roi"
     */
    public String getValeur();

    /**
     * @return la valeur sous la forme d'un entier qui modélise sa "force"
     * par exemple 1, 2, 3, 4, 5, ..., 11, 12, 13
     */
    public int getValeurInt();

    /**       
     * @return la couleur de la carte sous la forme d'une chaîne
     * par exmple "Trefle", "Carreau" ou "Atout"
     */
    public String getCouleur();


    public boolean equals(Object other);
}
