import java.util.*;
public class overflow {

	public static void main(String[] args)
	{
		Scanner rz =new Scanner(System.in);
		int a[]=new int[10];
		int n;
		int i;
		System.out.println("Enter the number to convert");
		n=rz.nextInt();
		rz.close();
		for(i=0;n>0;i++)
		{
			a[i]=n%2;
			n=n/2;
		}
		if(i<8)
		{
			System.out.println("Binary Of Given Number:-");
			for(i=i-1;i>=0;i--)
			{
				System.out.print(a[i]);
			}
		}
		else
		{
			System.out.println("Overflow Occured.");
			System.out.println("Binary Of Given Number:-");
			for(i=i-1;i>=0;i--)
			{
				System.out.print(a[i]);
			}
		}
		
	}

}
