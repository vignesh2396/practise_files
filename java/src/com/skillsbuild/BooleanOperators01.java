public class BooleanOperators01 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		boolean X = true;
		boolean Y = false;

		System.out.println("X == true : " + (X == true));

		System.out.println("X == false : " + (X == false));

		System.out.println("X != false : " + (X != false));

		System.out.println("Y == true : " + (Y == true));

		System.out.println("Y != true : " + (Y != true));

		System.out.println("Y == false : " + (Y == false));

		System.out.println("a > b == X : " + (a > b == X));

		System.out.println("a > b == true : " + (a > b == true));

		System.out.println("a > b : " + (a > b));

		System.out.println("a > b != X : " + (a > b != X));

		System.out.println("a < b == X : " + (a < b == X));

		System.out.println("a < b == true : " + (a < b == true));

		System.out.println("a < b == Y : " + (a < b == Y));

		System.out.println("a >= b == Y : " + (a >= b == Y));

		System.out.println("a >= b == !Y : " + (a >= b == !Y));

		System.out.println("a <= b == !X : " + (a <= b == !X));

	}

}																														