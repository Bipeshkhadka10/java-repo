import java.util.*;

import javax.sound.midi.SysexMessage;
class Fibonacci
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        int  n =20;
       System.out.println("the fibonaccis of " + n + " sum is "  + fibonacci(n)); 

    }
    public static int fibonacci(int n){
        int i=0;
        int firstTerm=0;
        int secondTerm=1;
        int nextTerm;
        do {  
            nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            i++;
            System.out.println(nextTerm);
        }while(i<n);
        return nextTerm;
    }
}