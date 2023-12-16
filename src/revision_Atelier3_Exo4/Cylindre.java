package revision_Atelier3_Exo4;

public class Cylindre extends Cercle {
	
	
	private double hauteur;

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public Cylindre(int x, int y,double rayon,double hauteur)
	{
		super(x,y,rayon);
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		return super.toString() + " hauteur=" + hauteur ;
	}
	
	public double calculerAir()
	{
		return super.calculerPerimeter()* hauteur;
	}
	

	public double calculerVolume()
	{
		return super.calculerAir() * hauteur;
	}
	
	public double calculerPerimeter()
	{
		return super.calculerAir()*2;
	}
	
	

}
