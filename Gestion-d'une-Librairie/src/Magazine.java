package Java;

//Class fille
public class Magazine extends Produit {
	// Attributs privés
    private int mois; 
    private int numero;

    // Constructeur
    public Magazine(String code, String titre, double prix, int mois, int numero) {
        super(code, titre, prix);
        this.mois = mois;
        this.numero = numero;
    }

    // Implémentation de la méthode abstraite
    public String getType() {
        return "Magazine"; // [cite: 15]
    }

    // Getters/Setters spécifiques
    public int getMois() { 
    	return mois;
    	}
    public void setMois(int mois) { 
    	this.mois = mois;
    	}
    public int getNumero() { 
    	return numero;
    	}
    public void setNumero(int numero) {
    	this.numero = numero;
    	}

    // Redéfinition de toString()
    public String toString() {
        return super.toString() + 
               " (Mois: " + mois + ", Numéro: " + numero + ")";
    }
}