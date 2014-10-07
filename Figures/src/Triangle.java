
public class Triangle implements Figure {
	double a, h;

	public Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Triangle";
	}

	@Override
	public int getSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	public double calcSurface() {
		// TODO Auto-generated method stub
		return (a * h) / 2;
	}

	public double calcPerimeter() {
		return a * 3;
	}

}
