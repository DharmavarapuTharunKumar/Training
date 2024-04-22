package exception;
//import java.lang.ArrayIndexOutOfBoundsException;
public class ExceptionFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = {1,2,3,4,5};
			System.out.println(a[0]);
			int result = 10/0;
			String s = null;
			s.length();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index bahar ho gaya mr "+ ae.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Null aara hai mr "+ e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Maths gadbad ho gaya mr "+ e.getMessage());
		}
		finally {
			System.out.println("Ok tata bye bye phirse aana ");
		}
	}

}
