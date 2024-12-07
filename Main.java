import tn.tuniprod.gestionmagasin.Produit;
public class Main {
    public static void main(String[] args) {
        Magasin magasin1 = new Magasin(1, "123 Rue de Tunis", 50);
        Magasin magasin2 = new Magasin(2, "456 Avenue de Sousse", 50);

        Produit produit1 = new Produit("Produit A", 100.50);
        Produit produit2 = new Produit("Produit B", 200.75);
        Produit produit3 = new Produit("Produit C", 50);  // Le prix négatif sera géré

        // Tentative d'ajout des produits
        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);

        try {
            // Ce produit aura un prix négatif, cela lancera une exception
            magasin2.ajouterProduit(produit3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de l'ajout du produit: " + e.getMessage());
        }

        magasin1.afficherCaracteristiques();
        magasin2.afficherCaracteristiques();

        System.out.println("Nombre total de produits dans tous les magasins : " + Magasin.getTotalProduits());
    }
}
