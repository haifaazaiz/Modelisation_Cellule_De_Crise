import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class Hopital {
        //attributes
	    private String nom,adresse,gouvernerat;
        private int num_reception,nbr_patient;
		//constructors
         public Hopital(){
			try{
			File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Hopital.txt");
            FileWriter writer=new FileWriter(f,true);
            BufferedWriter bw=new BufferedWriter(writer);
            Scanner sc=new Scanner(System.in);
            System.out.println("Veuillez saisir le nom de l'hôpital:");
            String str=sc.next();
            bw.write("Nom:"+str+"\t\t\t");
            this.nom=str;
            System.out.println("Veuillez saisir le gouvernerat de l'hôpital:");
            str=sc.next();
            bw.write("Gouvernerat:"+str+"\t\t\t");
            this.gouvernerat=str;
            System.out.println("Veuillez saisir l'adresse de l'hôpital:");
            str=sc.next();
            bw.write("Adresse:"+str+"\t\t\t");
            this.adresse=str;
            System.out.println("Veuillez saisir le numero de réception de l'hôpital:");
            int n=sc.nextInt();
            bw.write("Numero:"+n+"\t\t\t");
            this.num_reception=n;
            System.out.println("Veuillez saisir le nombre de patients dans l'hôpital:");
            n=sc.nextInt();
            bw.write("Nombre_Patients:"+n+"\n");
            this.nbr_patient=n; 
            bw.close();
            writer.close();}
			catch (IOException e){e.printStackTrace();}
		}
         public Hopital(String nom, String adresse, String gouvernerat, int num_reception,int nbr_patient) {
 			this.nom = nom;
 			this.adresse = adresse;
 			this.gouvernerat = gouvernerat;
 			this.num_reception = num_reception;
 			this.nbr_patient=nbr_patient;
 		}
         //getters and setters
         public int getNbr_patient() {
			return nbr_patient;
		}
		public void setNbr_patient(int nbr_patient) {
			this.nbr_patient = nbr_patient;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getGouvernerat() {
			return gouvernerat;
		}
		public void setGouvernerat(String gouvernerat) {
			this.gouvernerat = gouvernerat;
		}
		public int getNum_reception() {
			return num_reception;
		}
		public void setNum_reception(int num_reception) {
			this.num_reception = num_reception;
		}
		//display
		public String toString() {
			return "Hopital [nom=" + nom + ", adresse=" + adresse + ", gouvernerat=" + gouvernerat + ", num_reception="
					+ num_reception +", nombre_patients=" + nbr_patient +"]";
		}
}
