import java.util.*;
class OneD_Array
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// one-D array declarations
		System.out.println("enter the size of and array");
		int size=sc.nextInt();
		// syntax:
		// return_type[] var=new return_type[size];
		String subject[] = new String[size];
		for(int i=0;i<size;i++){
			subject[i]=sc.next();
		}
		for(int i=0;i<size;i++){
			System.out.println("the elements in array are:");
			System.out.println(subject[i]);
		}
	}

}