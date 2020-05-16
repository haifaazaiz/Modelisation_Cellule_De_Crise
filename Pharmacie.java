import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pharmacie {

	  public String nom ;
	  public String adresse ;
	  public String ville ;
	  private int nombre_bavette ;
	  private String [] medicament=null ;
	  public Pharmacie(String nom,String adresse,String ville,int nb,String [] medicament)
	  {
		  this.nom=nom ;
		  this.adresse=adresse ;
		  this.ville=ville ;
		  nombre_bavette=nb  ;
		  this.medicament=medicament;
	  }
	  public Pharmacie() {
		  try {
			  File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Pharmacie.txt");
	             FileWriter writer=new FileWriter(f,true);
	             BufferedWriter bw=new BufferedWriter(writer);
	             Scanner sc=new Scanner(System.in);
	             System.out.println("Veuillez saisir le nom:");
	             String str=sc.next();
	             bw.write("nom:"+str+"\t\t");
	             this.nom=str;
	             System.out.println("Veuillez saisir la ville:");
	             str=sc.next();
	             bw.write("ville:"+str+"\t\t");
	             this.ville=str;
	             System.out.println("Veuillez saisir l'adresse:");
	             str=sc.next();
	             bw.write("adresse:"+str+"\t\t");
	             this.adresse=str;
	             System.out.println("Veuillez le nombre de bavette disponible:");
	             int i=sc.nextInt() ;
	             bw.write("nbr_bavette_dispo:"+i+"\t\t");
	             this.nombre_bavette=i;
	             System.out.println("Veuillez saisir le 1er medicament:");
	             str =sc.next();
	             bw.write("medicament:"+str+"\t\t");    
	             System.out.println("Veuillez saisir le 2eme medicament:");
	             str =sc.next();
	             int compt=2 ;
	             while (!(str.equals("nul")))
	             {   
	            	 bw.write("medicament"+compt+":"+str+"\t\t");
	            	 compt++ ;
	            	 System.out.println("Veuillez saisir le "+compt+"eme medicament:");
	                 str =sc.next();
	             }
	             bw.write("\n");
	             bw.close();
	             writer.close();
		      }
		  catch (IOException e) {e.printStackTrace(); }	  
	  }
	  
	  public void  afficher() 
	  {
		  System.out.println("Nom : "+nom) ;
		  System.out.println("Ville : "+ville) ;
		  System.out.println("Adresse : "+ville) ;
		  System.out.println("Nombre de bavette disponible : "+nombre_bavette) ;
		  System.out.println("Les medicament disponible :"+medicament) ;
	  }
	public int getNombre_bavette() {
		return nombre_bavette;
	}
	public void setNombre_bavette(int nbr_bavette_dispo) {
		this.nombre_bavette = nombre_bavette;
	}
	public String [] getMedicament() {
		return medicament;
	}
	public void setMedicament(String[] medicament) {
		this.medicament = medicament;
	}	
	public String getAdresse() {
		return adresse;
	}
	public void setAsresse (String adresse) {
		this.adresse = adresse;
	}	  
}