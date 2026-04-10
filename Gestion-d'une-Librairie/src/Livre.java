package Java;

// Class fille
public class Livre extends Produit {
	// Attributs privés
	private String auteur;
    private int pages;
    
    // Constructeur
    public Livre(String code, String titre, double prix, String auteur, int pages) {
        super(code, titre, prix);
        this.auteur = auteur;
        this.pages = pages;
    }
    
    // Getters et Setters 
    public String getAuteur() { 
    	return auteur;
    	}
    public void setAuteur(String auteur) {
    	this.auteur = auteur; 
    	}
    public int getPages() {
    	return pages; 
    	}
    public void setPages(int pages) {
    	this.pages = pages;
    	}
    
    // Implémentation de la méthode abstraite
    public String getType() {
        return "Livre";
    }
    
    // Redéfinition de toString()
    public String toString() {
        return super.toString() + 
               " (Auteur: " + auteur + ", Pages: " + pages + ")";
    }
}
    


