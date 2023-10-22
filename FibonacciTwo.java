import java.util.*;

import javax.sound.midi.SysexMessage;
class FibonacciTwo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        int  n =20;
        int num;
        for(int i=0;i<n;i++){
            num=fibonacci(n);
			System.out.println(num);
        }
       System.out.println("the fibonaccis of " + n + " sum is "  + fibonacci(n)); 

    }
    public static int fibonacci(int n){
        int i=0;
       if(n==0){
			return 0;
	   }
	   else if(n==1){
		   return 1;
	   }
	   else{
		   return(fibonacci(n-1)+fibonacci(n-2));
	   }
    }
}