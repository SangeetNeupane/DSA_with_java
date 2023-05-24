package linklist.singly;

import java.util.*;
public class insertion_end_singly {
    
    static class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    node head = null;
    void creation() {
        int n;
        do {
            Scanner rk = new Scanner(System.in);
            System.out.println("Enter the  Data in list: ");
            int data = rk.nextInt();
           
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=new_node;
            }
            System.out.println("Do you want to Enter more Data at end in list (if yes press 7): ");
            n = rk.nextInt();
        } while (n == 7);

    }
    void traverse(){
        
        if(head==null){
            System.out.println("Link List Doesnot exist.");
        }
        else
        {
            node temp;
            temp=head;
            System.out.println("Data in Link List are:-");
            while(temp!=null)
            {
                System.out.print("["+temp.data +"] ");
                temp=temp.next;
            }
            
        }
    }
    
    public static void main(String[] args) {
        insertion_end_singly rz=new insertion_end_singly() ;
     rz.creation();
     rz.traverse();  
        
    }
}
