import java.util.*;
class Conditional
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Drop your age?");
		int age= sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are an adult.");			
		}
		else
		{
			System.out.println("you are under age.");
		}
	}

}
