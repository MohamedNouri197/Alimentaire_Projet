import java.util.ArrayList;
import java.util.List;

public class Magasin {
    int identifiant;
    String adresse;
    String capactie_mag;
    Produit[] produits = new Produit[50];

    int nbProduits = 0;

    public Magasin(int identifiant, String adresse, String capactie_mag) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capactie_mag = capactie_mag;

    }

    public void AjouterProduit(Produit p) {
        if (!ComparerProduit(p)){
            if (p.prix > 0) {
                produits[nbProduits] = p;
                nbProduits++;
            } else {
                System.out.println("le prix doit etre positive");
            }
        }



    }

    public void Afficher() {
        String ch1 = "";
        StringBuilder ch2 = new StringBuilder();
        ch1 = "Magasin :" + " identifiant " + identifiant + " adresse " + adresse + " capacite_mag " + capactie_mag + "}";

        for (int i = 0; i < nbProduits; i++) {
            if (produits[i] != null) {
                ch2.append(produits[i].toString());
            }
        }
        System.out.println(ch1 + ch2);
    }

    ////////// total produits par magasin donner
    public int TotalProduit() {
        return nbProduits;

    }

    ////////////// comparer par produit donner
    public boolean ComparerProduit(Produit p) {
        boolean ok = false;
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i] == p) {
                ok = true;
                break;
            }
        }
        return ok;

    }

    public boolean ComparerDeuxProduit(Produit p, Produit p1) {
        boolean ok = false;
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i] == p || produits[i] == p1) {
                ok = true;
                break;
            }
        }
        return ok;

    }

    public boolean ChercherProduit(Produit p) {
        boolean ok = false;
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i] == p) {
                ok = true;
                break;
            }
        }
        return ok;

    }
    public void SupprimerProduit(Produit p) {
        boolean ok = false;
       if (ChercherProduit(p)){
           for (int i=0; i<nbProduits;i++){
               produits[i]=null;
           }

       }


    }

    public int PlusGrandMagasin(Magasin mg1,Magasin mg2){
        if (mg1.nbProduits>mg2.nbProduits){
            return  mg1.identifiant;
        }
        else {
         return    mg2.identifiant;
        }
    }
}

