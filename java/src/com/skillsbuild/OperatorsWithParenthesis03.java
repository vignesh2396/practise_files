public class OperatorsWithParenthesis03 {

	public static void main(String[] args) {

		float a = 10.5F, b = 5.0F, c = 0.0F, d = 15.5F;

		boolean result = (a > b) || (c < d);

		System.out.println("(a > b) || (c < d) : " + result);

		boolean newResult = !(c >= b) || a < d;

		System.out.println("!(c >= b) || a < d : " + newResult);

		boolean newResultValue = a < d && (a >= b);

		System.out.println(" a < d && (a >= b) : " + newResultValue);


	}

}				