import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hotel_confinement {
	
	 private String nom ;
	 private String prenom ;
	 private int numero_hotel ;
	 private int cin ;
	 private String nom_hotel ;
	 private String adresse_hotel ;
	 private String date_entree ;
	 private String date_sortie ;
	 static int nbr ;
	 public Hotel_confinement(String nom,String prenom,int numero_hotel,int cin ,String nom_hotel,String adresse_hotel)
	 {
		 this.nom=nom ;
		 this.prenom=prenom ;
		 this.numero_hotel=numero_hotel ;
		 this.cin=cin ;
		 this.nom_hotel=nom_hotel ;
		 this.adresse_hotel=adresse_hotel ;
		 nbr++ ;
	 }
	 public Hotel_confinement() throws IOException
	 {
		try { File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Hotel_confinement.txt");
         FileWriter writer=new FileWriter(f,true);
         BufferedWriter bw=new BufferedWriter(writer);
         Scanner sc=new Scanner(System.in);
         System.out.println("Veuillez saisir le nom:");
         String str=sc.next();
         bw.write("nom:"+str+"\t\t");
         this.nom=str;
         System.out.println("Veuillez saisir le prenom:");
         str=sc.next();
         bw.write("prenom:"+str+"\t\t");
         this.prenom=str;
         System.out.println("Veuillez saisir le numero_hotel:");
         int i=sc.nextInt();
         bw.write("numero_hotel:"+i+"\t\t");
         this.numero_hotel=i;
         System.out.println("Veuillez saisir le numero_cin:");
         i=sc.nextInt();
         bw.write("numero_cin:"+i+"\t\t");
         this.cin=i;
         System.out.println("Veuillez saisir l'adresse de l'hotel:");
         str=sc.next();
         bw.write("adresse_hotel:"+str+"\t\t");
         this.adresse_hotel=str;
         System.out.println("Veuillez saisir la date d'entree:");
         str=sc.next();
         bw.write("date_entree:"+str+"\t\t");
         this.date_entree=str;
         System.out.println("Veuillez saisir la date de sortie");
         str=sc.next();
         bw.write("date_sortie:"+str+"\n");
         this.date_sortie=str;
         nbr++ ;
         bw.close();
         writer.close();
		}
		
	 catch(IOException e) {e.printStackTrace();}
	 }
	 void afficher()
	 {
		 System.out.println("nom: "+this.nom) ;
		 System.out.println("prenom: "+this.prenom) ;
		 System.out.println("numero d'hotel: "+this.numero_hotel) ;
		 System.out.println("cin: "+this.cin) ;
		 System.out.println("nom d'hotel: "+this.nom_hotel) ;
		 System.out.println("adresse hotel: "+this.adresse_hotel) ;
	 }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumero_hotel() {
		return numero_hotel;
	}
	public void setNumero_hotel(int numero) {
		this.numero_hotel = numero;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom_hotel() {
		return nom_hotel;
	}
	public void setNom_hotel(String nom_hotel) {
		this.nom_hotel = nom_hotel;
	}
	public String getAdresse_hotel() {
		return adresse_hotel;
	}
	public void setAdresse_hotel(String adresse_hotel) {
		this.adresse_hotel = adresse_hotel;
	}
	public String getDate_entree() {
		return date_entree;
	}
	public void setDate_entree(String date_entree) {
		this.date_entree = date_entree;
	}
	public String getDate_sortie() {
		return date_sortie;
	}
	public void setDate_sortie(String date_sortie) {
		this.date_sortie = date_sortie;
	}
}
