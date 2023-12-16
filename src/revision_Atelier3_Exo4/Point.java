package revision_Atelier3_Exo4;

public class Point {

	private int x,y;

	
	public Point(int x, int y)
	{
		this.x = x ;
		this.y = y ;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point x=" + x + ", y=" + y ;
	}
	
	public double calculerAir()
	{
		return 0;
	}
	
	public double calculerVolume()
	{
		return 0;
	}
	
	public double calculerPerimeter()
	{
		return 0;
	}
	
	public void afficherNom()
	{
		System.out.println(this.getClass().getSimpleName());

	}
	
}
