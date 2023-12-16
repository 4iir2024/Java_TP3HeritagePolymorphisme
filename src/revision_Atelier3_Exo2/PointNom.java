package revision_Atelier3_Exo2;

public class PointNom extends Point{
	
	private char nom;
	
	PointNom(int x,int y, char nom)
	{
		super(x,y);
		this.nom=nom;
		
	}
	
	
	public char getNom()
	{
		return nom;
	}
	
	public void setNom(char nom)
	{
		this.nom=nom;
	}

}
