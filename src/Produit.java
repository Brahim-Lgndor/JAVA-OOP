package Java;

// Class mère
// implémente l'interface Vendable et définit les attributs communs.
public abstract class Produit implements Vendable { 
    // Attributs privés
    private String code;
    private String titre; 
    private double prix; // Prix (HT) 

    // Constructeur 
    public Produit(String code, String titre, double prix) {
        this.code = code;
        this.titre = titre;
        this.prix = prix;
    }

    // Setters et Getters  
    public void setCode(String code) {
    	this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }
    
    public void setPrix(double prix) {
        this.prix = prix;
    }
   
    public double getPrix() {
        return prix;
    }

 // Implémentation de getPrixTTC() de l'interface Vendable
    public double getPrixTTC() {
        // TVA de 5%
        return this.prix * 1.05;
    }

    // Méthode abstraite à implémenter par les sous-classes 
    public abstract String getType();

    // Redéfinition de toString()
    public String toString() {
        return getType() + "Code: " + code + ", Titre: " + titre + ", Prix HT: " + prix + "$";
    }
}
