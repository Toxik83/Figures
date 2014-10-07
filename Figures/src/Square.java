
public class Square implements Figure {
	double a;

	public Square(double a) {
		this.a = a;
	}

	public double calcSurface() {
		return a * a;

	}

	public double calcPerimeter() {
		return 4 * a;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Square";
	}

	@Override
	public int getSides() {
		// TODO Auto-generated method stub
		return 4;
	}

}
