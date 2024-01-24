package java8features;

@FunctionalInterface
interface CalPercentage{
	double percentage(double m1, double m2, double m3);
}
//created by Rincy banu
public class Question4 {

	public static void main(String[] args) {
		CalPercentage p = (a1, a2, a3) -> (a1+ a2+ a3)/3;
		System.out.println("percentage : "+p.percentage(78, 77, 66));

	}

}
