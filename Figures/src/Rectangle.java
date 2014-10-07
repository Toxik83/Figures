
public class Rectangle implements Figure {
	double a, b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double calcSurface() {
		return a * b;

	}

	public double calcPerimeter() {
		return (2 * a + 2 * b);

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Quadrangle";
	}

	@Override
	public int getSides() {
		// TODO Auto-generated method stub
		return 4;
	}

}
