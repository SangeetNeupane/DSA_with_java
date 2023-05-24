package linklist.Circular;

import java.util.*;

public class position_circular {
    
    static class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    } 

    node head = null;
    node tail = null;

    void creation() {
        int n;
        do {
            Scanner rk = new Scanner(System.in);

            System.out.println("\nEnter the position:-");
            int p = rk.nextInt();
            System.out.println("Enter the data:-");
            int data = rk.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
                tail = head;
            } else if (p == 1) {
                new_node.next = head;
                head = new_node;
                tail.next = head;

            } else {
                node temp = head;
                node ptr=temp.next;
                for(int i=1;i<p-1;i++)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                new_node.next=ptr;
                temp.next=new_node;
                
            }
            System.out.println("Do you want to Enter more Data in list (if yes press 7): ");
            n = rk.nextInt();
        } while (n == 7);

    }
    void traverse() {

        if (head == null) {
            System.out.println("Link List Doesnot exist.");
        } else {
            node temp;
            temp = head;
            System.out.println("Data in Link List are:-");
            do{
                System.out.print("[" + temp.data + "] ");
                temp = temp.next;
            }while (temp != head && temp!=null) ;

        }
    }

    public static void main(String[] args) {
        position_circular rz=new position_circular();
        rz.creation();
        rz.traverse();
        rz.creation();
        rz.traverse();
    }

}
