import java.util.*;
public class Check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked!");
        //int n = sc.nextInt();
        int n =5;
       MYNumber(n);
    }
    public static void MYNumber(int n){
        if(n>0){
            System.out.println("positive");
        }
        else if(n<0){
            System.out.print("negative");
        }
        else{
            System.out.println("zero");
        }
        
    }
}
