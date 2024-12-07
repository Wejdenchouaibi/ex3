import tn.tuniprod.gestionmagasin.Produit;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private static int totalProduits = 0;  // Compteur de produits dans tous les magasins

    private int id;
    private String adresse;
    private int capacite;
    private List<Produit> produits;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        // La capacité est limitée à 50, mais vous pouvez ajuster cette logique si vous voulez autoriser plus.
        this.capacite = capacite <= 50 ? capacite : 50;  // Limite à 50 produits si capacite est trop grande
        this.produits = new ArrayList<>();
    }

    public boolean ajouterProduit(Produit produit) {
        if (produit == null) {
            System.out.println("Le produit est invalide.");
            return false;
        }

        if (produits.size() < capacite) {
            produits.add(produit);
            totalProduits++;
            return true;
        } else {
            System.out.println("Le magasin a atteint sa capacité maximale de " + capacite + " produits.");
            return false;
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("ID Magasin: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits:");
        for (Produit produit : produits) {
            System.out.println(" - Nom: " + produit.getNom() + ", Prix: " + produit.getPrix());
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
