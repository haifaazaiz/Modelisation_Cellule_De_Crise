import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Organisation {
	  protected  String nom;
	  protected String adresse_org,gouvernerat_org;
	  protected int numero_tel;
      protected boolean disponibilité;
      
      
      public Organisation() {
	      try{
	    	   File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Organisation.txt");
	    	   FileWriter writer=new FileWriter(f,true);
	           BufferedWriter bw=new BufferedWriter(writer);
	           Scanner sc = new Scanner(System.in);
	           System.out.println("Veuillez saisir le nom de l'organisation :");
	           String adr = sc.next();
	           bw.write("Nom:"+adr+"\t\t\t");
	           System.out.println("Veuillez saisir la disponibilité de l'organisation à cet instant :");
	           String disp = sc.next();
	           bw.write("Disponibilite:"+disp+"\t\t\t");
	           if(disp=="disponible")
	               this.disponibilité=true;
	           else 
	        	   this.disponibilité=false;
	           System.out.println("Veuillez saisir le numéro de l'organisation :");
	           int num = sc.nextInt();
	           bw.write("Numero:"+num+"\t\t\t");
	           this.numero_tel=num;
	           System.out.println("Veuillez saisir le gouvernerat de l'organisation :");
	           adr = sc.next();
	           bw.write("Gouvernerat:"+adr+"\t\t\t");
	           System.out.println("Veuillez saisir l'adresse de l'organisation :");
	           adr = sc.next();
	           bw.write("Adresse:"+adr+"\n");
	           bw.close();
	          writer.close();
	         }
	       catch (IOException e){e.printStackTrace();}}
   
 
       
       public Organisation(String nom, String adresse_org, String gouvernerat_org,
			int numero_tel, boolean disponibilité) {
		super();
		this.nom = nom;
		this.adresse_org = adresse_org;
		this.gouvernerat_org = gouvernerat_org;
		this.numero_tel = numero_tel;
		this.disponibilité = disponibilité;
	}



	//les Getters et  les Setters//
      public  String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
    public String getadresse_org() {
		return adresse_org;
	}
	public void setadresse_org(String adresse_org) {
		this.adresse_org = adresse_org;
	}
	
	
	
	public int getNumero_tel() {
		return numero_tel;
	}
	public void setNumero_tel(int numero_tel) {
		this.numero_tel = numero_tel;
	}
	
	public int getNumero_Tel() {
		return numero_tel;
	}

	public void setNumero_Tel(int numero) {
		this.numero_tel = numero;
	}

	public boolean getDisponibilité() {
		return disponibilité;
	}

	public void setDisponibilité(boolean disponibilité) {
		this.disponibilité = disponibilité;
	}



	public String getAdresse_org() {
		return adresse_org;
	}



	public void setAdresse_org(String adresse_org) {
		this.adresse_org = adresse_org;
	}



	public String getGouvernerat_org() {
		return gouvernerat_org;
	}



	public void setGouvernerat_org(String gouvernerat_org) {
		this.gouvernerat_org = gouvernerat_org;
	}



}