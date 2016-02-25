package app;

public class Square implements AreaInterface {
	private double side;
	
	public Square() {}
	
	public Square(double sideLen) {
		this.side = sideLen;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double calculateArea() {
		return this.side * 2;
	}
}
