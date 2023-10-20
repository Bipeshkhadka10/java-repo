import java.util.*;
class MyFactorial
{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Drop the number whose factorial is to be found ?");
		// int n = sc.nextInt();
		int n = 99;
		int factorial=factorial(n);
		System.out.println("the factorial of given number is :"+factorial);
		
	}
	public static int factorial(int n){
		int factorial=1;
		if(n==0){
			System.out.println("the factorial is 0");
		}
		else if(n<0){
			System.out.println("invalid number");
		}
		for(int i=1;i<=n;i++){
			factorial = factorial * i;
		}
		System.out.println(factorial);
		
		return factorial;
		
	}


}