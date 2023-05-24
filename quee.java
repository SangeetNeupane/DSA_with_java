class line{
    int r=-1;
    int f=0;
    int size;
    int a[];
    int d=0;
    line(int s)
    {
        a=new int [s];
        size=s;
    }
    void enque(int b)
    {
        r++;
        if(r>=size)
        {
            System.out.println("Quee is Full");
            r--;
        }
        else
        {
            a[r]=b;
            System.out.println("Data is enque : "+b);
        }
    }
    void denque()
    {
        f=0;
        if(r==-1)
        {
            System.out.println("Quee is Empty"); 
        }
        else
        {
            System.out.println("Data is denque : "+a[f]);   
            for(f=0;f<r;f++)
            {
                a[f]=a[f+1];

            }
            r--;
        }
    }
    void display()
    {
        for(f=0;f<=r;f++)
            {
        System.out.print("["+a[f]+"]");
            }

    }
    
    void search(int c)
    {
        System.out.println("");
        if(r==-1)
        {
            System.out.println("Quee is Empty"); 
        }
        else
        {
            for(f=0;f<=r;f++)
            {
                if(a[f]==c)
                {
                   d=1; 
                   break; 
                }
                
            }
            if(d==1)
            {
                System.out.println(a[f]+" is present on Quee on index "+f); 
            }
            else
                {
                    System.out.println("Data is not present on Quee.");
                }
        }

        
    }

}


public class quee {
    public static void main(String[]args)
    {
        line rz = new line(7);
        rz.enque(2);
        rz.enque(6);
        rz.enque(4);
        rz.enque(8);
        rz.enque(7);
        rz.enque(5);
        rz.enque(1);
        rz.enque(3);
        rz.denque();
        rz.enque(7);
        rz.display();
        rz.search(7);

    }
}
