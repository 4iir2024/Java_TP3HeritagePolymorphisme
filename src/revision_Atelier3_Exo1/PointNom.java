package revision_Atelier3_Exo1;

public class PointNom extends Point {
	
	private String nom;
	
	public PointNom(int x,int y,String nom)
	{
		super(x,y);
		this.nom = nom;
		
	}
	
	public void affiche()
	{
		super.affiche();
		System.out.println("\t et le nom :"+ nom); 
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}

}
