public class OperatorsWithParenthesis02 {

	public static void main(String[] args) {

		float a = 10.5F, b = 5.0F, d = 15.5F;

		double firstResult = 3 * b - a / d;

		System.out.println("3 * b - a / d = " + firstResult);

		double secondResult = (3 * b - a) / d;

		System.out.println("(3 * b - a) / d = " + secondResult);


	}

}				