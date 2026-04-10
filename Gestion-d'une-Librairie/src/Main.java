package Java;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Initialisation de la librairie
     Librairie livre = new Librairie();
     // 1. Initialisation du Livre
     Livre livre1 = new Livre("L001", "POO en Java", 30.0, "M. Dupont", 450);
     Livre livre2 = new Livre("L002", "Algorithmes Avancés", 45.50, "Mme. Dubois", 620);
     // 2. Ajout
     livre.ajouter(livre1);
     livre.ajouter(livre2);
     // 3. Affichage initial
     livre.afficher();
     // 4. AFFICHAGE TOTAL TTC 
     double l_totalTTC = livre.totalPrixTTC();
     System.out.println("\n*** Total des prix TTC de tous les produits: " + String.format("%.2f", l_totalTTC) + "€ ***");
     // 5. Recherche réussie [cite: 73]
     System.out.println("\n--- Test de recherche réussie (L001) ---");
     try {
         Produit produitTrouve = livre.rechercher("L001");
         System.out.println("Produit trouvé: " + produitTrouve.getTitre());
     } catch (ProduitIntrouvableException s) {
         System.out.println("Erreur de recherche: " + s.getMessage());
     }

     // 6. Recherche qui échoue [cite: 73]
     System.out.println("\n--- Test de recherche qui échoue (Z999) ---");
     try {
         livre.rechercher("Z999");
     } catch (ProduitIntrouvableException s) {
         // L'exception est levée et capturée
         System.out.println("Géré: " + s.getMessage());
     }
     
     // 7. Suppression [cite: 74]
     System.out.println("\n--- Test de suppression (L002) ---");
     try {
         livre.supprimer("L002");
     } catch (ProduitIntrouvableException s) {
         System.out.println("Erreur de suppression: " + s.getMessage());
     }
     
     // 8. Affichage après suppression [cite: 75]
     livre.afficher();

     														// !!!!!!!   ANOTHER LIBRAIRIE   !!!!!!!!
     
     
     // Initialisation de la librairie
     Librairie mag = new Librairie();
     // 1. Initialisation du Magazine
     Magazine mag1 = new Magazine("M001", "Programmation Aujourd'hui", 7.99, 12, 150);
     Magazine mag2 = new Magazine("M002", "Les Nouvelles Tech", 5.0, 1, 151);
     // 2. Ajout
     mag.ajouter(mag1);
     mag.ajouter(mag2);
     // 3. Affichage initial 
     mag.afficher();
     // 4. AFFICHAGE TOTAL TTC 
     double m_totalTTC = mag.totalPrixTTC();
     System.out.println("\n*** Total des prix TTC de tous les produits: " + String.format("%.2f", m_totalTTC) + "€ ***");

     // 5. Recherche réussie [cite: 73]
     System.out.println("\n--- Test de recherche réussie (M001) ---");
     try {
         Produit produitTrouve = mag.rechercher("M001");
         System.out.println("Produit trouvé: " + produitTrouve.getTitre());
     } catch (ProduitIntrouvableException z) {
         System.out.println("Erreur de recherche: " + z.getMessage());
     }

     // 6. Recherche qui échoue [cite: 73]
     System.out.println("\n--- Test de recherche qui échoue (X999) ---");
     try {
         mag.rechercher("X999");
     } catch (ProduitIntrouvableException z) {
         // L'exception est levée et capturée
         System.out.println("Géré: " + z.getMessage());
     }
     
     // 7. Suppression [cite: 74]
     System.out.println("\n--- Test de suppression (M002) ---");
     try {
         mag.supprimer("M002");
     } catch (ProduitIntrouvableException z) {
         System.out.println("Erreur de suppression: " + z.getMessage());
     }
     
     // 8. Affichage après suppression [cite: 75]
     mag.afficher();

  }
}