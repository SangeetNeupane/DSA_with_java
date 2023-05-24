class array1
{
    int arr[];
    int t=-1;
    int size;
    int d=0;
    int i=0;
    array1(int a)
    {
        arr=new int [a];
        size=a;
    }
    void push(int b)
    {
        t++;
        if(t>=size)
        {
            System.out.println("Stack Is Full");
            t--;
        }
        else
        {
            arr[t]=b;
            System.out.println("Pushed Data: "+b);
        }
    }
    void pop()
    {
        if(t<0)
        {
            System.out.println("Stack Is Empty");
        }
        else
        {
            int c=arr[t];
            System.out.println("Poped Data: "+c);
        }
        t--;
    }
    void peek()
    {
        if(t<0)
        {
            System.out.println("Stack Is Empty");
        }
        else
        {
        System.out.println("Peeked Data: "+arr[t]);
        }
    }
    void display()
    {
        for(i=0;i<=t;i++)
            {
        System.out.print("["+arr[i]+"]");
            }

    }
    void search(int c)
    {
        System.out.println("");
        if(t<-1)
        {
            System.out.println("Quee is Empty"); 
        }
        else
        {
            for( i=0;i<=t;i++)
            {
                if(arr[i]==c)
                {
                   d=1; 
                   break; 
                }
                
            }
            if(d==1)
            {
                System.out.println(arr[i]+" is present on Quee on index "+i); 
            }
            else
                {
                    System.out.println("Data is not present on Quee.");
                }
        }

        
    }
}
public class stacks {
    public static void main(String[]args)
    {
        array1 rz=new array1(5);
        rz.push(5);
        rz.push(6);
        rz.push(9);
        rz.push(2);
        rz.pop();
        rz.peek();
        rz.pop();
        rz.push(7);
        rz.pop();
        rz.push(8);
        rz.display();
       rz.search(8);
    }
}