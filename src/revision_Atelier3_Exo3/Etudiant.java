package revision_Atelier3_Exo3;

public class Etudiant extends Personne {
	
	private String cne;
	
	public Etudiant()
	{
		super(null,null,null,0);
		this.cne=null;
	}
	public Etudiant(String nom, String prenom, String cin, int age,String cne)
	{
		super(nom,prenom,cin,age);
		this.cne=cne;
	}
	
	
	
	

	public String getCne() {
		return cne;
	}



	public void setCne(String cne) {
		this.cne = cne;
	}
	
	
	public void afficherInformation()
	{
		 super.afficherInformation(); 
		 System.out.println("et le cne : "+cne);
		
	}
	
	

	


	public static void main(String[] args) {
		
	
		Etudiant etudiant1 = new Etudiant("Anas","Rawi","Bk394202",24,"CC-343223");
		Etudiant etudiant2 = new Etudiant("Taha","Ramzi","Bk332202",22,"CC-343453");
		
		Personne personne1 = new Personne("Karim","Alami","Bd237292",34);
		Personne personne2 = new Personne("Brahim","Saraj","Bd233492",37);
		
		System.out.println("-----------Etudiants--------------");
		
		
		etudiant1.afficherInformation();
		etudiant2.afficherInformation();
		
		System.out.println("-----------Personnes--------------");
		
		personne1.afficherInformation();
		personne2.afficherInformation();

	}

}
