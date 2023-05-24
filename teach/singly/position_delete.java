package teach.singly;

import java.util.*;

public class position_delete {
    Scanner rz = new Scanner(System.in);
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

    void traverse() {
        if (head == null) {
            System.out.println("Link List Is Empty");
        } else {
            node temp = head;
            System.out.println("Link List data are:-");
            while (temp != null) {
                System.out.print("[" + temp.data + "] ");
                temp = temp.next;
            }
        }
    }
    void delete(){
        System. out .println("\nEnter the position to delete:-");
        int del=rz.nextInt();
        node temp=head;
        node ptr=temp.next;
        for(int i=1;i<(del-1);i++)
        {
            temp=temp.next;
            ptr=temp.next;
        }
        temp.next=ptr.next;
        System.out.println("\nData after deletion.");
    }

    public static void main(String[] args) {
        position_delete rk = new position_delete();
        rk.creation();
        rk.traverse();
        rk.delete();
        rk.traverse();
    }

}
