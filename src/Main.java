import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       LocalDate date=LocalDate.now();
        Produit p=new Produit(1021,"Lait","Delice",0.700f,date);
        Produit p1=new Produit(2510,"Yaourt","Vitalait",1.700f,date);
        Produit p2=new Produit(3250,"Tomate","Sicam",1.200f,date);
        Produit p3=new Produit();
        p.afficher();

  Magasin mg1=new Magasin(102,"tunis","tres grand");
  mg1.AjouterProduit(p);
//  mg1.AjouterProduit(p1);
  mg1.Afficher();
  Magasin mg2=new Magasin(1223,"ariana","grand");
    mg2.AjouterProduit(p2);


      System.out.println("Nombre de produits dans magasin  "+ mg1.adresse +" "+mg1.TotalProduit());
///////////////// prosit 3
      System.out.println("le produit est existe "+mg1.ComparerProduit(p)) ;
      System.out.println("l un des deux produits est existe "+mg1.ComparerDeuxProduit(p3,p3)) ;
      System.out.println("le produit est existe "+mg1.ChercherProduit(p3)) ;
   //   mg2.AjouterProduit(p1);
        mg2.Afficher();
        System.out.println("/////////////////////////////////////////");
   // mg2.SupprimerProduit(p1);

     mg2.Afficher();
     System.out.println("le plus grand magazin et "+mg2.PlusGrandMagasin(mg1,mg2));

    }
}