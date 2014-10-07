import java.util.ArrayList;
import java.util.Collections;

public class CompareBySides {

	public static void main(String[] args) {
		ArrayList<Figure> figures = new ArrayList<Figure>();

		Figure square1 = new Square(4);
		figures.add(square1);

		Figure circle1 = new Circle(5);
		figures.add(circle1);

		Figure triangle1 = new Triangle(3, 2);
		figures.add(triangle1);

		Figure rectangle1 = new Rectangle(10, 7);
		figures.add(rectangle1);

		for (int i = 0; i < figures.size(); i++) {
			System.out.println("Type : " + figures.get(i).getName()
					+ " sides : " + figures.get(i).getSides());
		}

		SidesComparator comparator = new SidesComparator();
		Collections.sort(figures, comparator);

		System.out.println("The figures after comparator:");
		for (int i = 0; i < figures.size(); i++) {
			System.out.println("Type : " + figures.get(i).getName()
					+ " sides : " + figures.get(i).getSides());
		}

	}
}
