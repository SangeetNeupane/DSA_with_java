package teach.singly;
import java .util.*;
public class position_singly {
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    node  head=null;
    
    void creation()
    {
        int n;
        do{
        Scanner rk =new Scanner (System.in);
        System.out.println("\nEnter the position :-");
        int p=rk.nextInt();
        System.out.println("Enter the data:-");
        int data=rk.nextInt();
        node new_node=new node(data);
        if(head==null)
        {
            head=new_node;
        }
        else if(p==1){
            new_node.next=head;
            head=new_node;
        } 
        else{
            node temp=head;
            for(int i=1;i<(p-1);i++)
            {
             temp=temp.next;   
            }
            if(temp==null)
            {
                System.out.println("Insertion Failed");
            }
            else{
                new_node.next=temp.next;
                temp.next=new_node;
            }
        }
        System.out.println("you want to enter the data again then press 1 else press  0");
        n=rk.nextInt();
    }while(n==1);

    }
    void traverse()
    {
        if(head==null)
        {
            System.out.println("Link List is empty");

        }
        else{
            node temp=head;
            System.out.println("Link List data are:-");
            while(temp!=null)
            {

                System.out.print("["+temp.data+"]");
                temp=temp.next;
            }
        }

    }
    public static void main(String[]args)
    {
        position_singly rz=new position_singly();
        rz.creation();
        rz.traverse();
        rz.creation();
        rz.traverse();
    }
    
}
