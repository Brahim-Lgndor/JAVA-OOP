# 📚 Library Management System (Gestion d’une Librairie)

## 🎯 Project Overview
This Java application is designed to automate the management of a library's inventory. It provides a structured way to handle books, members, and borrowing transactions, focusing on clean **Object-Oriented** architecture.

## 🚀 Engineering Features
* **Inheritance & Polymorphism:** Used a modular class structure to manage different types of library resources.
* **Collections Framework:** Implemented `ArrayList` and `HashMap` for efficient data storage and retrieval of book records.
* **Data Persistence:** Integrated File I/O logic to ensure library data is saved and persists after the application is closed.
* **Robust Error Handling:** Used `try-catch` blocks to handle invalid user inputs and prevent system crashes during runtime.

## 🛠 Technical Stack
* **Language:** Java (JDK 11/17)
* **Paradigm:** Object-Oriented Programming (OOP)
* **Storage:** Text-based data persistence (File I/O)

## 📂 Key Components
* **Book Management:** CRUD operations (Create, Read, Update, Delete) for the book catalog.
* **Member Tracking:** Logic for registering library members and tracking their borrowing status.
* **Transaction Logic:** Automated validation for checking book availability and return deadlines.

## 🏁 How to Run
1. Navigate to the `src` folder.
2. Compile the source code:
   ```bash
   javac *.java

# 👇🏻 OUTPUT
Livre ajouté: POO en Java
Livre ajouté: Algorithmes Avancés

--- Liste des produits de la librairie (2 éléments) ---
LivreCode: L001, Titre: POO en Java, Prix HT: 30.0$ (Auteur: M. Dupont, Pages: 450)
LivreCode: L002, Titre: Algorithmes Avancés, Prix HT: 45.5$ (Auteur: Mme. Dubois, Pages: 620)
-------------------------------------------------------------------

*** Total des prix TTC de tous les produits: 79.28€ ***

--- Test de recherche réussie (L001) ---
Produit trouvé: POO en Java

--- Test de recherche qui échoue (Z999) ---
Géré: Le produit avec le code 'Z999' n'a pas été trouvé dans la librairie.

--- Test de suppression (L002) ---
Produit supprimé: Algorithmes Avancés

--- Liste des produits de la librairie (1 éléments) ---
LivreCode: L001, Titre: POO en Java, Prix HT: 30.0$ (Auteur: M. Dupont, Pages: 450)
-------------------------------------------------------------------
Magazine ajouté: Programmation Aujourd'hui
Magazine ajouté: Les Nouvelles Tech

--- Liste des produits de la librairie (2 éléments) ---
MagazineCode: M001, Titre: Programmation Aujourd'hui, Prix HT: 7.99$ (Mois: 12, Numéro: 150)
MagazineCode: M002, Titre: Les Nouvelles Tech, Prix HT: 5.0$ (Mois: 1, Numéro: 151)
-------------------------------------------------------------------

*** Total des prix TTC de tous les produits: 13.64€ ***

--- Test de recherche réussie (M001) ---
Produit trouvé: Programmation Aujourd'hui

--- Test de recherche qui échoue (X999) ---
Géré: Le produit avec le code 'X999' n'a pas été trouvé dans la librairie.

--- Test de suppression (M002) ---
Produit supprimé: Les Nouvelles Tech

--- Liste des produits de la librairie (1 éléments) ---
MagazineCode: M001, Titre: Programmation Aujourd'hui, Prix HT: 7.99$ (Mois: 12, Numéro: 150)
-------------------------------------------------------------------

