
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Navette 
{

	private String ville ;
	private int numero_tel ;
	private String adresse_depart ;
	static int nbr_navette ;
	private boolean disponble ;
	
	public Navette(String ville,int numero_tel,String adresse_depart)
	{
		this.ville=ville ;
		this.numero_tel=numero_tel ;
		this.adresse_depart=adresse_depart ;
		nbr_navette++ ;
	}	
	public Navette ()
	{
		try {
			 File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Navette.txt");
             FileWriter writer=new FileWriter(f,true);
             BufferedWriter bw=new BufferedWriter(writer);
             Scanner sc=new Scanner(System.in);
             bw.write("disponible:True"+"\t\t");
             this.disponble=true ;
             System.out.println("Veuillez saisir la ville:");
             String str=sc.next();
             bw.write("ville:"+str+"\t\t");
             this.ville=str;
             System.out.println("Veuillez saisir le numero de tel:");
             int s =sc.nextInt();
             bw.write("numero_tel:"+s+"\t\t");
             this.numero_tel=s;
             System.out.println("Veuillez saisir l'adresse de depart:");
             str=sc.next();
             bw.write("adresse_depart:"+str+"\t\t\n");
             this.adresse_depart=str;
             nbr_navette++ ;
             bw.close();
             writer.close();	
		}
		catch(IOException e) {e.printStackTrace();}
	}
    public void afficher()
    {
    	System.out.println("ville: "+this.ville) ;
    	System.out.println("numero tel: "+this.numero_tel) ;
    	System.out.println("adresse_depart: "+this.adresse_depart) ;	
    }
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdresse_depart() {
		return adresse_depart;
	}
	public void setAdresse_depart(String adresse_depart) {
		this.adresse_depart = adresse_depart;
	}
	public void setNumero_tel(int numero_tel) {
		this.numero_tel = numero_tel;
	}
    int getNumero_tel()
    {
	   return this.numero_tel ;
    }
	public boolean isDisponble() {
		return disponble;
	}
	public void setDisponble(boolean disponble) {
		this.disponble = disponble;
	}
    
    
    

}
