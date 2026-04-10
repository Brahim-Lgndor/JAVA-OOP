package Java;

public class ProduitIntrouvableException extends Exception { 
 public ProduitIntrouvableException(String code) {
     super("Le produit avec le code '" + code + "' n'a pas été trouvé dans la librairie."); 
 }
}