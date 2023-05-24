class haddi{
    int size;
    int arr[];
    int r=-1;
    int f;
    haddi(int a)
    {
        arr=new int [a];
        size=a;
    }
    void enqueue(int b)
    {
        r++;
        if(r>=size)
        {
            System.out.println("Queue is Full");
            r--;
        }
        else{
            arr[r]=b;
            System.out.println(" Data EnQueue= "+b);
        }
    }
    void dequeue()
    {
        f=0;
        if(r==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Data is Dequeue is "+arr[f]);
            for(f=0;f<r;f++)
            {
                arr[f]=arr[f+1];
            }
            r--;
        }

    }
    void display()
    {
        for(f=0;f<=r;f++)
        {
            System.out.print(arr[f]+" " );
          }
    }
    
}
public class examQueue {
    public static void main(String[]args)
    {
        haddi rz=new haddi(50);
        rz.dequeue();
        rz.enqueue(5);
        rz.enqueue(6);
        rz.enqueue(7);
        rz.dequeue();
        rz.display();
    }
}
