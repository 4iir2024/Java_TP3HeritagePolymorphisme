package revision_Atelier3_Exo2;

public class Point {
	
	private int x,y;
	
	public Point(int x,int y)
	{
		this.x =x;
		this.y=y;
		
	}
	
	public static boolean identiques(Point a,Point b)
	{
		return ((a.x==b.x)&&(a.y==b.y));
	}
	public boolean identique (Point a)
	{
		return (a.x==x) && (a.y==y);
	}

}
