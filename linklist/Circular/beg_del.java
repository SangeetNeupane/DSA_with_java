package linklist.Circular;

import java.util.*;

public class beg_del {
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

    void creation() {
        int n;
        Scanner rk = new Scanner(System.in);
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
        head=head.next;
        tail.next=head;
        System.out.println("\nAfter delete from Begining  in Link List ");
    }

    public static void main(String[] args) {
        beg_del rz = new beg_del();
        rz.creation();
        rz.traverse();
        rz.delete();
        rz.traverse();
    }

}
