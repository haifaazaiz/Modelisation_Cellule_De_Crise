import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Symptome {
		//attributes
	    private int fievre; 
	    private boolean sensation_fatigue;
	    private boolean toux;
	    private boolean maux_gorge;
	    private boolean diharrees ;
	    private boolean hemoptysie ;
	  //constructors
	    public Symptome() {
          try{
  	    	File f1=new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Malade.txt");
	    	FileWriter w=new FileWriter(f1,true);
	    	BufferedWriter b=new BufferedWriter(w);
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Repondez par oui ou non aux questions suivantes concernant les symptômes");
	    	System.out.println("Quelle est la température corporelle du patient?");
	    	int n=sc.nextInt();
	    	b.write("Symptômes:fievre="+n+"°,");
	    	System.out.println("A_t_il une sensation de fatigue?");
	    	boolean v=sc.nextBoolean();
	    	if (v){
	    		  b.write("sensation_fatigue,");
	    		  this.sensation_fatigue=true;
	    	}
	    	else this.sensation_fatigue=false; 
	    	System.out.println("A_t_il de la toux?");
	    	v=sc.nextBoolean();
	    	if (v){
	    		  b.write("toux,");
	    		  this.toux=true;
	    	}
	    	else this.toux=false; 
	    	System.out.println("A_t_il des maux de gorge?");
	    	v=sc.nextBoolean();
	    	if (v){
	    		  b.write("maux_gorge,");
	    		  this.maux_gorge=true;
	    	}
	    	else this.maux_gorge=false; 
	    	System.out.println("A_t_il des diharrées?");
	    	v=sc.nextBoolean();
	    	if (v){
	    		  b.write("diharrees,");
	    		  this.diharrees=true;
	    	}
	    	else this.diharrees=false; 
	    	System.out.println("A_t_il de l'hemoptysie?");
	    	v=sc.nextBoolean();
	    	if (v){
	    		  b.write("hemoptysie\t\t\t");
	    		  this.hemoptysie=true;
	    	}
	    	else this.hemoptysie=false; 
	    	b.close();
	    	w.close();}
	    	catch(IOException e){e.printStackTrace();}
	    }
	    public Symptome(int fievre, boolean sensation_fatigue, boolean toux, boolean maux_gorge, boolean diharrees,
				boolean hemoptysie) {
			super();
			this.fievre = fievre;
			this.sensation_fatigue = sensation_fatigue;
			this.toux = toux;
			this.maux_gorge = maux_gorge;
			this.diharrees = diharrees;
			this.hemoptysie = hemoptysie;
		}
	    //getters and setters
		public int getFievre() {
			return fievre;
		}
		public void setFievre(int fievre) {
			this.fievre = fievre;
		}
		public boolean getSensation_fatigue() {
			return sensation_fatigue;
		}
		public void setSensation_fatigue(boolean sensation_fatigue) {
			this.sensation_fatigue = sensation_fatigue;
		}
		public boolean getToux() {
			return toux;
		}
		public void setToux(boolean toux) {
			this.toux = toux;
		}
		public boolean getMaux_gorge() {
			return maux_gorge;
		}
		public void setMaux_gorge(boolean maux_gorge) {
			this.maux_gorge = maux_gorge;
		}
		public boolean getDiharrees() {
			return diharrees;
		}
		public void setDiharrees(boolean diharrees) {
			this.diharrees = diharrees;
		}
		public boolean getHemoptysie() {
			return hemoptysie;
		}
		public void setHemoptysie(boolean hemoptysie) {
			this.hemoptysie = hemoptysie;
		}
       //display
		public String toString() {
			return "Symptome [fievre=" + fievre + ", sensation_fatigue="
					+ sensation_fatigue + ", toux=" + toux + ", maux_gorge="
					+ maux_gorge + ", diharrees=" + diharrees + ", hemoptysie="
					+ hemoptysie + "]";
		}
}
