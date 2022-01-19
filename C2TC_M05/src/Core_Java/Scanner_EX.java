package Core_Java;
import java.util.*;
public class Scanner_EX {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	

	System.out.println("sum is "+(a+b));
	Scanner_EX obj=new Scanner_EX();
	System.out.println(sc.getClass());
	System.out.println(obj.hashCode());
	System.out.println(obj.getClass());
}

}
