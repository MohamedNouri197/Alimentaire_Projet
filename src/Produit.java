import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Produit {
    int identifiant;
    String libelle;
    String marque;
    float prix;
    LocalDate date_expiration;

    public Produit(int identifiant, String libelle, String marque, float prix, LocalDate date_expiration) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_expiration=date_expiration;
    }

    public Produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }
    public Produit(){}

    public void afficher(){
        System.out.println(" Identifiant "+ identifiant+" libelle "+libelle+" marque "+marque +" prix "+prix+"  date  "+date_expiration);
    }


    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", date_expiration=" + date_expiration +
                '}';
    }
}
