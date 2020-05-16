import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Prevention {

//fournir des conseils
	
	  public Prevention () {
		  
		  
		 System.out.println("Ceci quelques conseils qui peuvent vous aider **");
	try {
		File f1 = new File("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Conseils.txt");
		BufferedReader in = new BufferedReader(new FileReader("C://Users/Azaiez Hamed/Desktop/workspace/Projet de programmation/src/Conseils.txt"));
		String line;
		while ((line = in.readLine()) != null)
		{
	      // Afficher le contenu du fichier
			  System.out.println (line);
		}
		in.close();
	}
	
	catch (IOException e1){e1.printStackTrace();}
			 }
			
}
	  
	  
	  
