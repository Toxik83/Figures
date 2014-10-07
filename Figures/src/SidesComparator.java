import java.util.Comparator;

public class SidesComparator implements Comparator<Figure> {

	@Override
	public int compare(Figure figure1, Figure figure2) {

		if (figure2 == figure1)
			return 0;

		if (null == figure1 || null == figure2)
			return 0;

		if (figure1.getSides() > figure2.getSides())
			return 1;
		else if (figure1.getSides() == figure2.getSides())
			return 0;
		else
			return -1;

	}

}
