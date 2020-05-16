import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Personne {
        protected String nom,prenom,sexe,gouvernerat,adresse;
        protected int num_carte_identite,num_tel;
	    public Personne(String lienFichier) {
          try{
        	 File f=new File(lienFichier);
             FileWriter writer=new FileWriter(f,true);
             BufferedWriter bw=new BufferedWriter(writer);
             Scanner sc=new Scanner(System.in);
             System.out.println("Veuillez saisir le nom:");
             String str=sc.next();
             bw.write("nom:"+str+"\t\t\t");
             this.nom=str;
             System.out.println("Veuillez saisir le prénom:");
             str=sc.next();
             bw.write("prenom:"+str+"\t\t\t");
             this.prenom=str;
             System.out.println("Veuillez saisir le numero de la carte d'identité:");
             int n=sc.nextInt();
             bw.write("num_carte_identite:"+n+"\t\t\t");
             this.num_carte_identite=n;
             System.out.println("Veuillez saisir le sexe:");
             str=sc.next();
             bw.write("sexe:"+str+"\t\t\t");
             this.sexe=str;
             System.out.println("Veuillez saisir la gouvernerat:");
             str=sc.next();
             bw.write("gouvernerat:"+str+"\t\t\t");
             this.gouvernerat=str;
             System.out.println("Veuillez saisir l'adresse:");
             str=sc.next();
             bw.write("adresse:"+str+"\t\t\t");
             this.adresse=str;
             System.out.println("Veuillez saisir le numero de telephone:");
             n=sc.nextInt();
             bw.write("num_tel:"+n+"\t\t\t");
             this.num_tel=n;
             bw.close();
             writer.close();}
           catch(IOException e){e.printStackTrace();}
        }
        public Personne(String nom, String prenom, String sexe, String gouvernerat, String adresse,
				int num_carte_identite,int num_tel) {
			this.nom = nom;
			this.prenom = prenom;
			this.sexe = sexe;
			this.gouvernerat = gouvernerat;
			this.adresse = adresse;
			this.num_carte_identite = num_carte_identite;
			this.num_tel=num_tel;
		}
		public int getNum_tel() {
			return num_tel;
		}
		public void setNum_tel(int num_tel) {
			this.num_tel = num_tel;
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
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		public String getGouvernerat() {
			return gouvernerat;
		}
		public void setGouvernerat(String gouvernerat) {
			this.gouvernerat = gouvernerat;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public int getNum_carte_identite() {
			return num_carte_identite;
		}
		public void setNum_carte_identite(int num_carte_identite) {
			this.num_carte_identite = num_carte_identite;
		}
		public void afficher() {
			System.out.println( "Personne [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", gouvernerat=" + gouvernerat
					+ ", adresse=" + adresse + ", num_carte_identite=" + num_carte_identite + "]");
		}
		        
}