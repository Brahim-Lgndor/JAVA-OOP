package Java;

//Librairie.java
import java.util.ArrayList;

public class Librairie {
 private ArrayList<Produit> produits;

 public Librairie() {
     this.produits = new ArrayList<>();
 }

 // 1. Ajouter un produit [cite: 27, 64]
 public void ajouter(Produit p) {
     this.produits.add(p);
     System.out.println(p.getType() + " ajouté: " + p.getTitre());
 }

 
 public Produit rechercher(String code) throws ProduitIntrouvableException { // [cite: 66]
     for (Produit p : produits) {
         if (p.getCode().equals(code)) {
             return p;
         }
     }
     // Si la boucle se termine sans trouver le produit
     throw new ProduitIntrouvableException(code); // [cite: 59]
 }

 /**
  * 2. Supprimer un produit par son code[cite: 28, 65].
  * @param code Le code unique du produit à supprimer.
  * @throws ProduitIntrouvableException si le produit n'existe pas.
  */
 public void supprimer(String code) throws ProduitIntrouvableException { // [cite: 65]
     Produit produitASupprimer = rechercher(code); // Utiliser la méthode de recherche
     this.produits.remove(produitASupprimer);
     System.out.println("Produit supprimé: " + produitASupprimer.getTitre());
 }

 // 3. Afficher tous les produits [cite: 29, 67]
 public void afficher() {
     if (produits.isEmpty()) {
         System.out.println("--- La librairie est vide. ---");
         return;
     }
     System.out.println("\n--- Liste des produits de la librairie (" + produits.size() + " éléments) ---");
     for (Produit p : produits) {
         System.out.println(p); // Utilise le toString() redéfini de chaque sous-classe
     }
     System.out.println("-------------------------------------------------------------------");
 }

 // 5. Calculer le total des prix TTC [cite: 31, 68]
 public double totalPrixTTC() {
     double total = 0.0;
     for (Produit p : produits) {
         total += p.getPrixTTC(); // Polymorphisme: appelle le getPrixTTC() implémenté dans Produit
     }
     return total;
 }
}