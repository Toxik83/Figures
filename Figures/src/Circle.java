
public class Circle implements Figure {
	public static final double PI = 3.14;
	double r;

	public Circle(double r) {
		this.r = r;
	}

	public double calcSurface() {
		return PI * r * r;
	}

	public double Perimeter() {
		return 2 * PI * r;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Circle";
	}

	@Override
	public int getSides() {
		// TODO Auto-generated method stub
		return 0;
	}

}
