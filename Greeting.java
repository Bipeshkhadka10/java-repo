import java.util.*;
class Greeting
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number?");
		int num= sc.nextInt();
		switch(num) {
			case 1: {
				System.out.println("Hello");
				break;
			}
			case 2: {
				System.out.println("Namesta");
				break;
			}
			case 3: {
				System.out.println("boujaure");
				break;
			}
			default : System.out.println("Invalid number");
		}
	}

}
