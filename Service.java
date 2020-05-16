import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Service {
	public Service(){}
	//service_ambulance
    public void envoi_ambulance(Personne p) throws FileNotFoundException{
 		String [] info_ambulance=null ;
 		String [] cle_valeur=null;
 		boolean disp,gouv;
 		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Ambulance.txt");
 		try {
 			BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
 			String line=reader.readLine();
 			while(line!=null){
 				info_ambulance=line.split("\t\t\t");
 				disp=false;gouv=false;
 				for(int i=0;i<info_ambulance.length;i++){
 					 cle_valeur=info_ambulance[i].split(":");
				          if ((cle_valeur[0].equals("Disponibilite"))&&(cle_valeur[1].equals("oui")))
					        	disp=true;
 					       if ((cle_valeur[0].equals("Gouvernerat"))&&(cle_valeur[1].equals(p.getGouvernerat())))
 					        	gouv=true;
	                    }
 				if (gouv&&disp){
 					System.out.println(line);
 					return;}
 				else
 				    line=reader.readLine();
 				              }
 		        System.out.println("pas d'ambulance disponible à ce moment dans votre gouvernerat");
 		        reader.close();
 		   }
 		catch(IOException e){e.printStackTrace();}
     }
    //S'informer sur l'état de santé d'un malade
	public void service_etat_de_sante () throws FileNotFoundException 
	{   
		System.out.println("Veuillez saisir le numéro de la carte d'identité du patient");
		Scanner sc=new Scanner(System.in);
	    int num_carte_identite=sc.nextInt();
 		String [] info_malade=null ;
 		String [] cle_valeur=null;
 		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Malade.txt");
 		try {
 			BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
 			String line;
 			while((line=reader.readLine())!=null){
 				info_malade=line.split("\t\t\t");
 				for(int i=0;i<info_malade.length;i++){
 					 cle_valeur=info_malade[i].split(":");
				          if ((cle_valeur[0].equals("num_carte_identite"))&&(Integer.parseInt(cle_valeur[1])==(num_carte_identite)))
					        	{info_malade=line.split("\t\t\t");
					        	for(int j=0;j<info_malade.length;j++){
				 					 cle_valeur=info_malade[j].split(":");
				 					 if ((cle_valeur[0].equals("etat_de_sante_actuel"))){
				 							System.out.println(cle_valeur[1]);
					        	            return;}
					        	}
	                     }
 		   }
 			}
 			System.out.println("Cette personne n'existe pas!!");
 			return;
           }
 		catch(IOException e){e.printStackTrace();}
	}
	//service_navette
    String service_navette() throws IOException 
	{    
    	FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Navette.txt");
        System.out.println("Veuillez saisir la ville:");
    	Scanner sc=new Scanner(System.in);
    	String str1=sc.next();
    	String str="ville:"+str1 ;
        System.out.println("Veuillez saisir votre adresse:");
     	String str2=sc.next();
     	  try {
     		   BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
    		    String line;
     			String [] mots=null ;
     			while((line=reader.readLine())!=null)
     			{
     				mots=line.split("\t\t") ;
     				if (mots[0].equals("disponible:True"))
     				{  
     					for(String wrd:mots)
     				      { 
     				     	if (wrd.equals(str))	
     							{
     					
     						     for(String mot:mots)
     						     {
     						    	 
     						    	 return mots[1]+"\t\t"+mots[2]+"\t\t"+mots[3]+"\t\t"+"adresse_arrivee:"+str2 ;
     						     }
     						     
     							}
     			          }
     			
     				reader.close();	
     			
                
     	  }  }   }
     	  catch(IOException e) {e.printStackTrace();}
     		  System.out.println("ville inexissante");
     		return "Ressayer plus tard,merci!" ;	
	}
    //service_hotel_confinement
	void service_hotel_confinement () throws FileNotFoundException
	{   
		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Hotel_confinement.txt");
		
        System.out.println("Veuillez saisir le numero_cin:");
    	Scanner sc=new Scanner(System.in);
    	String str=sc.next();
    	String str1="numero_cin:"+str ;
    	 try {
    		  
    		 BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
    		 String line;
  			String [] mots=null ;
  			while((line=reader.readLine())!=null)
  			{
  				mots=line.split("\t\t") ;
  				for(String wrd:mots)
  				{   
  					if (wrd.equals(str1))	
  							{
  						     System.out.println(line) ;
  						     return;
  							}
  			}
  			}
  			reader.close();		
  			System.out.println("le numero_cin n'existe pas");	
  	  }
  	  catch(IOException e) {e.printStackTrace();}
  		 
	}


	//service_bavette
	String service_bavette() throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Pharmacie.txt");
        System.out.println("Veuillez saisir la ville  :");
    	Scanner sc=new Scanner(System.in);
    	String str=sc.next();
    	String str1="ville:"+str ;
    	 try {
   		  
    		 BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
    		 String line;
   			String [] mots=null ;
   			while((line=reader.readLine())!=null)
   			{
   				mots=line.split("\t\t") ;
   				String [] s=mots[3].split(":") ;
   				if(mots[1].equals(str1) && !( s[1].equals("0")))
   				{   
   					for(String wrd:mots)
   					{   
   						return mots[0]+"\t\t"+mots[2]+"\t\t"+mots[3] ;
   						
   					}
   			reader.close();	
   	  }}}
   	  catch(IOException e) {e.printStackTrace();}  
   	  
   		System.out.println("pas de bavette disponible");
   		return "Ressayer plus tard ,Merci!" ;	
 	
		
	}
	// service_medicament
	String service_medicament() throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Pharmacie.txt");
        System.out.println("Veuillez saisir le medicament:");
    	Scanner sc=new Scanner(System.in);
    	String str1=sc.next();
    	String med="medicament:"+str1 ;
    	System.out.println("Veuillez saisir la ville:");
    	String str2=sc.next();
    	String ville="ville:"+str2 ;
    	 try {
   		  
    		 BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
    		 String line;
    		 String [] mots=null ;
   			while((line=reader.readLine())!=null)
   			{
   				mots=line.split("\t\t") ;
                for(String wrd1:mots)
                {
   							if (wrd1.equals(ville))
   							{
   								for(String wrd2:mots)
   								{
   									if(wrd2.equals(med))
   									{
   										for(String wrd3:mots)
   										{
   											return mots[0]+"\t\t"+mots[1]+"\t\t"+mots[2] ;
   										}
   									}
   										
   								}
   						}
   					
   					
   			}   }
   			reader.close();		
   	  }
   	  catch(IOException e) {e.printStackTrace();}
   	  System.out.println("le medicament est introuvable pour le moment");
   	  return "Ressayer plus tard,merci!" ;	
	}
	
	//service demande du psy //
	public void  service_psy (Personne p) throws FileNotFoundException
	{
	
		
		 		String [] info_psy=null ;
		 		String [] cle_valeur=null;
		 		boolean spec,adr;
		 		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Medecin.txt");
		 		try {
		 			BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
		 			String line=reader.readLine();
		 			while(line!=null){
		 				info_psy=line.split("\t\t\t");
		 				spec=false;adr=false;
		 				for(int i=0;i<info_psy.length;i++)
		 				{
		 					 cle_valeur=info_psy[i].split(":");
						          if ((cle_valeur[0].equals("specialite"))&& (cle_valeur[1].equals("psy")))
						        	  spec=true;
						          if ((cle_valeur[0].equals("gouvernerat"))&&(cle_valeur[1].equals(p.getGouvernerat())))
		 					        	adr=true;
						}
		 				if (spec && adr) {
		 					 System.out.println("voilà toutes les informations du psy, veuillez lui contacter immédiatement  **");
		 					 System.out.println(line);return;}
		 				else
		 				    line=reader.readLine();
		 				              }
		 		          }
		 		   	catch(IOException e){e.printStackTrace();}
		 		    System.out.println("Pas de psy trouvé dans votre gouvernerat");
	}
	//Fournir l'aide à partir d'une organisation
	
		 public void aider (Personne p) throws FileNotFoundException{
		 		String [] info_organisation=null ;
		 		String [] cle_valeur=null;
		 		boolean disp,gouv;
		 		FileInputStream f=new FileInputStream("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Organisation.txt");
		 		try {
		 			BufferedReader reader =new BufferedReader (new InputStreamReader(f,"UTF-8"));
		 			String line=reader.readLine();
		 			while(line!=null){
		 				info_organisation=line.split("\t\t\t");
		 				disp=false;gouv=false;
		 				for(int i=0;i<info_organisation.length;i++){
		 					 cle_valeur=info_organisation[i].split(":");
						          if ((cle_valeur[0].equals("Disponibilite"))&&(cle_valeur[1].equals("disponible")))
							        	disp=true;
						          if ((cle_valeur[0].equals("Gouvernerat"))&&(cle_valeur[1].equals(p.getGouvernerat())))
		 					        	gouv=true;
		 					      
			                    }
		 				if (disp && gouv){
		 					System.out.println(line);
		 					return;}
		 				else
		 				    line=reader.readLine();
		 				              }
		 		        System.out.println("Contactez nous plus tard!");
		 		        reader.close();
		 		   }
		 		catch(IOException e){e.printStackTrace();}
		     }
		
		
}