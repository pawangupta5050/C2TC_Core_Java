package Core_Java;
import java.util.Scanner;
public class ExceptionHandlingDemo2 {
	static void validate(int age)
	{if (age < 18)
		throw new ArithmeticException("not valid");

	else 
		System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("plz enter age");
		int age = sc.nextInt();
		try {
			validate(age);
}catch(Exception e){System.out.println(e.getMessage());

	}

}

}
