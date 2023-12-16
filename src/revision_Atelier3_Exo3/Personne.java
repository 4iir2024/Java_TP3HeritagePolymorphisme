package revision_Atelier3_Exo3;

public class Personne {
	
	private String nom,prenom,cin;
	private int age;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public void afficherInformation() {
	 System.out.println(" Les informations de personne son  nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", age=" + age );	
	}
	public Personne(String nom, String prenom, String cin, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.age = age;
	}
	
	
	

}
