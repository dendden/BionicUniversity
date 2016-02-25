package app;

public class FiguresMain {

	public static void main(String[] args) {
		AreaInterface figures[] = new AreaInterface[8];
		
		figures[0] = new Square(1.23);
		figures[1] = new Square(4.6);
		figures[2] = new Square(0.85);
		figures[3] = new Rectangle(2,5);
		figures[4] = new Rectangle(11.4,15.98);
		figures[5] = new Circle(6.67);
		figures[6] = new Circle(9);
		figures[7] = new Circle(1.42);
		
//		AreaInterface simpleFigures[] = new AreaInterface[2];
//		simpleFigures[0] = new Square(2);
//		simpleFigures[1] = new Rectangle(3,2);
		
		double generalArea = 0.0;
		
		for ( AreaInterface figure : figures ) {
			generalArea += figure.calculateArea();
		}
		
		System.out.printf("General area of all figures is: %.2f\n", generalArea);
	}

}
