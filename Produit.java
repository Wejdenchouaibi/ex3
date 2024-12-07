package tn.tuniprod.gestionmagasin;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        setPrix(prix);  // On utilise le setter pour appliquer la validation
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif.");
        }
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
