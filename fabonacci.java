import java.util.*;
public class fabonacci {

	public static void main(String[] args) {
		
		Scanner rz=new Scanner(System.in);
		System.out.println(" Enter the number of terms of the Fibonacci Series:");
		
		 int n =rz.nextInt();
		 int arr[]=new int[n];
		 int a= 0, b= 1, c ;
		for (int i = 0; i < n; i++)
		   {
		     arr[i]=a;
		      c = a + b;
		      a = b;
		      b = c;
		   }
           for (int i = 0; i < n; i++)
		   {
            System.out.print("["+arr[i]+"]");
           }
           System.out.println();
		   System.out.print("The fourth element of  Fabonacci Series is "+arr[3]);
           rz.close();
        }


}
