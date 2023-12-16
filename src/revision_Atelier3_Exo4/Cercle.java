package revision_Atelier3_Exo4;

import static java.lang.Math.PI;

public class Cercle extends Point {
	
	private double rayon;
	
	
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Cercle()
	{
		super(0,0);
		this.rayon=0;
	}
	
	public Cercle(int x, int y,double rayon)
	{
		super(x,y);
		this.rayon = rayon ;
	}

	@Override
	public String toString() {
		return super.toString() + "rayon=" + rayon;
	}
	
	public double calculerAir()
	{
		
		return PI * Math.pow(rayon, 2);
	}
	
	public double calculerPerimeter()
	{
		return 2*PI*rayon;
	}
	

}
