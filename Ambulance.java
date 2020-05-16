import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ambulance {
     //attributes
	  private int numero;
      private String gouvernerat,adresse;
      private boolean disponibilite;
    //constructor
     public Ambulance() {  	
	      try{
	    	   File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Ambulance.txt");
	    	   FileWriter writer=new FileWriter(f,true);
	           BufferedWriter bw=new BufferedWriter(writer);
	           Scanner sc = new Scanner(System.in);
	           System.out.println("Veuillez saisir le gouvernerat de l'ambulance:");
	           String adr = sc.next();
	           bw.write("Gouvernerat:"+adr+"\t\t\t"); 
	           this.gouvernerat=adr;
	           System.out.println("Veuillez saisir la disponibilité de l'ambulance à cet instant(Réponse par oui ou non):");
	           String disp = sc.next();
	           bw.write("Disponibilite:"+disp+"\t\t\t");
	           if(disp.equals("oui"))
	               this.disponibilite=true;
	           else 
	        	   this.disponibilite=false;
	           System.out.println("Veuillez saisir le numéro de l'ambulance :");
	           int num = sc.nextInt();
	           bw.write("Numero:"+num+"\t\t\t");
	           this.numero=num;
	           System.out.println("Veuillez saisir l'adresse de l'ambulance:");
	           adr = sc.next();
	           bw.write("Adresse:"+adr+"\n");
	           this.adresse=adr;
	           bw.close();
	           writer.close();
	         }
	       catch (IOException e){e.printStackTrace();}}
      public Ambulance(int numero,String adresse,String gouvernerat, boolean disponibilité) {
		this.numero = numero;
		this.adresse = adresse;
		this.gouvernerat=gouvernerat;
		this.disponibilite= disponibilité;
	}
   //getters and setters
    public int getNumero() {
		return numero;
	}
   public void setNumero(int numero) {
		this.numero = numero;
	}
   public boolean getDisponibilité() {
		return disponibilite;
	}
   public void setDisponibilité(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
   public String getAdresse() {
		return adresse;
	}
   public void setAdresse_patient(String adresse) {
		this.adresse= adresse;
	}
	public String getGouvernerat() {
		return gouvernerat;
	}
	public void setGouvernerat(String gouvernerat) {
		this.gouvernerat = gouvernerat;
	}
	//display
	public String toString() {
		return "Ambulance [numero=" + numero + ", adresse=" + adresse
				+ ", gouvernerat=" + gouvernerat + ", disponibilité="
				+ disponibilite + "]";
	}
    //envoi_ambulance
  
}
	
