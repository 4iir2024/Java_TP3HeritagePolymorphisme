package revision_Atelier3_Exo4;

public class TestForm {

	public static void main(String[] args) {
		
		Point p1 = new Point(5,5);
		Cercle ce1 = new Cercle(10,15,8.5);
		Cylindre cy1 = new Cylindre(30,30,12.5,20);
		
		
		p1.afficherNom();
		System.out.println(p1.toString());
		System.out.println("Perimtre => " + p1.calculerPerimeter());
		System.out.println("Air => " + p1.calculerAir());
		System.out.println("Volume => " + p1.calculerVolume());
		System.out.println("----------------------------------");
		
		
		ce1.afficherNom();
		System.out.println(ce1.toString());
		System.out.println("Perimtre => " + ce1.calculerPerimeter());
		System.out.println("Air => " + ce1.calculerAir());
		System.out.println("Volume => " + ce1.calculerVolume());
		System.out.println("----------------------------------");
		
		cy1.afficherNom();
		System.out.println(cy1.toString());
		System.out.println("Perimtre => " + cy1.calculerPerimeter());
		System.out.println("Air => " + cy1.calculerAir());
		System.out.println("Volume => " + cy1.calculerVolume());
		System.out.println("----------------------------------");
	}

}
