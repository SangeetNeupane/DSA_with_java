package linklist.singly;

import java.util.*;

public class insertion_position_singly {
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
        int n, p = 0;
        do {
            Scanner rk = new Scanner(System.in);
            System.out.println("\nEnter the position to insert: ");
            p = rk.nextInt();
            System.out.println("Enter the data to insert: ");
            int data = rk.nextInt();

            node new_node = new node(data);

            if (head == null) {
                head = new_node;
            } else if (p == 1) {
                new_node.next = head;
                head = new_node;
            } else {

                node temp = head;
                for (int i = 1; i < (p - 1) && temp != null; i++) {
                    temp = temp.next;

                }
                if (temp == null) {
                    System.out.println("Invalid position. Element can't be inserted.");
                } else {
                    new_node.next = temp.next;
                    temp.next = new_node;
                }
            }
            
            System.out.println("Do you want to enter more data in the list? (if yes press 7): ");
            n = rk.nextInt();
        } while (n == 7 );
    }

    void traverse() {

        if (head == null) {
            System.out.println("Link List Doesnot exist.");
        } else {
            node temp;
            temp = head;
            System.out.println("Data in Link List are:-");
            while (temp != null) {
                System.out.print("[" + temp.data + "] ");
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {
        insertion_position_singly rz = new insertion_position_singly();
        rz.creation();
        rz.traverse();
        rz.creation();
        rz.traverse();
    }

}
