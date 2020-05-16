import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import java.io.IOException;
public class Medecin extends Personne{
        //attributes
	    private String spécialité;
        //constructors
	    public Medecin (){
        	super("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Medecin.txt");
        	try{
    			File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Medecin.txt");
                FileWriter writer=new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(writer);
                Scanner sc=new Scanner(System.in);
                System.out.println("Veuillez saisir la spécialité:");
                String str=sc.next();
                bw.write("specialite:"+str+"\n");
                this.spécialité=str;
                bw.close();
                writer.close();
        	}
        	catch(IOException e){e.printStackTrace();}
        }
		public Medecin(String nom, String prenom, String sexe, String gouvernerat, String adresse,
				int num_carte_identite, int num_tel,String spécialité) {
			super(nom, prenom, sexe, gouvernerat, adresse, num_carte_identite, num_tel);
	        this.spécialité=spécialité;
		}
		//getters and setters
		public String getSpécialité() {
			return spécialité;
		}
		public void setSpécialité(String spécialité) {
			this.spécialité = spécialité;
		}
		//display
		public void afficher() {
			System.out.println( "Medecin [spécialité=" + spécialité + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe
					+ ", gouvernerat=" + gouvernerat + ", adresse=" + adresse + ", num_carte_identite="
					+ num_carte_identite + ", num_tel=" + num_tel + "]");
		}
}
