package Core_Java;

public class ExceptionHandlingDemo1 {
	public static void main(String[] args) {
		int[] arr=new int [4];
		int a=45;
		int b=12;
	try {
		arr[11]=35;
		int c=a/5;
		System.out.println("in try block"  +c);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		ae.printStackTrace();
		System.out.println("Exception in try block"+a/b);
		
	}
	catch(ArithmeticException ae) 
	{
		//ae.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
finally
      {
	System.out.println("in final block");
	  }
	System.out.println("in the class");

}

}
