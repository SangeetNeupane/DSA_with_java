package linklist.Circular;

import java.util.*;

public class position_del_circular {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;
    node tail = null;
    Scanner rk = new Scanner(System.in);
    void creation() {
        int n;
        
        do {

            System.out.println("Enter the Data in list: ");
            int data = rk.nextInt();

            node new_node = new node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
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
            }while (temp != head) ;

        }
    }
    void delete()
    {
        System.out.println("\nEnter the position to delete:");
        int del=rk.nextInt();
        node temp=head;
        node ptr=temp.next;
        for(int i=1;i<(del-1);i++){
            temp = ptr;
            ptr=ptr.next;

        }

        temp.next=ptr.next;

        
        System.out.println("\nAfter data  deletion in Link List ");
    }

    public static void main(String[] args) {
        position_del_circular rz = new position_del_circular();
        rz.creation();
        rz.traverse();
        rz.delete();
        rz.traverse();
    }

}
