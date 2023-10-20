import java.util.*;

class Personal
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first character from A to Z or a to z");
		String first= sc.next();
		System.out.println("enter yout name");
		String name= sc.next();
		System.out.println("your age");
		String age= sc.next();
		System.out.println("your income");
		String income= sc.next();
		System.out.println("public figure as");
		String commonName= sc.next();
		System.out.println("\n----******----");
		System.out.println(first);
		System.out.println("Name :" +name);
		System.out.println("age : " +age);
		System.out.println("Income :" +income);
		System.out.println("publicFigure :" +commonName);
	}

}
