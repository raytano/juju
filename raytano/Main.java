package fr.stephen.raytano;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println ("Welcome to Our School Program");	
		
		// enseignant avec les memes nombres de paramtre 
		Enseignant enseignant1 = new Enseignant("Konan", "Luck", "Mathematique", 0);
		
		Enseignant enseignant2 = new Enseignant("Jouflu", "Robert", "Mathematique", 0);
		
		System.out.println("Prenom et Nom du premier enseignant : " + enseignant1.getPrenom() + " " + enseignant1.getNom());
		System.out.println("Prenom et Nom du deuxieme enseignant : " + enseignant2.getPrenom() + " " + enseignant2.getNom());
		
		finalisation();
		

	}
	
	//metghode 
	static void finalisation()
	{
		//definir l'heur du Premier Enseignat
		Enseignant enseignant2 = new Enseignant("Jouflu", "Robert", "Mathematique", 0);
		System.out.print("Combien d'heures choisissez vous pour le Deuxieme enseignant : ");
		Scanner Save = new Scanner(System.in);
		int nombre_Heure = Save.nextInt();
		Enseignant.setNombre_Heure(nombre_Heure);
		System.out.println("\n L'enseignant : " + enseignant2.getPrenom() + " " + enseignant2.getNom() + " \n\ta pour heure d'enseignement => " + enseignant2.getNombre_Heure() + " heures");
		
		  
		//Ajout d'heure au second enseignat
		
		Enseignant enseignant1 = new Enseignant("Jouflu", "Robert", "Mathematique", 10);
		System.out.print("45 heures ont ete ajoute de plus sur l'ancienne heure d'enseignement du Premier Enseignant : ");
		int new_nombre_Heure = 45;
		Enseignant.AddNombre_Heure(new_nombre_Heure);
		
		System.out.println("\nAlors L'enseignant : " + enseignant1.getPrenom() + " " + enseignant1.getNom() + " \n\ta pour heure d'enseignement maintenant => " + enseignant1.getNombre_Heure() + " heures");
		
		

	}
	
	
	

}
