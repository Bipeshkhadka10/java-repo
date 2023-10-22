import java.util.*;
class TwoD_ArrayCheck
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// one-D array declarations
		System.out.println("enter the size of and array");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int x=sc.nextInt();
		// syntax:
		// return_type[][] var=new return_type[i][j];
		int matrix[][] = new int[row][col];
		for(int i=0;i<row;i++){
			
			for(int j=0;j<col;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(matrix[i][j]==x){
					System.out.println("the required number is in the matrix");
				}
				System.out.println("the elements in array are:");
				System.out.println(matrix[i][j]);
			}
		}
	}

}