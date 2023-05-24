import java.util.*;
public class binary2deimal {
    public static void main(String[]args)
     {
        Scanner rk =new Scanner(System.in);
        System.out.println("Enter the Binary Number(upto 8bits) to Convert in Decimal: ");
        int a=rk.nextInt();
        int c=a;
        int i=0;
        double dec=0;
        int rem=0;
        while(a!=0)
        {
            rem=a%10;
            a=a/10;
            dec=dec+ (rem* Math.pow(2,i));
            ++i;
        }
        System.out.println("Binary to Decimal");
        System.out.println(c + "  = " + dec);
            rk.close();
    }
}
