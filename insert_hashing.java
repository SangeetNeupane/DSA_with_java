import java.util.*;
class insert{
    int a[]=new int[50];
    int i=0;
    int size;

    insert(int b)
    {
        size=b;
        for(i=0;i<size;i++)
        {
            a[i]=-1;
        }
       
        
    }
    
    void input(int c)
    {
       for(i=0;i<size;i++)
       { 
        if(a[i]==-1)
        {
            a[i]=c;
            break;
        }
       }
    }
    void display()
    {
        for(i=0;i<size;i++)
        { 
            System.out.println("["+a[i]+"]");
        }
    }

}
public class insert_hashing {
       public static void main(String[]args)
    {
        Scanner rz=new Scanner(System.in);
        System.out.println("How many hask key you wanna insert ?");
        int a=rz.nextInt();
        insert rk=new insert(a);
        int b[]=new int[a];
        System.out.println("Enter the hask key you wanna insert ?");
        for(int i=0;i<a;i++)
        { 
            b[i]=rz.nextInt();
        }
        
        for(int i=0;i<a;i++)
        { 
           rk.input(b[i]);
        }
        rk.display();
        rz.close();

    }
    
}
