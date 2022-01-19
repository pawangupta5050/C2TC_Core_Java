package Core_Java;

public class ExceptionHandlingDemo3 {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int p=3;
		int[]x=new int[4];
		try
		{
			if(b==0)
				throw new ArithmeticException("this  arithmetic exception");
			else
				a=a/b;
			x[p]=5;
			{System.out.println("AE"+x[p]);}
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("AE hello");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("AE ");
		}

	
	}

}
