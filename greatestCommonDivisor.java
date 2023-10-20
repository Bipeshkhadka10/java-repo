import java.util.*;
class greatestCommonDivisor
{
    public static void main(String[] args){
       // Scanner sc= new Scanner(System.in);
        // int x=sc.nextInt();
       // int y=sc.nextInt();
       int x=4;
       int y= 5; 
       gcd(x,y);
    }
    public static void gcd(int x, int y){
        int gcd =1;
        int num=2;
        if(x%num==0 && y%num==0){
           System.out.println("gcd is "+num);
        }
        else{
            System.out.println("the gcd of "+ x + " and " + y + " is " +gcd);            
        }
    }

}