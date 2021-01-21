package assignment.com;

public class Exception {

	public static void main(String[] args) {
		
		try {
			int c= 10/0;

		}
		catch (ArithmeticException e) {
			System.out.println(e);
			}
		
		finally {
			System.out.println("In final");
		}
	}
}
