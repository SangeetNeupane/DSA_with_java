package teach.singly;

import java.util.*;

public class create_singly {
    static class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    node head = null;

    void creation() {
        int n = 1;
        do {
            Scanner rz = new Scanner(System.in);
            System.out.println("Enter the data:-");
            int data = rz.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("If You want to enter the data more in linklist (If Yes Press 1 else Press 0):-");
            n = rz.nextInt();
        } while (n == 1);
    }
    void traverse()
    {
        if(head==null)
        {
            System.out.println("Link List Is Empty");
        }
        else{
            node temp=head;
            System.out.println("Link List data are:-");
            while(temp!=null)
            {
                System.out.print("["+temp.data+"] ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[]args)
{
    create_singly rk=new create_singly();
    rk.creation();
    rk.traverse();
}

}
