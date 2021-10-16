package fr.stephen.raytano;

public  class Enseignant {
	
	private String Prenom;
	private String Nom;
	private String Programme_Universitaire;
	//private String Programme_Universitaire;
	
	private static int Nombre_Heure;
	
	// C+reation du Constructeur Enseignant
	public Enseignant(String Teacher_Surname , String Teacher_Name , String University_Program , int Hour) {
		
		this.Prenom =Teacher_Surname;
		this.Nom = Teacher_Name;
		this.Nombre_Heure = Hour;
		this.Programme_Universitaire = University_Program;
		Programme Test = Programme.valueOf(Programme_Universitaire);
		
	}


	public String getPrenom() {
		return Prenom;
	}
	public String getNom() {
		return Nom;
	}



	public int getNombre_Heure() {
		return Nombre_Heure;
	}


//Mutateur pour le nombre d'heure
	
	
	public static void setNombre_Heure(int nombre_Heure) {
		
		
		Nombre_Heure = nombre_Heure;
		
	}
	
//ajout d'heure
	
	public static int AddNombre_Heure(int Ajout)
	{
		int Old_Heure = Nombre_Heure;
		
		Nombre_Heure = Old_Heure + Ajout ;
		
		return Nombre_Heure;
	}
	public String toString()
	{
		return " Teacher name : " + this.Nom + " and his surname is " + this.Prenom + " his course program is " +this.Programme_Universitaire + " he has " + this.Nombre_Heure + " heures";
	}


}
