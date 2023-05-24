package linklist.singly;

import java.util.*;
public class singly {
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
            System.out.println("Enter the Data in list: ");
            int data = rk.nextInt();
            
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to Enter more Data in list (if yes press 7): ");
            n = rk.nextInt();
        } while (n == 7);

    }
    void traverse(){
        
        if(head==null){
            System.out.println("Link List Doesnot exist.");
        }
        else{
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
     singly rz=new singly() ;
     rz.creation();
     rz.traverse();  
        
    }

}
