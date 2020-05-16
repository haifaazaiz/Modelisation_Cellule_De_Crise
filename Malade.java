import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class Malade extends Personne {
	   //attributes
	    private Symptome symptome;
        private String resultat_test,etat_de_sante_actuel;
        private Hopital hopital;
		//constructors
        public Malade() throws FileNotFoundException {
			super("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Malade.txt");
			try{
			File f=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Malade.txt");
            FileWriter writer=new FileWriter(f,true);
            BufferedWriter bw=new BufferedWriter(writer);
            Scanner sc=new Scanner(System.in);
            System.out.println("Veuillez saisir le résultat du test:");
            String str=sc.next();
            bw.write("\t\t\t resultat test:"+str+"\t\t\t");
            this.resultat_test=str;
            System.out.println("Veuillez saisir l'état de santé actuel du patient:");
            str=sc.next();
            bw.write("etat_de_sante_actuel:"+str+"\t\t\t");
            this.etat_de_sante_actuel=str;
            System.out.println("Veuillez saisir les symptomes du patient:");
            Symptome symptome=new Symptome();
            this.symptome=symptome;
            bw.close();
            writer.close();
			}
			catch (IOException e){e.printStackTrace();}
		}
          public Malade(String lienFichier, Symptome symptome,
				String resultat_test, Hopital hopital,String etat_de_santé_actuel) {
			super(lienFichier);
			this.symptome = symptome;
			this.resultat_test = resultat_test;
			this.hopital = hopital;
			this.etat_de_sante_actuel=etat_de_santé_actuel;
		}
       //getters and setters
	   public Hopital getHopital() {
			return hopital;
		}
	    public void setHopital(Hopital hopital) {
		    this.hopital = hopital;
	    }
       public String getEtat_de_santé_actuel() {
		    return etat_de_sante_actuel;
	    }
	    public void setEtat_de_santé_actuel(String etat_de_santé_actuel) {
		    this.etat_de_sante_actuel = etat_de_santé_actuel;
	    }
	    public String getResultat_test() {
			return resultat_test;
		}
        public void setResultat_test(String resultat_test) {
			this.resultat_test = resultat_test;
		}
        public Symptome getSymptome() {
			return symptome;
		}
        public void setSymptome(Symptome symptome) {
			this.symptome = symptome;
		}
        
		public String getEtat_de_sante_actuel() {
			return etat_de_sante_actuel;
		}
		public void setEtat_de_sante_actuel(String etat_de_sante_actuel) {
			this.etat_de_sante_actuel = etat_de_sante_actuel;
		}
		//display
		public String toString() {
			return "Malade [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe
					+ ", gouvernerat=" + gouvernerat + ", adresse=" + adresse
					+ ", num_carte_identite=" + num_carte_identite
					+ ", num_tel=" + num_tel +", symptome=" + symptome + ", resultat_test="
					+ resultat_test + ", hopital=" + hopital+", etat_de_santé_actuel"+
					etat_de_sante_actuel+"]";
		     }
		//

}     


