package Core_Java;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try
		{
			int a;
			a=25;
			int sum=a/0;
			System.out.println("in try block");
			int data=100/0;
		}

		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			e.getMessage();
			System.out.println("in catch block");
		}
		System.out.println("hiiii");

	}

}
